package conversor.view;

import api.key.RequestApi;
import conversor.control.Conversor;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main implements RequestApi{
    public static void main(String[] args) throws IOException, InterruptedException {
        Conversor conversor = new Conversor();
        System.out.println(conversor.convertendoMoeda("USD"));
    }
}
