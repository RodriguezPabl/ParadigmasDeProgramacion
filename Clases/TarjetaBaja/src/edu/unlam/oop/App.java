package edu.unlam.oop;

public class App {

	public static void main(String[] args) {
		TarjetaBaja sube = new TarjetaBaja(500);
		
		for(int i=0; i<10 && sube.obtenerSaldo() >= 34.50; i++)
		{
			sube.pagarViajeEnColectivo();
			System.out.println(sube.obtenerSaldo());
			sube.pagarViajeEnSubte();
			System.out.println(sube.obtenerSaldo());
			sube.cargar(10);
			System.out.println(sube.obtenerSaldo());
		}
		
		System.out.println("La cantidad de viajes realizados es de: " + sube.contarViajes());
		System.out.println("La cantidad de viajes realizados en colectivo es de: " + sube.contarViajesEnColectivo());
		System.out.println("La cantidad de viajes realizados en subte es de: " + sube.contarViajesEnSubte());
	}

}
