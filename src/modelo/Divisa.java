package modelo;

public class Divisa {
    private String Divisa;
    private double valor;

    public Divisa(){
    }
    public Divisa(String divisa, double valor) {
        this.Divisa = divisa;
        this.valor = valor;
    }

    public String getDivisa() {
        return Divisa;
    }

    public void setDivisa(String divisa) {
        this.Divisa = divisa;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Clave: " + Divisa + ", Valor: " + valor;
    }
}
