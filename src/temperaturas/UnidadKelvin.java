package temperaturas;

/**
 * Clase que define el comportamiento y atributos de la unidad de temperatura
 * Kelvin. Extiende de la clase UnidadTemperatura.
 * 
 * @author Santiago García, Leonardo D.
 *
 */

public class UnidadKelvin extends UnidadTemperatura {

	/**
	 * Constructor de la clase sin argumentos. Se espera que el usuario defina
	 * posteriormente el módulo de la medida
	 */
	public UnidadKelvin() {
		this.setUnidad("k");
	}

	/**
	 * Constructor con argumentos. Se define el módulo de la medida.
	 * 
	 * @param modulo Se infresa un double con el módulo de la medida.
	 */
	public UnidadKelvin(double modulo) {

		this.setModulo(modulo);
		this.setUnidad("k");

	}

	/**
	 * Se reescribe el método de representación ya que las unidades Kelvin no son
	 * grados
	 * 
	 * @return Regresa un String que contiene el módulo de la medida y concatena con
	 *         la unidad.
	 */
	@Override
	public String representacionUnidad() {
		return this.getModulo() + " K";
	}

	/**
	 * Convierte la unidad Kelvin a Celsius
	 */
	@Override
	public UnidadCelsius toCelsius() {
		return new UnidadCelsius(this.getModulo() - 273.15);
	}

	/**
	 * Convierte la unidad Kelvin a Fahrenheit
	 */
	@Override
	public UnidadFahrenheit toFahrenheit() {
		UnidadCelsius unidadCelsius = toCelsius();

		return unidadCelsius.toFahrenheit();
	}

	@Override
	public UnidadKelvin toKelvin() {
		return this;
	}

	/**
	 * Convierte la unidad Kelvin a Rankine
	 */
	@Override
	public UnidadRankine toRankine() {
		UnidadCelsius unidadCelsius = this.toCelsius();
		return unidadCelsius.toRankine();
	}

}
