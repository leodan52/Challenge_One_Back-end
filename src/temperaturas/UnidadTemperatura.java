package temperaturas;

public abstract class UnidadTemperatura {

	private double modulo;
	private String Unidad;

	public abstract UnidadCelsius toCelsius();

	public abstract UnidadFahrenheit toFahrenheit();

	public abstract UnidadKelvin toKelvin();

	public abstract UnidadRankine toRankine();

	public String representacionUnidad() {
		return modulo + " ° " + Unidad;
	}

	public double getModulo(int decimales) {
		double potencia = Math.pow(10.0, (double) decimales);
		
		return Math.round(modulo*potencia)/potencia;
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
