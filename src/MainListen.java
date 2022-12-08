import java.util.LinkedList;
import java.util.Objects;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class MainListen extends CalculatorBaseListener {

    private final LinkedList<Double> firstStack = new LinkedList<>();
    private final LinkedList<Double> secondStack = new LinkedList<>();


    public Double getResult() {
        System.out.println("Result");
       return  secondStack.pop();
    }
    @Override
    public void exitExpre(CalculatorParser.ExpreContext ctx) {
        Double result = secondStack.removeLast();
        for (int i = 1; i < ctx.getChildCount(); i = i + 2) {
            if (symbolEquals(ctx.getChild(i), CalculatorParser.PLUS)) {
                result += secondStack.removeLast();
            } else {
                result = result-secondStack.removeLast();
            }
        }
        secondStack.push(result);
        System.out.println("Expression: \"" + ctx.getText() + "\" -> "+result);
    }

    @Override
    public void exitMultdivexpression(CalculatorParser.MultdivexpressionContext ctx) {
        Double result = firstStack.removeLast();
        for (int i = ctx.getChildCount() - 2; i >= 1; i = i - 2) {
            if (symbolEquals(ctx.getChild(i), CalculatorParser.TIMES)) {
                result = firstStack.removeLast() * result;
            } else {
                result = firstStack.removeLast() / result;
            }
        }
        secondStack.push(result);
        System.out.println("Expression: \"" + ctx.getText() + "\" -> "+result);
    }
    private boolean symbolEquals(ParseTree child, int symbol) {
        return ((TerminalNode) child).getSymbol().getType() == symbol;
    }
    @Override
    public void exitPowerexpression(CalculatorParser.PowerexpressionContext ctx) {

        double result = firstStack.removeLast();
        for (int i = ctx.getChildCount() - 2; i >= 1; i = i - 2) {
            if (symbolEquals(ctx.getChild(i), CalculatorParser.POV)) {
                result = Math.pow(firstStack.removeLast(),result);
            }
        }
        firstStack.push( result);
        System.out.println("Expression: \"" + ctx.getText() + "\" -> "+result);
    }

    @Override public void exitDefult_func(CalculatorParser.Defult_funcContext ctx) {
        double result = firstStack.pop();
            if(ctx.funcname()!=null) {
                for (int i = ctx.getChildCount(); i >= 1; i = i - 2) {
                    if (Objects.equals(ctx.funcname().getChild(i - 2).getText(), ctx.getChild(i - 2).getText())) {
                        if(ctx.funcname().COS()!=null) result=Math.cos(result);
                        if(ctx.funcname().SIN()!=null) result=Math.sin(result);
                        if(ctx.funcname().TAN()!=null) result=Math.tan(result);
                        if(ctx.funcname().ACOS()!=null) result=Math.acos(result);
                        if(ctx.funcname().ASIN()!=null) result=Math.asin(result);
                        if(ctx.funcname().ATAN()!=null) result=Math.atan(result);
                        if(ctx.funcname().LOG ()!=null) result=Math.log(result);
                        if(ctx.funcname().SQRT ()!=null) result=Math.sqrt(result);
                        if(ctx.funcname().PI ()!=null) result=result * Math.PI;
                    }
                }
            }
        System.out.println("Expression: \"" + ctx.getText() + "\" -> "+result);
        firstStack.push(result);

    }

    @Override
    public void exitNumbers(CalculatorParser.NumbersContext ctx) {
        double value = Double.parseDouble(ctx.NUMBER().getText());
        if (ctx.MINUS() != null){
            firstStack.push(-1 * value);
        }else {
            firstStack.push(value);
        }
        System.out.println("NumberExpression: \"" + ctx.getText() + "\" ");
    }



    public static void main(String[] args) throws Exception {
        CharStream charStreams = CharStreams.fromFileName("src\\example.txt");
        CalculatorLexer lexer = new CalculatorLexer(charStreams);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        //System.out.println(tokens.getText());

        CalculatorParser parser = new CalculatorParser(tokens);
        ParseTree tree = parser.expression(); // parse

        ParseTreeWalker walker = new ParseTreeWalker();
        MainListen listener = new MainListen();
        walker.walk(listener, tree);
        System.out.println(listener.getResult());
    }


}
