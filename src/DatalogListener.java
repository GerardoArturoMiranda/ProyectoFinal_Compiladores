// Generated from /Users/manuelortiz/Mac Documents/Tec/8vo ZoomSemestre/Diseño de Compiladores/Proyecto Final/ProyectoFinal_Compiladores/src/Datalog.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DatalogParser}.
 */
public interface DatalogListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DatalogParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(DatalogParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(DatalogParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#fact}.
	 * @param ctx the parse tree
	 */
	void enterFact(DatalogParser.FactContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#fact}.
	 * @param ctx the parse tree
	 */
	void exitFact(DatalogParser.FactContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#literalList}.
	 * @param ctx the parse tree
	 */
	void enterLiteralList(DatalogParser.LiteralListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#literalList}.
	 * @param ctx the parse tree
	 */
	void exitLiteralList(DatalogParser.LiteralListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#facts}.
	 * @param ctx the parse tree
	 */
	void enterFacts(DatalogParser.FactsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#facts}.
	 * @param ctx the parse tree
	 */
	void exitFacts(DatalogParser.FactsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#rule}.
	 * @param ctx the parse tree
	 */
	void enterRule(DatalogParser.RuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#rule}.
	 * @param ctx the parse tree
	 */
	void exitRule(DatalogParser.RuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#rules}.
	 * @param ctx the parse tree
	 */
	void enterRules(DatalogParser.RulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#rules}.
	 * @param ctx the parse tree
	 */
	void exitRules(DatalogParser.RulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(DatalogParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(DatalogParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(DatalogParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(DatalogParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#atoms}.
	 * @param ctx the parse tree
	 */
	void enterAtoms(DatalogParser.AtomsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#atoms}.
	 * @param ctx the parse tree
	 */
	void exitAtoms(DatalogParser.AtomsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#variableOrLiteral}.
	 * @param ctx the parse tree
	 */
	void enterVariableOrLiteral(DatalogParser.VariableOrLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#variableOrLiteral}.
	 * @param ctx the parse tree
	 */
	void exitVariableOrLiteral(DatalogParser.VariableOrLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#variableOrLiterals}.
	 * @param ctx the parse tree
	 */
	void enterVariableOrLiterals(DatalogParser.VariableOrLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#variableOrLiterals}.
	 * @param ctx the parse tree
	 */
	void exitVariableOrLiterals(DatalogParser.VariableOrLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#aggregateVariable}.
	 * @param ctx the parse tree
	 */
	void enterAggregateVariable(DatalogParser.AggregateVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#aggregateVariable}.
	 * @param ctx the parse tree
	 */
	void exitAggregateVariable(DatalogParser.AggregateVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#aggregateOp}.
	 * @param ctx the parse tree
	 */
	void enterAggregateOp(DatalogParser.AggregateOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#aggregateOp}.
	 * @param ctx the parse tree
	 */
	void exitAggregateOp(DatalogParser.AggregateOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(DatalogParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(DatalogParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(DatalogParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(DatalogParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(DatalogParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(DatalogParser.LiteralContext ctx);
}