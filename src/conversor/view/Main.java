package conversor.view;

import api.key.RequestApiKey;
import conversor.control.Conversor;
import conversor.model.CalculoConversao;

import java.io.IOException;
import java.util.Scanner;

public class Main implements RequestApiKey {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);

        Menus menu= new Menus();
        Conversor conversor = new Conversor();
        CalculoConversao calculoConversao = new CalculoConversao();

        int opcao = 0;
        double valor;
        double valorConvertido;

        while (opcao != 7){

            menu.informarEscolha();
            opcao = scanner.nextInt();
            if (opcao==1){
                menu.informarValor();
                valor = scanner.nextDouble();

                calculoConversao.CalculoDivisaoValor(valor,"BRL");

//                valorConvertido = valor / conversor.convertendoMoeda("BRL");
//                System.out.println("O valor " + valor + " [BRL] corresponde ao valor final de ==> " + valorConvertido + "[USD]\n");

            } else if (opcao==2) {
                menu.informarValor();
                valor = scanner.nextDouble();

                calculoConversao.CalculoMultiplicasaoValor(valor, "BRL");

//                valorConvertido = valor * conversor.convertendoMoeda("BRL");
//                System.out.println("O valor " + valor + " [USD] corresponde ao valor final de ==> " + valorConvertido + "[BRL]\n");

            } else if (opcao==3) {
                menu.informarValor();
                valor = scanner.nextDouble();

                calculoConversao.CalculoDivisaoValor(valor, "ARS");

            } else if (opcao==4) {
                menu.informarValor();
                valor = scanner.nextDouble();

                calculoConversao.CalculoMultiplicasaoValor(valor, "ARS");

            } else if (opcao==5) {
                menu.informarValor();
                valor = scanner.nextDouble();

                calculoConversao.CalculoDivisaoValor(valor, "GBP");

            } else if (opcao==6) {
                menu.informarValor();
                valor = scanner.nextDouble();

                calculoConversao.CalculoMultiplicasaoValor(valor, "GBP");

            }else if(opcao==7){
                System.out.printf("Saindo...");
                break;
            }

        }

    }
}
