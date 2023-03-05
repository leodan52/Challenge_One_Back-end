import java.util.HashMap;
import java.util.Map;

public class TasaConversion {
	
	private Map<String, Double> conversor = new HashMap<>();
	
	public TasaConversion() {
		this.conversor.put("MXN", 0.055666586);
		this.conversor.put("USD", 1.0);
		this.conversor.put("EUR", 1.0631242);
		this.conversor.put("GBP", 1.2041358);
		this.conversor.put("JPY", 0.0073617702);
		this.conversor.put("KRW", 0.00077185536);
	}
	
	public double setTasa(String cantidadOrigen, String cantidadDestino) {
		double tasaOrigen = this.conversor.get(cantidadOrigen);
		double tasaDestino = this.conversor.get(cantidadDestino);
		
		return tasaOrigen/tasaDestino;
		
	}
	
}
