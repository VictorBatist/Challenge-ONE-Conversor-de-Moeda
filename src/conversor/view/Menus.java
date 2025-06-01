package conversor.view;

public class Menus {
    public void informarEscolha(){
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
    }

    public void informarValor(){
        System.out.println("\nInforme o valor que deseja converter: ");
    }
}
