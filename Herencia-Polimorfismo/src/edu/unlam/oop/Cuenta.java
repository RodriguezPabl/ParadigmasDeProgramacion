package edu.unlam.oop;

public class Cuenta {
	protected double saldo;
	
	public Cuenta() {
		this.saldo = 0;
	}
	
	public boolean depositar(double dinero) {
		if(this.puedeDespositar(dinero)) {
			this.deposito(dinero);
			return true;
		}
		return false;
	}
	
	private boolean puedeDespositar(double dinero) {
		if(dinero > 0)
			return true;
		return false;
	}
	
	private void deposito(double dinero) {
		this.saldo += dinero;
	}
	
	public boolean retirar(double dinero) {
		if(this.puedeRetirar(dinero)) {
			this.retiro(dinero);
			return true;
		}
		return false;
	}
	
	private boolean puedeRetirar(double dinero) {
		if(this.saldo >= dinero)
			return true;
		return false;
	}
	
	private void retiro(double dinero) {
		this.saldo -= dinero;
	}
	
	public boolean transferir(Cuenta cuentaDestino, double dinero) {
		if(this.puedeRetirar(dinero) && cuentaDestino.puedeDespositar(dinero)) {
			this.retiro(dinero);
			cuentaDestino.deposito(dinero);
			return true;
		}
		return false;
	}
}
