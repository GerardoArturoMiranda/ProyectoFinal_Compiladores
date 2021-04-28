public class MiVisitador extends DatalogBaseVisitor<Node>{
    @Override public Node visitFact(DatalogParser.FactContext ctx) {
        System.out.println(ctx.getText());
        return visitChildren(ctx);
    }
}

