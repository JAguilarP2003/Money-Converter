import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiUsage {

    static final String apiKey = System.getenv("API_KEY");
    private static final String url = "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/";

    public static void convertCurency(
            String initialCurrency,
            String finalCurrency,
            double value
    )throws IOException, InterruptedException{
        String url = ApiUsage.url + initialCurrency;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        CurrencyParser parsedCurrency = new CurrencyParser();
        double exchangeRate = parsedCurrency.getExchangeRate(response.body(), finalCurrency);
        if (exchangeRate == 0){
            System.out.println("exchangeRate equals to 0");
        }
        else{
            double result = value * exchangeRate;
            System.out.println("\n" + value + " " + initialCurrency + " equals to " + result + " " + finalCurrency + "\n"
            );
        }
    }
}