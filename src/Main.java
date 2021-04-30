import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) {
        try {
            // Stores all table names with it's corresponding column names
            DBConnector.retrieveMetaData();
            System.out.println(DBConnector.metaData);
            // Example query
            String tableName = "Employee";
            String[] columnNames = {"1", "?x", "?y"};
            DBConnector.query(tableName, columnNames);

            CharStream input = CharStreams.fromStream(System.in);
            DatalogLexer lexer = new DatalogLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            DatalogParser parser = new DatalogParser(tokens);
            ParseTree tree = parser.program();
            MiVisitador eval = new MiVisitador();
            Node n = eval.visit(tree);
            //n.gen();
            System.out.println();
            System.out.println(tree.toStringTree(parser));
        } catch (Exception e) {
            System.out.println("Error: " + e);
            e.printStackTrace();
        }
    }
}