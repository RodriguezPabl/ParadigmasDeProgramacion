package edu.unlam.oop;

public class Punto {
	private double x;
	private double y;
	
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double obtenerX() {
		return this.x;
	}
	
	public double obtenerY() {
		return this.y;
	}
	
	public void cambiarX(double nuevoX) {
		this.x = nuevoX;
	}
	
	public void cambiarY(double nuevoY) {
		this.y = nuevoY;
	}
	
	public boolean estaSobreEjeX() {
		if(this.y == 0)
			return true;
		return false;
	}
	
	public boolean estaSobreEjeY() {
		if(this.x == 0)
			return true;
		return false;
	}
	
	public boolean esElOrigen() {
		if(this.x == 0 && this.y == 0)
			return true;
		return false;
	}
	
	public double distanciaAlOrigen() {
		return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
	}
	
	public double distanciaAlOtroPunto(Punto otro) {
		return Math.sqrt(Math.pow(this.x-otro.x, 2) + Math.pow(this.y-otro.y, 2));
	}
}
