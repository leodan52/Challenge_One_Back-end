package test;

//import java.io.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

//import okhttp3.*;

public class TestAPI {
	public static void main(String[] args) throws IOException, InterruptedException, URISyntaxException {
//    OkHttpClient client = new OkHttpClient().newBuilder().build();
//
//    Request request = new Request.Builder()
//      .url("https://api.apilayer.com/exchangerates_data/latest?symbols=MXN%2C%20USD%2C%20EUR%2C%20GBP%2C%20JPY%2C%20KRW&base=USD")
//      .addHeader("apikey", "A8bt190xEnyx20L4FUGmQgAYpSvQjOCr")
//      .method("GET", })
//      .build();
//    Response response = client.newCall(request).execute();
//    System.out.println(response.body().string());

		HttpClient client = HttpClient.newBuilder().build();

		HttpRequest request = HttpRequest.newBuilder().uri(new URI(
				"https://api.apilayer.com/exchangerates_data/latest?symbols=MXN%2C%20USD%2C%20EUR%2C%20GBP%2C%20JPY%2C%20KRW&base=USD"))
				.header("apikey", "A8bt190xEnyx20L4FUGmQgAYpSvQjOCr").GET().build();

//    client.sendAsync(request, BodyHandlers.ofString())
//    	.thenApply(HttpResponse::body)
//    	.thenAccept(System.out::println)
//    	.join();

		HttpResponse<String> respuesta = client.send(request, BodyHandlers.ofString());
		System.out.println(respuesta.statusCode());

		String jsonString = respuesta.body();

		System.out.println(jsonString);

		Object obt = JSONValue.parse(jsonString);
		JSONObject json = (JSONObject) obt;

		System.out.println(json.get("success"));
		System.out.println(json.get("base"));
		System.out.println(json.get("rates"));

	}

}