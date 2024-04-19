package edu.unlam.oop;

public class App {

	public static void main(String[] args) {
		Cubo cubo = new Cubo(2);
		
		System.out.println(cubo.obtenerLado());
		System.out.println(cubo.obtenerAreaCara());
		System.out.println(cubo.obtenerVolumen());
		
		System.out.println("Cambio de area:");
		cubo.cambiarAreaCara(9);
		System.out.println(cubo.obtenerLado());
		System.out.println(cubo.obtenerAreaCara());
		System.out.println(cubo.obtenerVolumen());
		
		System.out.println("Cambio de volumen:");
		cubo.cambiarVolumen(729);
		System.out.println(cubo.obtenerLado());
		System.out.println(cubo.obtenerAreaCara());
		System.out.println(cubo.obtenerVolumen());
	}

}
