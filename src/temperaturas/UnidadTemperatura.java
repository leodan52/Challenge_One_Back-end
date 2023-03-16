package temperaturas;

/**
 * Clase abstracta que define las caracteristicas de una unidad de temperatura:
 * módulo, unidad de medida y los métodos de conversión entre las unidades de
 * medida más utilizadas.
 * 
 * @author Santiago García, Leonardo D.
 *
 */

public abstract class UnidadTemperatura {

	private double modulo;
	private String Unidad;

	/**
	 * @return Regresa una instancia de UnidadCelsius con la conversión
	 */
	public abstract UnidadCelsius toCelsius();

	/**
	 * @return Regresa una instancia de UnidadFahrenheit con la conversión
	 */
	public abstract UnidadFahrenheit toFahrenheit();

	/**
	 * @return Regresa una instancia de UnidadKelvin con la conversión
	 */
	public abstract UnidadKelvin toKelvin();

	/**
	 * @return Regresa una instancia de UnidadRankine con la conversión
	 */
	public abstract UnidadRankine toRankine();

	/**
	 * Método que genera la representación de la unidad de medida en grados.
	 * 
	 * @return Regresa un String que contiene el módulo de la medida y concatena con
	 *         la unidad en grados.
	 */
	public String representacionUnidad() {
		return modulo + " ° " + Unidad;
	}

	/**
	 * Getter para el valor númerico (módulo) que define la cantidad de decimales a
	 * redondear.
	 * 
	 * @param decimales Cantidad de decimales a redondear.
	 * @return Retorna el valor númerico (módulo) en double
	 */
	public double getModulo(int decimales) {
		double potencia = Math.pow(10.0, (double) decimales);

		return Math.round(modulo * potencia) / potencia;
	}

	public double getModulo() {
		return modulo;
	}

	public void setModulo(double modulo) {
		this.modulo = modulo;
	}

	public String getUnidad() {
		return Unidad;
	}

	public void setUnidad(String unidad) {
		Unidad = unidad;
	}

}
