package conversor.view;

import api.key.RequestApi;
import conversor.control.Conversor;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main implements RequestApi{
    public static void main(String[] args) throws IOException, InterruptedException {

        System.out.println("""
                |------------------------------------------|
                |           Seja bem-vindo[a]              |
                |   Esse é o Seu Conversor de Moedas $     |
                |                                          |
                |    Escolha uma das opções abaixo:        |
                |                                          |
                | 1 - Real Brasileiro ==> Dolar Comercial  |
                | 2 - Dolar Comercial ==> Real Brasileiro  |
                | 3 - Peso Argentino ==> Dolar Comercial   |
                | 4 - Dolar Comercial ==> Peso Argentino   |
                | 5 - Libra ==> Dolar Comercial            |
                | 6 _ Dolar Comercial ==> Libra            |
                | 7 - Sair                                 |
                |                                          |
                |    Escolha uma das opções de 1 a 7 :)    |
                |                                          |
                |----------------------------------------- |
                """);

        Conversor conversor = new Conversor();
        System.out.println(conversor.convertendoMoeda("USD"));
    }
}
