package temperaturas;

/**
 * Clase que define el comportamiento y atributos de la unidad de temperatura
 * Rankine. Extiende de la clase UnidadTemperatura.
 * 
 * @author Santiago García, Leonardo D.
 *
 */

public class UnidadRankine extends UnidadTemperatura {

	/**
	 * Constructor de la clase sin argumentos. Se espera que el usuario defina
	 * posteriormente el módulo de la medida
	 */
	public UnidadRankine() {
		this.setUnidad("R");
	}

	/**
	 * Constructor con argumentos. Se define el módulo de la medida.
	 * 
	 * @param modulo Se infresa un double con el módulo de la medida.
	 */
	public UnidadRankine(double modulo) {

		this.setModulo(modulo);
		this.setUnidad("R");

	}

	/**
	 * Convierte la unidad Rankine a Celsius
	 *
	 * @return Regresa una instancia de UnidadCelsius con la conversión
	 */
	@Override
	public UnidadCelsius toCelsius() {
		Double nuevoModulo = (5.0 / 9.0) * (this.getModulo() - 491.67);
		return new UnidadCelsius(nuevoModulo);
	}

	/**
	 * Convierte la unidad Rankine a Celsius
	 */
	@Override
	public UnidadFahrenheit toFahrenheit() {
		return new UnidadFahrenheit(this.getModulo() - 459.67);
	}

	@Override
	public UnidadKelvin toKelvin() {
		UnidadCelsius unidadCelsius = this.toCelsius();
		return unidadCelsius.toKelvin();
	}

	@Override
	public UnidadRankine toRankine() {
		return this;
	}

}
