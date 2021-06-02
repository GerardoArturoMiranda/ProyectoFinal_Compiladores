
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
    List<VariableOrLiteral> ruleBodyAtomLiteralsOrVariables = new ArrayList<>();
    List<Condition> basicQueryConditions = new ArrayList<Condition>();

    boolean basicQuerySemaphore = false;
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



    boolean executeRecursiveQuery = false;
    Atom recursiveQueryHeadAtom;
    Hashtable<Integer, List<Atom>> recursiveQueryBodyAtomsHashTable
            = new Hashtable<Integer, List<Atom>>();
    int atomCount;
    List<Atom> recursiveQueryBodyAtoms = new ArrayList<>();
    // ☾ Predicate Listener 'Student()'
    @Override public Node visitPredicate(DatalogParser.PredicateContext ctx) {
        return visitChildren(ctx); }

    // ❂ End Listener '.'
    @Override public Node visitEnd(DatalogParser.EndContext ctx) {
        if(basicQuerySemaphore) {
            DBConnector.query(basicQueryPredicates.get(basicQueryIndex-1),
                    basicQueryFullExpresions.get(basicQueryIndex).toArray(VariableOrLiteral[]::new),
                    basicQueryConditions.toArray(Condition[]::new));
        }
        if(executeRuleQuery && !executeRecursiveQuery){
            // Inserting the ruleQuery in the Database.
            DBConnector.ruleQuery(ruleHeadAtom, ruleBodyAtoms.toArray(Atom[]::new));
            executeRuleQuery = false;
        }

        basicQueryLiteralsOrVariables.clear();
        basicQueryConditions.clear();

        return visitChildren(ctx); }
    // ✮ Query Listener '?-'
    @Override public Node visitQuery(DatalogParser.QueryContext ctx) {
        if(executeRecursiveQuery ){
            DBConnector.recursiveQuery(recursiveQueryBodyAtomsHashTable, recursiveQueryHeadAtom);
        }
        DBConnector.retrieveMetaData();
        basicQuerySemaphore = true;
        basicQueryIndex++;
        return visitChildren(ctx); }

    // • Condition Listener '?x > 25'
    @Override public Node visitCondition(DatalogParser.ConditionContext ctx) {
        Condition con  = new Condition(ctx.getChild(0).getText(), ctx.getChild(1).getText(), ctx.getChild(2).getText());
        basicQueryConditions.add(con);
        return visitChildren(ctx);
    }

    // *$* Atom Listener
    @Override public Node visitAtom(DatalogParser.AtomContext ctx) {
        List<Atom> temporal = recursiveQueryBodyAtoms;
        ruleBodyAtomLiteralsOrVariables.clear();
        String parentX1NodeName = nodeNames[ctx.getParent().getRuleIndex()];
        if (parentX1NodeName.equals("atoms") && !executeRecursiveQuery) {
            // BodyAtoms Case
            String ruleBodyColumnName = ctx.getChild(0).getText();
            String[] ruleBodyVariablesOrLiterals = ctx.getChild(2).getText().split(",");
            for(int i = 0; i < ruleBodyVariablesOrLiterals.length; i++){
                System.out.println(ruleBodyVariablesOrLiterals[i].charAt(0));
                if(ruleBodyVariablesOrLiterals[i].charAt(0) == '?'){
                    ruleBodyAtomLiteralsOrVariables.add(new VariableOrLiteral(ruleBodyVariablesOrLiterals[i], null, VariableOrLiteral.VARIABLE));
                }else{
                    ruleBodyAtomLiteralsOrVariables.add(new VariableOrLiteral(ruleBodyVariablesOrLiterals[i], null, VariableOrLiteral.LITERAL));
                }
            }
            ruleBodyAtoms.add(new Atom(ruleBodyColumnName, ruleBodyAtomLiteralsOrVariables));
        }else if(parentX1NodeName.equals("rule") && !executeRecursiveQuery){
            // HeadAtom Case
            ruleHeadAtom = new Atom(ctx.getChild(0).getText(), ruleHeadAtomLiteralsOrVariables);
        }else if(basicQuerySemaphore){
            String basicQueryPredicate = ctx.getChild(0).getText();
            String[] basicQueryVariablesOrLiterals = ctx.getChild(2).getText().split(",");
            for(int i = 0; i < basicQueryVariablesOrLiterals.length; i++){
                System.out.println(basicQueryVariablesOrLiterals[i].charAt(0));
                if(basicQueryVariablesOrLiterals[i].charAt(0) == '?'){
                    basicQueryLiteralsOrVariables.add(new VariableOrLiteral(basicQueryVariablesOrLiterals[i], null, VariableOrLiteral.VARIABLE));
                }else{
                    basicQueryLiteralsOrVariables.add(new VariableOrLiteral(basicQueryVariablesOrLiterals[i], null, VariableOrLiteral.LITERAL));
                }
            }
            basicQueryPredicates.add(basicQueryPredicate);
            basicQueryFullExpresions.put(basicQueryIndex,  basicQueryLiteralsOrVariables);
        }else if(atomCount>0 && executeRecursiveQuery ){
            // Fill Base Case
            if(!bodyAtomSemaphore) {
                List<VariableOrLiteral> recursiveQueryHeadAtomLiteralsOrVariables = new ArrayList<>();
                String recursiveQueryHeadAtomPredicate = ctx.getChild(0).getText();
                String[] recursiveQueryHeadAtomVariablesOrLiterals = ctx.getChild(2).getText().split(",");
                for (int i = 0; i < recursiveQueryHeadAtomVariablesOrLiterals.length; i++) {
                    System.out.println(recursiveQueryHeadAtomVariablesOrLiterals[i].charAt(0));
                    if (recursiveQueryHeadAtomVariablesOrLiterals[i].charAt(0) == '?') {
                        recursiveQueryHeadAtomLiteralsOrVariables.add(new VariableOrLiteral(recursiveQueryHeadAtomVariablesOrLiterals[i], null, VariableOrLiteral.VARIABLE));
                    } else {
                        recursiveQueryHeadAtomLiteralsOrVariables.add(new VariableOrLiteral(recursiveQueryHeadAtomVariablesOrLiterals[i], null, VariableOrLiteral.LITERAL));
                    }
                }
                recursiveQueryHeadAtom = new Atom(recursiveQueryHeadAtomPredicate, recursiveQueryHeadAtomLiteralsOrVariables);

            }else{
                List<VariableOrLiteral> recursiveQueryBodyAtomLiteralsOrVariables = new ArrayList<>();
                System.out.println("Entering");
                String recursiveQueryBodyAtomPredicate = ctx.getChild(0).getText();
                String[] recursiveQueryBodyAtomVariablesOrLiterals = ctx.getChild(2).getText().split(",");
                for (int i = 0; i < recursiveQueryBodyAtomVariablesOrLiterals.length; i++) {
                    System.out.println(recursiveQueryBodyAtomVariablesOrLiterals[i].charAt(0));
                    if (recursiveQueryBodyAtomVariablesOrLiterals[i].charAt(0) == '?') {
                        recursiveQueryBodyAtomLiteralsOrVariables.add(new VariableOrLiteral(recursiveQueryBodyAtomVariablesOrLiterals[i], null, VariableOrLiteral.VARIABLE));
                    } else {
                        recursiveQueryBodyAtomLiteralsOrVariables.add(new VariableOrLiteral(recursiveQueryBodyAtomVariablesOrLiterals[i], null, VariableOrLiteral.LITERAL));
                    }
                }
                Atom recursiveQueryBodyAtom = new Atom(recursiveQueryBodyAtomPredicate, recursiveQueryBodyAtomLiteralsOrVariables);
                recursiveQueryBodyAtoms.add(recursiveQueryBodyAtom);
                System.out.println(recursiveQueryBodyAtoms.toString());
                if(!recursiveQueryBodyAtomsHashTable.containsKey(atomCount)){
                    recursiveQueryBodyAtomsHashTable.put(atomCount,  new ArrayList<Atom>());
                }
                recursiveQueryBodyAtomsHashTable.get(atomCount).add(recursiveQueryBodyAtom);
            }
        }else {}
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
        if(ctx.getChild(1) != null){
            executeRecursiveQuery = true;
        }else{
            executeRuleQuery = true;
        }
        return visitChildren(ctx);

    }
    @Override public Node visitRule(DatalogParser.RuleContext ctx) {
        atomCount++;
        bodyAtomSemaphore = false;
        return visitChildren(ctx); }
}

