package edu.unlam.oop;

public class App {

	public static void main(String[] args) {
		Punto a = new Punto(1,0);
		Punto b = new Punto(4,3);
		
		if(b.estaSobreEjeX())
			System.out.println("Esta sobre el eje X");
		else
			System.out.println("No esta sobre el eje X");
		
		if(b.estaSobreEjeY())
			System.out.println("Esta sobre el eje Y");
		else
			System.out.println("No esta sobre el eje Y");
		
		if(a.estaSobreEjeY())
			System.out.println("Esta sobre el eje de coordenadas");
		else
			System.out.println("No esta sobre el eje de coordenadas");

		System.out.println(b.distanciaAlOrigen());
		
		System.out.println(a.distanciaAlOtroPunto(b));
	}

}
