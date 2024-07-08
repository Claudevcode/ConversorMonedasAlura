package divisas;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import modelo.Divisa;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class divisasDesdeApi {
    public Divisa buscar(String abreviatura) {
        Divisa divisa = null;
        try {

            String urlStr = "https://v6.exchangerate-api.com/v6/71208ea57106c81b185f1348/latest/USD";

            URL url = new URL(urlStr);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();

            JsonElement root = JsonParser.parseReader(new InputStreamReader(request.getInputStream()));
            JsonObject jsonObject = root.getAsJsonObject();

            JsonObject jsonInterno = jsonObject.getAsJsonObject("conversion_rates");

            for (String clave : jsonInterno.keySet()) {
                if (clave.equals(abreviatura)) {
                    JsonElement valor = jsonInterno.get(clave);
                    double doubleValor = valor.getAsDouble();
                    divisa = new Divisa(clave, doubleValor);
                    break;
                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return divisa;
    }
}