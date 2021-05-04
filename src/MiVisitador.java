
import java.util.*;
public class MiVisitador extends DatalogBaseVisitor<Node>{
    /*
    *   ✹✹✹✹ Declaring input attributes for the basicQueryGenerator method.
    *   DO NOT modify the type of these attributes. These variables are going to
    *   be sent when we get to the final of the Datalog Query ✹✹✹✹
     */
    /* ⭑ Purpose of: basicQueryPredicates.
    *           Saves all the predicates that the user might insert
    *           during the execution of the program, this variable
    *           will be sent to the query method of the DBConnect.
     */
    List<String> basicQueryPredicates =new ArrayList<String>();
    /* ⭑ Purpose of: basicQueryLiterals.
     *           Saves all the literals that the user might insert
     *           during the execution of the program, this String array
     *           will be sent to the query method of the DBConnect.
     *          DO please use this variable to save 'literals' and 'variables'.
     *          Literal: 15
     *          Variable: ?x
     */
    Hashtable<Integer, List<String>> basicQueryLiterals
            = new Hashtable<Integer, List<String>>();
    /* ⭑ Purpose of: basicQueryIndex.
     *           Saves the index of the fact, this variable will be
     *           useful in order to support multiple queries insertion.
     */
    int basicQueryIndex = 0;
    /* ⭑ Purpose of: basicQueryIndex.
     *           Saves all the Literals as a LIST, in order for the correct
     *           execution and insertion of multiple queries, it is a must
     *           to have the Hashtable's values as Lists.
     *           ° this variable will be cleared in every fact °
     */
    List<String> basicQueryLiteralsList =new ArrayList<String>();

    // ☾ Predicate Listener 'Student()'
    @Override public Node visitPredicate(DatalogParser.PredicateContext ctx) {
        basicQueryPredicates.add(ctx.getText());
        basicQueryIndex++;
        return visitChildren(ctx); }
    // ✩ Literal Listener '15'
    @Override public Node visitLiteral(DatalogParser.LiteralContext ctx) {
        basicQueryLiteralsList.add(ctx.getText());
        basicQueryLiterals.put(basicQueryIndex, basicQueryLiteralsList);
        return visitChildren(ctx); }
    // ✦ Variable Listener '?x'
    @Override public Node visitVariable(DatalogParser.VariableContext ctx) {
        basicQueryLiteralsList.add(ctx.getText());
        basicQueryLiterals.put(basicQueryIndex, basicQueryLiteralsList);
        return visitChildren(ctx); }
    // ❂ End Listener '.'
    @Override public Node visitEnd(DatalogParser.EndContext ctx) {
        DBConnector.retrieveMetaData();
        DBConnector.query(basicQueryPredicates.get(basicQueryIndex-1), basicQueryLiterals.get(basicQueryIndex).toArray(String[]::new) );
        basicQueryLiterals.clear();
        return visitChildren(ctx); }
    // ✮ Query Listener '?-'
    @Override public Node visitQuery(DatalogParser.QueryContext ctx) {
        DBConnector.retrieveMetaData();
        DBConnector.query(basicQueryPredicates.get(basicQueryIndex-1), basicQueryLiterals.get(basicQueryIndex).toArray(String[]::new) );
        basicQueryLiterals.clear();
        return visitChildren(ctx); }
}

