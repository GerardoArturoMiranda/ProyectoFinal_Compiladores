package Pojos;
import java.util.*;

public class Atom {
    private String tableName;
    private List<String> atributes;
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public List<String> getAtributes() {
        return atributes;
    }

    public void setAtributes(List<String> atributes) {
        this.atributes = atributes;
    }



    public Atom(String tableName, List<String> atributes) {
        this.tableName = tableName;
        this.atributes = new ArrayList<String>();
    }





}
