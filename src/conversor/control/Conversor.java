package conversor.control;

import api.key.RequestApi;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversor implements RequestApi {

    public String convertendoMoeda(String sigla) throws IOException, InterruptedException {
        String address = "https://v6.exchangerate-api.com/v6/" + RequestApi.setApiKey() + "/latest/" + sigla;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(address))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse
                .BodyHandlers.ofString());
        String json = response.body();
        return json;
    }



}
