package org.example;

public class Troco {

    public static String formula = "dinheiroEntregue - valorFinal";

    public static double calcularTroco(double dinheiroEntregue, double valorFinal) {
        String expressao;
        expressao = formula.replace("dinheiroEntregue", Double.toString(dinheiroEntregue));
        expressao = expressao.replace("valorFinal", Double.toString(valorFinal));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}

