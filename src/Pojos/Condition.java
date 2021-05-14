package Pojos;

public class Condition {
    private String variable;
    private  String operador;
    private String valor;

    public Condition(String variable, String operador, String valor) {
        this.variable = variable;
        this.operador = operador;
        this.valor = valor;
    }

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Condition{" +
                "variable='" + variable + '\'' +
                ", operador='" + operador + '\'' +
                ", valor='" + valor + '\'' +
                '}';
    }
}
