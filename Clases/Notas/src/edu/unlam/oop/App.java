package edu.unlam.oop;

public class App {

	public static void main(String[] args) {
		Nota alu1 = new Nota(7);
		Nota alu2 = new Nota (3);
		
		System.out.println(alu1.obtenerValor());
		if(alu1.aprobado())
			System.out.println("El alumno esta aprobado");
		
		System.out.println(alu2.obtenerValor());
		if(alu2.desaprobado())
			System.out.println("El alumno esta desaprobado");

	}
}