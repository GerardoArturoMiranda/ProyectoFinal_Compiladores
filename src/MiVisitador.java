
import Pojos.Condition;
import Pojos.VariableOrLiteral;

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

    Hashtable<Integer, List<VariableOrLiteral>> basicQueryFullExpresions
            = new Hashtable<Integer, List<VariableOrLiteral>>();
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

    List<VariableOrLiteral> basicQueryLiteralsOrVariables =new ArrayList<VariableOrLiteral>();

    List<Condition> basicQueryConditions = new ArrayList<Condition>();

    String[] nodeNames = DatalogParser.ruleNames;

    // ☾ Predicate Listener 'Student()'
    @Override public Node visitPredicate(DatalogParser.PredicateContext ctx) {
        basicQueryPredicates.add(ctx.getText());
        basicQueryIndex++;
        return visitChildren(ctx); }

    // ✩ Literal Listener '15'
    @Override public Node visitLiteral(DatalogParser.LiteralContext ctx) {
        // Prevent variables to be saved in both visitLiteral and visitCondition
        // That causes duplication of literals
        // They'll be saved only on visitCondition
        String parentX2NodeName = nodeNames[ctx.getParent().getParent().getRuleIndex()];
        if (parentX2NodeName.equals("condition")) {
            return visitChildren(ctx);
        }
        basicQueryLiteralsOrVariables.add(new VariableOrLiteral(ctx.getText(), null, VariableOrLiteral.LITERAL));
        basicQueryFullExpresions.put(basicQueryIndex, basicQueryLiteralsOrVariables);
        return visitChildren(ctx); }

    // ✦ Variable Listener '?x'
    @Override public Node visitVariable(DatalogParser.VariableContext ctx) {
        // Prevent variables to be saved in both visitVariable and visitCondition
        // That causes duplication of variables
        // They'll be saved only on visitCondition
        String parentX2NodeName = nodeNames[ctx.getParent().getParent().getRuleIndex()];
        if (parentX2NodeName.equals("condition")) {
            return visitChildren(ctx);
        }
        basicQueryLiteralsOrVariables.add(new VariableOrLiteral(ctx.getText(), null, VariableOrLiteral.VARIABLE));
        basicQueryFullExpresions.put(basicQueryIndex, basicQueryLiteralsOrVariables);
        return visitChildren(ctx);
    }

    // ❂ End Listener '.'
    @Override public Node visitEnd(DatalogParser.EndContext ctx) {
        DBConnector.query(basicQueryPredicates.get(basicQueryIndex-1), basicQueryFullExpresions.get(basicQueryIndex).toArray(VariableOrLiteral[]::new),
                basicQueryConditions.toArray(Condition[]::new) );
        basicQueryLiteralsOrVariables.clear();
        basicQueryConditions.clear();
        return visitChildren(ctx); }

    // ✮ Query Listener '?-'

    /*
        This method might be deleted later.
    @Override public Node visitQuery(DatalogParser.QueryContext ctx) {
        DBConnector.retrieveMetaData();
        DBConnector.query(basicQueryPredicates.get(basicQueryIndex-1), basicQueryLiterals.get(basicQueryIndex).toArray(String[]::new),
                basicQueryVaribleList.toArray(Variable[]::new) );
        basicQueryLiterals.clear();
        basicQueryVaribleList.clear();
        return visitChildren(ctx); }
     */

    // • Condition Listener '?x > 25'
    @Override public Node visitCondition(DatalogParser.ConditionContext ctx) {
        Condition con  = new Condition(ctx.getChild(0).getText(), ctx.getChild(1).getText(), ctx.getChild(2).getText());
        basicQueryConditions.add(con);
        return visitChildren(ctx);
    }

    // • Rule Listener 'Employee(?x) :- '
    @Override public Node visitRules(DatalogParser.RulesContext ctx) {
        return visitChildren(ctx);
    }

    //  «» Programa Inicio
    @Override public Node visitProgram(DatalogParser.ProgramContext ctx) {
        DBConnector.retrieveMetaData();
        return visitChildren(ctx); }

}

