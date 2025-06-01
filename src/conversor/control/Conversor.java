package conversor.control;

import api.key.RequestApiKey;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversor implements RequestApiKey {

    public double convertendoMoeda(String sigla) throws IOException, InterruptedException {
        String address = "https://v6.exchangerate-api.com/v6/" + RequestApiKey.setApiKey() + "/latest/" + "USD";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(address))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse
                .BodyHandlers.ofString());
        String json = response.body();

        JsonParser parser = new JsonParser();
        JsonObject jsonPrincipal = parser.parse(json).getAsJsonObject();

        JsonObject conversionRates = jsonPrincipal.getAsJsonObject("conversion_rates");
        double valor = conversionRates.get(sigla).getAsDouble();

        return valor;
    }

}
