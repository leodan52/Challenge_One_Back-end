package divisas;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class TasaConversion {

	private Map<String, Double> conversor = new HashMap<>();
	private int codigoStatus;
	private String jsonRespuesta;
	private boolean success;
	private String fecha;
	private JSONObject tasasJSON;

	public TasaConversion() {

		try {
			this.pedirTasasAPI();
			this.procesarJSON();
		} catch (IOException | URISyntaxException | InterruptedException e) {
			this.success = false;
			this.codigoStatus = 300;
		}

		if (this.success && this.codigoStatus == 200) {
			this.conversor.put("MXN", (double) this.tasasJSON.get("MXN"));
			this.conversor.put("USD", 1.0);
			this.conversor.put("EUR", (double) this.tasasJSON.get("EUR"));
			this.conversor.put("GBP", (double) this.tasasJSON.get("GBP"));
			this.conversor.put("JPY", (double) this.tasasJSON.get("JPY"));
			this.conversor.put("KRW", (double) this.tasasJSON.get("KRW"));
		} else {
			this.conversor.put("MXN", 18.09536);
			this.conversor.put("USD", 1.0);
			this.conversor.put("EUR", 0.94826);
			this.conversor.put("GBP", 0.84532);
			this.conversor.put("JPY", 137.332017);
			this.conversor.put("KRW", 1317.184996);
		}
	}

	public double setTasa(String cantidadOrigen, String cantidadDestino) {
		double tasaOrigen = this.conversor.get(cantidadOrigen);
		double tasaDestino = this.conversor.get(cantidadDestino);

		return tasaDestino / tasaOrigen;

	}

	private void pedirTasasAPI() throws URISyntaxException, IOException, InterruptedException {
		HttpClient client = HttpClient.newBuilder().build();

		HttpRequest request = HttpRequest.newBuilder().uri(new URI(
				"https://api.apilayer.com/exchangerates_data/latest?symbols=MXN%2C%20USD%2C%20EUR%2C%20GBP%2C%20JPY%2C%20KRW&base=USD"))
				.header("apikey", "A8bt190xEnyx20L4FUGmQgAYpSvQjOCr").timeout(Duration.ofSeconds(30)).GET().build();

		HttpResponse<String> respuesta = client.send(request, BodyHandlers.ofString());

		this.jsonRespuesta = respuesta.body();
		this.codigoStatus = respuesta.statusCode();
	}

	private void procesarJSON() {
		Object obt = JSONValue.parse(this.jsonRespuesta);
		JSONObject json = (JSONObject) obt;
		tasasJSON = (JSONObject) json.get("rates");

		success = (boolean) json.get("success");
		fecha = (String) json.get("date");

	}

	public String getFecha() {
		return fecha;
	}

}
