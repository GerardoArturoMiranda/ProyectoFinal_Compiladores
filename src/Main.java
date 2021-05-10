import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) {
        try {
            // Stores all table names with it's corresponding column names
            DBConnector.retrieveMetaData();
            System.out.println("COLUMNS: " + DBConnector.metaData.columns);
            System.out.println("SCHEMAS: " + DBConnector.metaData.schema);
            /* Example query
            *String tableName = "SpecialOffer";
            *String[] columnNames = {"15", "?x", "?y", "?z"};
            *DBConnector.query(tableName, columnNames);
            */
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