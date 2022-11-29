// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculatorParser}.
 */
public interface CalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CalculatorParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CalculatorParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyingExpression(CalculatorParser.MultiplyingExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyingExpression(CalculatorParser.MultiplyingExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#povsqrExpression}.
	 * @param ctx the parse tree
	 */
	void enterPovsqrExpression(CalculatorParser.PovsqrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#povsqrExpression}.
	 * @param ctx the parse tree
	 */
	void exitPovsqrExpression(CalculatorParser.PovsqrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#sing_simple}.
	 * @param ctx the parse tree
	 */
	void enterSing_simple(CalculatorParser.Sing_simpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#sing_simple}.
	 * @param ctx the parse tree
	 */
	void exitSing_simple(CalculatorParser.Sing_simpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#simple}.
	 * @param ctx the parse tree
	 */
	void enterSimple(CalculatorParser.SimpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#simple}.
	 * @param ctx the parse tree
	 */
	void exitSimple(CalculatorParser.SimpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#funcname}.
	 * @param ctx the parse tree
	 */
	void enterFuncname(CalculatorParser.FuncnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#funcname}.
	 * @param ctx the parse tree
	 */
	void exitFuncname(CalculatorParser.FuncnameContext ctx);
}