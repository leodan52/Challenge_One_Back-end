
public class ConversorMoneda {

	private double cantidad;
	private String monedaOrigen;
	private String monedaDestino;
	
	private TasaConversion tasas = new TasaConversion();

	public ConversorMoneda() {
		// TODO Auto-generated constructor stub
	}

	public ConversorMoneda(double cantidad, String monedaOrigen, String monedaDestino) {
		this.cantidad = cantidad;
		this.monedaOrigen = monedaOrigen;
		this.monedaDestino = monedaDestino;
	}
	
	public double ConvertirDivisas() {
		double tasa = tasas.setTasa(this.monedaOrigen, this.monedaDestino);
		
		return this.cantidad*tasa;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public String getMonedaOrigen() {
		return monedaOrigen;
	}

	public void setMonedaOrigen(String monedaOrigen) {
		this.monedaOrigen = monedaOrigen;
	}

	public String getMonedaDestino() {
		return monedaDestino;
	}

	public void setMonedaDestino(String monedaDestino) {
		this.monedaDestino = monedaDestino;
	}

}
