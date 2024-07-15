import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class CurrencyParser {

    public double getExchangeRate(String jsonResponse, String currency) {
        JsonObject json = JsonParser.parseString(jsonResponse).getAsJsonObject();

        JsonObject exchangeRate = json.getAsJsonObject("conversion_rates");
        return exchangeRate.get(currency).getAsDouble();
    }

}