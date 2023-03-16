package divisas;

/**
 * Clase dedicada al cálculo para conversión de moneda. Recibe las tasas de la
 * clase TasaConversion y esta hace los calculos correspondientes
 * 
 * @author Santiago Garcia, Leonardo D.
 *
 */

public class ConversorMoneda {

	private double cantidad;
	private String monedaOrigen;
	private String monedaDestino;
	private double tasa;
	private double actualConversion = 0.0;
	private String fechaActualización;

	private TasaConversion tasas = new TasaConversion();

	/**
	 * Constructor para la clase sin argumentos.
	 */
	public ConversorMoneda() {

	}

	/**
	 * Constructor con argumentos
	 * 
	 * @param cantidad      El valor númerico de la divisa a convertir dada por
	 *                      modenaOrigen
	 * @param monedaOrigen  Divisa inicial a convertir
	 * @param monedaDestino Divisa final a convertir
	 */
	public ConversorMoneda(double cantidad, String monedaOrigen, String monedaDestino) {
		this.cantidad = cantidad;
		this.monedaOrigen = monedaOrigen;
		this.monedaDestino = monedaDestino;
	}

	/**
	 * Método que obtiene las tasas de la clase TasasConversión en base a
	 * monedaOrigen y monedaDestino y realiza el cálculo usando la cantidad inicial
	 * ingresada
	 * 
	 * @return Devuelve el valor númerico resultante despues de la conversión con
	 *         tres decimales
	 */
	public double ConvertirDivisas() {
		this.tasa = tasas.setTasa(this.monedaOrigen, this.monedaDestino);
		this.actualConversion = this.cantidad * this.tasa;
		this.fechaActualización = tasas.getFecha();

		return Math.round(this.actualConversion * 1000.0) / 1000.0;
	}

	/**
	 * @return Retorna en double la cantidad de la divisa a convertir
	 */
	public double getCantidad() {
		return cantidad;
	}

	/**
	 * @param cantidad Define el valor numérico de la divisa a convertir en double
	 */
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	/**
	 * @return Retorna en String la clave de la divisa inicial
	 */
	public String getMonedaOrigen() {
		return monedaOrigen;
	}

	/**
	 * @param monedaOrigen Define en String la clave de la divisa inicial
	 */
	public void setMonedaOrigen(String monedaOrigen) {
		this.monedaOrigen = monedaOrigen;
	}

	/**
	 * @return Retorna en String la clave de la divisa final
	 */
	public String getMonedaDestino() {
		return monedaDestino;
	}

	/**
	 * @param monedaOrigen Define en String la clave de la divisa final
	 */
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
