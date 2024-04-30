package edu.unlam.oop;

public class CuentaCorriente extends Cuenta{
	private double descubierto;
	
	public CuentaCorriente() {
		super();
		this.descubierto = 10000;
	}
	
	public boolean retirar(double dinero) {
		if(this.saldo + this.descubierto >= dinero) {
			this.saldo -= dinero;
			return true;
		}
		return false;
	}

}
