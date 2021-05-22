
import Pojos.Atom;
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

    /*
    *
    *
     */

    Atom ruleHeadAtom;
    /*
    *
     */
    List<Atom> ruleBodyAtoms = new ArrayList<>();

    List<VariableOrLiteral> ruleHeadAtomLiteralsOrVariables = new ArrayList<>();


    boolean bodyAtomSemaphore = false;
    boolean executeRuleQuery = false;
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

        String parentX3NodeName = nodeNames[ctx.getParent().getParent().getParent().getRuleIndex()];


        if(parentX3NodeName.equals("atom") && !bodyAtomSemaphore) {
            ruleHeadAtomLiteralsOrVariables.add(new VariableOrLiteral(ctx.getText(), null, VariableOrLiteral.LITERAL));
            return visitChildren(ctx);
        }
        if (parentX2NodeName.equals("condition")) {
            return visitChildren(ctx);
        } else if (parentX2NodeName.equals("atom")) {
            return visitChildren(ctx);
        } else {
            basicQueryLiteralsOrVariables.add(new VariableOrLiteral(ctx.getText(), null, VariableOrLiteral.LITERAL));
            basicQueryFullExpresions.put(basicQueryIndex, basicQueryLiteralsOrVariables);
            return visitChildren(ctx);
        }

    }

    // ✦ Variable Listener '?x'
    @Override public Node visitVariable(DatalogParser.VariableContext ctx) {
        // Prevent variables to be saved in both visitVariable and visitCondition
        // That causes duplication of variables
        // They'll be saved only on visitCondition
        String parentX2NodeName = nodeNames[ctx.getParent().getParent().getRuleIndex()];

        String parentX3NodeName = nodeNames[ctx.getParent().getParent().getParent().getRuleIndex()];

        if(parentX3NodeName.equals("atom") && !bodyAtomSemaphore) {
            ruleHeadAtomLiteralsOrVariables.add(new VariableOrLiteral(ctx.getText(), null, VariableOrLiteral.VARIABLE));
            return visitChildren(ctx);
        }
        if (parentX2NodeName.equals("condition")) {
            return visitChildren(ctx);
        } else if (parentX2NodeName.equals("atom")) {
            return visitChildren(ctx);
        } else {
            basicQueryLiteralsOrVariables.add(new VariableOrLiteral(ctx.getText(), null, VariableOrLiteral.VARIABLE));
            basicQueryFullExpresions.put(basicQueryIndex, basicQueryLiteralsOrVariables);
            return visitChildren(ctx);
        }
    }


    // ❂ End Listener '.'
    @Override public Node visitEnd(DatalogParser.EndContext ctx) {
        if(executeRuleQuery){
            DBConnector.ruleQuery(ruleHeadAtom, ruleBodyAtoms.toArray(Atom[]::new));
            executeRuleQuery = false;
        }else{
            DBConnector.query(basicQueryPredicates.get(basicQueryIndex-1), basicQueryFullExpresions.get(basicQueryIndex).toArray(VariableOrLiteral[]::new),
                    basicQueryConditions.toArray(Condition[]::new) );
        }
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

    // *$* Atom Listener
    @Override public Node visitAtom(DatalogParser.AtomContext ctx) {
        List<VariableOrLiteral> ruleBodyAtomLiteralsOrVariables = new ArrayList<>();
        String parentX1NodeName = nodeNames[ctx.getParent().getRuleIndex()];
        if (parentX1NodeName.equals("atoms")) {
            // BodyAtoms Case
            String ruleBodyColumnName = ctx.getChild(0).getText();
            String[] ruleBodyVariablesOrLiterals = ctx.getChild(2).getText().split(",");
            for(int i = 0; i < ruleBodyVariablesOrLiterals.length; i++){
                System.out.println(ruleBodyVariablesOrLiterals[i].charAt(0));
                if(ruleBodyVariablesOrLiterals[i].charAt(0) == '?'){
                    ruleBodyAtomLiteralsOrVariables.add(new VariableOrLiteral(ruleBodyVariablesOrLiterals[i], ruleBodyColumnName, VariableOrLiteral.VARIABLE));
                }else{
                    ruleBodyAtomLiteralsOrVariables.add(new VariableOrLiteral(ruleBodyVariablesOrLiterals[i], ruleBodyColumnName, VariableOrLiteral.LITERAL));
                }
            }
            ruleBodyAtoms.add(new Atom(ruleBodyColumnName, ruleBodyAtomLiteralsOrVariables));
        }else{
            // HeadAtom Case
            ruleHeadAtom = new Atom(ctx.getChild(0).getText(), ruleHeadAtomLiteralsOrVariables);
        }
        return visitChildren(ctx);
    }

    @Override public Node visitAtoms(DatalogParser.AtomsContext ctx) {
        bodyAtomSemaphore = true;
        return visitChildren(ctx);
    }

    //  «» Programa Inicio
    @Override public Node visitProgram(DatalogParser.ProgramContext ctx) {
        DBConnector.retrieveMetaData();
        return visitChildren(ctx); }

    @Override public Node visitRules(DatalogParser.RulesContext ctx) {
        executeRuleQuery = true;
        return visitChildren(ctx);
    }
}

