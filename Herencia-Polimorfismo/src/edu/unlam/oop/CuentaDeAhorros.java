package edu.unlam.oop;

public class CuentaDeAhorros extends Cuenta{
	private double saldoReservado;
	
	public CuentaDeAhorros() {
		super();
		this.saldoReservado = 0;
	}
	
	public boolean reservar(double dinero) {
		if(dinero > 0) {
			this.saldoReservado += dinero;
			return true;
		}
		return false;
	}
	
	public boolean reintegrar(double dinero) {
		if(this.saldoReservado >= dinero && dinero > 0) {
			this.saldoReservado -= dinero;
			this.saldo += dinero;
			return true;
		}
		return false;
	}
	
	public boolean transferir(Cuenta cuentaDestino, double dinero) {
		return false;
	}
}
