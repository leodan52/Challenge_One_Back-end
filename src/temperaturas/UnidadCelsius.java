package temperaturas;

/**
 * Clase que define el comportamiento y atributos de la unidad de temperatura
 * Celsius. Extiende de la clase UnidadTemperatura.
 * 
 * @author Santiago García, Leonardo D.
 *
 */

public class UnidadCelsius extends UnidadTemperatura {

	/**
	 * Constructor de la clase sin argumentos. Se espera que el usuario defina
	 * posteriormente el módulo de la medida
	 */
	public UnidadCelsius() {
		this.setUnidad("C");
	}

	/**
	 * Constructor con argumentos. Se define el módulo de la medida.
	 * 
	 * @param modulo Se infresa un double con el módulo de la medida.
	 */
	public UnidadCelsius(double modulo) {

		this.setModulo(modulo);
		this.setUnidad("C");

	}

	@Override
	public UnidadCelsius toCelsius() {
		return new UnidadCelsius(this.getModulo());
	}

	/**
	 * Convierte la unidad Celsius a Fahrenheit
	 */
	@Override
	public UnidadFahrenheit toFahrenheit() {
		double salidaModulo = (9.0 / 5.0) * this.getModulo() + 32.0;
		return new UnidadFahrenheit(salidaModulo);
	}

	/**
	 * Convierte la unidad Celsius a Kelvin
	 */
	@Override
	public UnidadKelvin toKelvin() {
		return new UnidadKelvin(this.getModulo() + 273.15);
	}

	/**
	 * Convierte la unidad Celsius a Rankine
	 */
	@Override
	public UnidadRankine toRankine() {
		double salidaModulo = (9.0 / 5.0) * this.getModulo() + 491.67;
		return new UnidadRankine(salidaModulo);
	}

}
