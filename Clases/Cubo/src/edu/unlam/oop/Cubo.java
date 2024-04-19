package edu.unlam.oop;

public class Cubo {
	private double longitudLado;
	
	public Cubo(double longitudLado) {
		if(longitudLado <= 0)
			System.out.println("La longitud del lado es menor o igual a 0");
		this.longitudLado = longitudLado;
	}
	
	public double obtenerLado() {
		return this.longitudLado;
	}
	
	public void cambiarLado(double longitudLado) {
		if(longitudLado <= 0)
			System.out.println("La longitud del lado es menor o igual a 0");
		this.longitudLado = longitudLado;
	}
	
	public double obtenerAreaCara() {
		return Math.pow(this.longitudLado, 2);
	}
	
	public void cambiarAreaCara(double areaCara) {
		if(areaCara <= 0)
			System.out.println("La longitud del area es menor o igual a 0");
		this.longitudLado = Math.sqrt(areaCara);
	}
	
	public double obtenerVolumen() {
		return Math.pow(this.longitudLado, 3);
	}
	
	public void cambiarVolumen(double volumen) {
		if(volumen <= 0)
			System.out.println("La longitud del volumen es menor o igual a 0");
		this.longitudLado = Math.cbrt(volumen);
	}
}
