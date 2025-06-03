package conversor.model;

import conversor.control.Conversor;

import java.io.IOException;

public class CalculoConversao {
    Conversor conversor = new Conversor();

    public void CalculoDivisaoValor(Double valor, String sigla) throws IOException, InterruptedException {
        Double valorCalculo = valor / conversor.convertendoMoeda(sigla);
        System.out.println("O valor " + valor + " [" + sigla + "] corresponde ao valor final de ==> " + valorCalculo + "[USD]\n");
    }

    public void CalculoMultiplicasaoValor(Double valor, String sigla) throws IOException, InterruptedException {
        Double valorCalculo = valor * conversor.convertendoMoeda(sigla);
        System.out.println("O valor " + valor + " [USD] corresponde ao valor final de ==> " + valorCalculo + "[" + sigla + "]\n");
    }
}
