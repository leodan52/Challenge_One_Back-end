import java.util.HashMap;
import java.util.Map;

public class TasaConversion {
	
	private Map<String, Double> conversor = new HashMap<>();
	
	public TasaConversion() {
		this.conversor.put("mxn", 0.055666586);
		this.conversor.put("usd", 1.0);
		this.conversor.put("eur", 1.0631242);
		this.conversor.put("gbp", 1.2041358);
		this.conversor.put("jpy", 0.0073617702);
		this.conversor.put("krw", 0.00077185536);
	}
	
	public double setTasa(String cantidadOrigen, String cantidadDestino) {
		double tasaOrigen = this.conversor.get(cantidadOrigen);
		double tasaDestino = this.conversor.get(cantidadDestino);
		
		return tasaOrigen/tasaDestino;
		
	}
	
}
