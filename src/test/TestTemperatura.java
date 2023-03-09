package test;

import temperaturas.UnidadCelsius;

public class TestTemperatura {
	public static void main(String[] args) {
		
		UnidadCelsius unidadCelsius = new UnidadCelsius(36);
		
		System.out.println(unidadCelsius.representacionUnidad());
		System.out.println(unidadCelsius.toFahrenheit().representacionUnidad());
		System.out.println(unidadCelsius.toKelvin().representacionUnidad());
		
	}
}
