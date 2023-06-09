package org.example;

public class Caixa {
    private double valorCobrado;
    private double dinheiroEntregue;

    public double getValorFinal() {
        return valorCobrado;
    }

    public void setValorCobrado(double valorCobrado) {
        this.valorCobrado = valorCobrado;
    }

    public double getDinheiroEntregue() {
        return dinheiroEntregue;
    }

    public void setDinheiroEntregue(double dinheiroEntregue) {
        this.dinheiroEntregue = dinheiroEntregue;
    }

    public String calcularTroco() {
        if (dinheiroEntregue < valorCobrado) {
            return "O dinheiro entregue deve ser maior ou igual ao valor cobrado";
        }

        double troco = dinheiroEntregue - valorCobrado;
        return "O troco é: " + troco;
    }

}
