package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class TrocoTest {

    @Test
    void deveCalcularExpressaoComFormula() {
        Caixa caixa = new Caixa();
        caixa.setDinheiroEntregue(10.0);
        caixa.setValorCobrado(5.0);

        Assertions.assertEquals("O troco é: " + 5.0, caixa.calcularTroco());
    }

    @Test
    void deveRetornarUmErroPoisOValorEntregueÉMenorQueOValorAPagar() {
        Caixa caixa = new Caixa();
        caixa.setDinheiroEntregue(5.0);
        caixa.setValorCobrado(10.0);

        Assertions.assertEquals("O dinheiro entregue deve ser maior ou igual ao valor cobrado", caixa.calcularTroco());
    }


}