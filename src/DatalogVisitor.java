// Generated from /Users/gerardoarturomiranda/Documents/Diseño de Compiladores/ProyectoFinal_Compiladores/src/Datalog.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DatalogParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DatalogVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DatalogParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(DatalogParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatalogParser#fact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFact(DatalogParser.FactContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatalogParser#literalList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralList(DatalogParser.LiteralListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatalogParser#facts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFacts(DatalogParser.FactsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatalogParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(DatalogParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatalogParser#rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule(DatalogParser.RuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatalogParser#end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd(DatalogParser.EndContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatalogParser#rules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRules(DatalogParser.RulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatalogParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(DatalogParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatalogParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(DatalogParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatalogParser#atoms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtoms(DatalogParser.AtomsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatalogParser#variableOrLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableOrLiteral(DatalogParser.VariableOrLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatalogParser#variableOrLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableOrLiterals(DatalogParser.VariableOrLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatalogParser#aggregateVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregateVariable(DatalogParser.AggregateVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatalogParser#aggregateOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregateOp(DatalogParser.AggregateOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatalogParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(DatalogParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatalogParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(DatalogParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link DatalogParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(DatalogParser.LiteralContext ctx);
}