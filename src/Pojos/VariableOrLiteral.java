package Pojos;

public class VariableOrLiteral {
    private String key, columnName, type;
    public static String LITERAL = "LITERAL";
    public static String VARIABLE = "VARIABLE";

    public VariableOrLiteral(String key, String columnName, String type) {
        this.key = key;
        this.columnName = columnName;
        this.type = type;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "VariableOrLiteral{" +
                "key='" + key + '\'' +
                ", columnName='" + columnName + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
