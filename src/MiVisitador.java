
import java.util.*;
public class MiVisitador extends DatalogBaseVisitor<Node>{
    /*
    *   ✹✹✹✹ Declaring input attributes for the basicQueryGenerator method.
    *   DO NOT modify the type of these attributes. These variables are going to
    *   be sent when we get to the final of the Datalog Query ✹✹✹✹
     */
    List<String> basicQueryPredicates =new ArrayList<String>();
    Hashtable<Integer, List<String>> basicQueryLiterals
            = new Hashtable<Integer, List<String>>();
    int basicQueryIndex = 0;
    List<String> basicQueryLiteralsList =new ArrayList<String>();

    @Override public Node visitPredicate(DatalogParser.PredicateContext ctx) {
        basicQueryPredicates.add(ctx.getText());
        basicQueryIndex++;
        return visitChildren(ctx); }

    @Override public Node visitLiteral(DatalogParser.LiteralContext ctx) {
        basicQueryLiteralsList.add(ctx.getText());
        basicQueryLiterals.put(basicQueryIndex, basicQueryLiteralsList);
        return visitChildren(ctx); }

    @Override public Node visitVariable(DatalogParser.VariableContext ctx) {
        basicQueryLiteralsList.add(ctx.getText());
        basicQueryLiterals.put(basicQueryIndex, basicQueryLiteralsList);
        return visitChildren(ctx); }

    @Override public Node visitEnd(DatalogParser.EndContext ctx) {
        DBConnector.retrieveMetaData();
        DBConnector.query(basicQueryPredicates.get(basicQueryIndex-1), basicQueryLiterals.get(basicQueryIndex).toArray(String[]::new) );
        basicQueryLiterals.clear();
        return visitChildren(ctx); }

    @Override public Node visitQuery(DatalogParser.QueryContext ctx) {
        DBConnector.retrieveMetaData();
        DBConnector.query(basicQueryPredicates.get(basicQueryIndex-1), basicQueryLiterals.get(basicQueryIndex).toArray(String[]::new) );
        basicQueryLiterals.clear();
        return visitChildren(ctx); }

}

