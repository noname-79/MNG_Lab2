import java.util.LinkedList;
import java.util.Objects;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


public class MainListen extends CalculatorBaseListener {

    private final LinkedList<Double> firstStack = new LinkedList<>();
    private final LinkedList<Double> secondStack = new LinkedList<>();

    public Double getResult() {
        return secondStack.pop();
    }

    private boolean symbolEquals(ParseTree child, int symbol) {
        return ((TerminalNode) child).getSymbol().getType() == symbol;
    }

    @Override
    public void exitExpression(CalculatorParser.ExpressionContext ctx) {
        Double result = secondStack.removeLast();
        for (int i = 1; i < ctx.getChildCount(); i = i + 2) {
            if (symbolEquals(ctx.getChild(i), CalculatorParser.PLUS)) {
                result += secondStack.removeLast();
            } else {
                result = result - secondStack.removeLast();
            }
        }
        secondStack.push(result);
        System.out.println("Expression: \"" + ctx.getText() + "\" -> " + result);
    }

    @Override
    public void exitMultiplyingExpression(CalculatorParser.MultiplyingExpressionContext ctx) {
        Double result = firstStack.removeLast();
        for (int i = ctx.getChildCount() - 2; i >= 1; i = i - 2) {
            if (symbolEquals(ctx.getChild(i), CalculatorParser.TIMES)) {
                result = firstStack.removeLast() * result;
            } else if (symbolEquals(ctx.getChild(i), CalculatorParser.DIV)) {
                result = firstStack.removeLast() / result;
            } else {
                result = firstStack.removeLast() % result;
            }
        }
        secondStack.push(result);
        System.out.println("Expression: \"" + ctx.getText() + "\" -> " + result);

    }

    @Override
    public void exitPovsqrExpression(CalculatorParser.PovsqrExpressionContext ctx) {

        double result = firstStack.removeLast();
        if (ctx.SQRT() == null) {
            for (int i = ctx.getChildCount() - 2; i >= 1; i = i - 2) {
                if (symbolEquals(ctx.getChild(i), CalculatorParser.POV)) {
                    result = Math.pow(firstStack.removeLast(), result);
                }
            }
        } else {
            if (symbolEquals(ctx.getChild(0), CalculatorParser.SQRT)) {
                result = Math.sqrt(result);
            }
        }
        firstStack.push(result);
        System.out.println("Expression: \"" + ctx.getText() + "\" -> " + result);
    }


    @Override
    public void exitSing_simple(CalculatorParser.Sing_simpleContext ctx) {

        double result = firstStack.removeLast();

        if (ctx.MINUS() != null) {
            result = result * -1;
        }

        if (ctx.funcname() != null) {
            for (int i = ctx.getChildCount(); i >= 1; i = i - 2) {
                if (Objects.equals(ctx.funcname().getChild(i - 2).getText(), ctx.getChild(i - 2).getText())) {
                    if (ctx.funcname().COS() != null) result = Math.cos(result);
                    if (ctx.funcname().SIN() != null) result = Math.sin(result);
                    if (ctx.funcname().TAN() != null) result = Math.tan(result);
                    if (ctx.funcname().ACOS() != null) result = Math.acos(result);
                    if (ctx.funcname().ASIN() != null) result = Math.asin(result);
                    if (ctx.funcname().ATAN() != null) result = Math.atan(result);
                    if (ctx.funcname().LOG() != null) result = Math.log(result);
                    if (ctx.funcname().PI() != null) result = result * Math.PI;
                    if (ctx.funcname().E() != null) result = result * Math.E;
                }
            }
        }
        System.out.println("Expression: \"" + ctx.getText() + "\" -> " + result);
        firstStack.push(result);
    }


    @Override
    public void exitSimple(CalculatorParser.SimpleContext ctx) {
        if (ctx.FLOAT() != null) {
            double value = Double.parseDouble(ctx.FLOAT().getText());
            firstStack.push(value);
            System.out.println("Float:" + value);
        } else {
            double value = Integer.parseInt(ctx.INT().getText());
            firstStack.push(value);
            System.out.println("INT:" + value);
        }
    }

    public static Double calc(CharStream charStream) {
        CalculatorLexer lexer = new CalculatorLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        System.out.println(tokens.getText());

        CalculatorParser parser = new CalculatorParser(tokens);
        ParseTree tree = parser.expression();

        ParseTreeWalker walker = new ParseTreeWalker();
        MainListen calculatorListener = new MainListen();
        walker.walk(calculatorListener, tree);
        return calculatorListener.getResult();
    }

    public static Double calc(String expression) {
        return calc(CharStreams.fromString(expression));
    }

    public static void main(String[] args) throws Exception {
        CharStream charStreams = CharStreams.fromFileName("src\\example.txt");
        Double result = calc(charStreams);
        System.out.println("Result = " + result);
    }


}