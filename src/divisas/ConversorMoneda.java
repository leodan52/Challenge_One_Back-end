package divisas;

public class ConversorMoneda {

	private double cantidad;
	private String monedaOrigen;
	private String monedaDestino;
	private double tasa;
	private double actualConversion = 0.0;
	private String fechaActualización;

	private TasaConversion tasas = new TasaConversion();

	public ConversorMoneda() {

	}

	public ConversorMoneda(double cantidad, String monedaOrigen, String monedaDestino) {
		this.cantidad = cantidad;
		this.monedaOrigen = monedaOrigen;
		this.monedaDestino = monedaDestino;
	}

	public double ConvertirDivisas() {
		this.tasa = tasas.setTasa(this.monedaOrigen, this.monedaDestino);
		this.actualConversion = this.cantidad * this.tasa;
		this.fechaActualización = tasas.getFecha();

		return Math.round(this.actualConversion * 1000.0) / 1000.0;
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

	public double getTasa() {
		return Math.round(tasa * 100000.0) / 100000.0;
	}

	public double getActualConversion() {
		return actualConversion;
	}

	public String getFechaActualización() {
		return fechaActualización;
	}

}
