package edu.unlam.oop;

public class Cerradura {
	private int clave;
	private int fallosHastaBloqueo;
	private int fallos = 0;
	private int fallosConsecutivos = 0;
	private int aciertos = 0;
	private int estado = 0;
	
	public Cerradura(int claveDeApertura, int cantidadDeFallosConsecutivosQueLaBloquean) {
		this.clave = claveDeApertura;
		this.fallosHastaBloqueo = cantidadDeFallosConsecutivosQueLaBloquean;
	}
	
	public boolean abrir(int clave) {
		if(this.fallosHastaBloqueo > 0)
		{
			if(this.clave == clave)
			{
				this.estado = 1;
				this.fallosHastaBloqueo += this.fallosConsecutivos;
				this.fallosConsecutivos = 0;
				this.aciertos++;
				return true;
			}
			else
			{
				this.fallos++;
				this.fallosConsecutivos++;
				this.fallosHastaBloqueo--;
				return false;
			}
		}				
		return false;
	}
	
	public void cerrar() {
		this.estado = 0;
	}
	
	public boolean estaAbierta() {
		if(this.estado == 1)
			return true;
		return false;
	}
	
	public boolean estaCerrada() {
		if(this.estado == 0)
			return true;
		return false;
	}
	
	public boolean fueBloqueada() {
		if(this.fallosHastaBloqueo == 0)
			return true;
		return false;
	}
	
	public int contarAperturasExitosas() {
		return this.aciertos;
	}
	
	public int contarAperturasFallidas() {
		return this.fallos;
	}
	
}
