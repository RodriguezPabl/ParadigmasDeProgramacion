package edu.unlam.oop;

public class App {

	public static void main(String[] args) {
		Cerradura candado = new Cerradura(12345,10);
		
		candado.abrir(12);
		candado.abrir(123);
		candado.abrir(12345);
		
		if(candado.estaAbierta())
			System.out.println("La cerradura esta abierta");
		else
			System.out.println("La cerradura esta cerrada");
		
		candado.cerrar();
		
		candado.abrir(1);
		candado.abrir(12);
		candado.abrir(123);
		
		System.out.println("Cantidad de aperturas exitosas: " + candado.contarAperturasExitosas());
		System.out.println("Cantidad de aperturas fallidas: " + candado.contarAperturasFallidas());
		
		if(candado.fueBloqueada())
			System.out.println("La cerradura fue bloqueada");
		else
			System.out.println("La cerradura no fue bloqueada");
	}

}
