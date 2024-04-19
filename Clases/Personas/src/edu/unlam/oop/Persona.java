package edu.unlam.oop;

public class Persona {
	// ATRIBUTOS
	private String nombre;
	private int edad;
	
	// CONSTRUCTOR
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	// MÉTODOS
	public boolean esMayorDeEdad() {
		return this.edad >= 18;
	}
	
	public String presentarse() {
		return "Hola, me llamo " + this.nombre;
	}
}
