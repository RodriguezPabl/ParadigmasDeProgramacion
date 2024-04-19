package edu.unlam.oop;

public class App {

	public static void main(String[] args) {
		Persona lucas = new Persona("Lucas", 18);
		
		System.out.println(lucas.presentarse());
		System.out.println(lucas.esMayorDeEdad());
		// XXX: task pendiente
		
		//Arrange (presentar)
		Vector vec = new Vector(1,2,3);
		Vector vec2 = new Vector(4,5,6);
		
		//Act (actura)
		Vector vec3 = vec.sumaConVector(vec2);
		
		//Assert (verificar)
		
		
		//Annihilate (Restaurar)
		
	}
	
}