package Pojos;
import java.util.*;

public class Atom {
    private String tableName;
    private List<VariableOrLiteral> attributesOrLiterals;

    public Atom(String tableName, List<VariableOrLiteral> attributesOrLiterals) {
        this.tableName = tableName;
        this.attributesOrLiterals = attributesOrLiterals;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public List<VariableOrLiteral> getAttributesOrLiterals() {
        return attributesOrLiterals;
    }

    public void setAttributesOrLiterals(List<VariableOrLiteral> attributesOrLiterals) {
        this.attributesOrLiterals = attributesOrLiterals;
    }

    public String canBeJoined(Atom other) {
        VariableOrLiteral exists;
        for (VariableOrLiteral vl : getAttributesOrLiterals()) {
                exists = other.getAttributesOrLiterals().stream()
                    .filter(otherVl -> vl.getColumnName().equals(otherVl.getColumnName()))
                    .findFirst().orElse(null);
                if (exists != null) {
                    return exists.getColumnName();
                }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Atom{" +
                "tableName='" + tableName + '\'' +
                ", attributesOrLiterals=" + attributesOrLiterals +
                '}';
    }
}
