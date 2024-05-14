package edu.unlam.oop;

public class MiExcepcion extends RuntimeException{
	
	public MiExcepcion(String msj) {
		System.out.println("MiExcepcion: " + msj + " -- " + super.getCause());
	}
	
	public void mostrarMensaje(String msj) {
		System.out.println("Mensaje: " + msj);
	}

}
