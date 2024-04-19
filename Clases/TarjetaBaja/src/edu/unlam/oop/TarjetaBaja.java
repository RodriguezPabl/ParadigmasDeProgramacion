package edu.unlam.oop;

public class TarjetaBaja {
	private double saldo;
	private int contadorColectivo = 0;
	private int contadorSubte = 0;
	
	public TarjetaBaja(double saldoInicial) {
		this.saldo = saldoInicial;
	}
	
	public double obtenerSaldo() {
		return this.saldo;
	}
	
	public void cargar(double monto) {
		this.saldo += monto;
	}
	
	public void pagarViajeEnColectivo() {
		if(this.saldo < 39.59)
		{
			System.out.println("Saldo insuficiente para viajar en colectivo");
			return;
		}
		this.saldo -= 39.59;
		this.contadorColectivo++;
	}
	
	public void pagarViajeEnSubte() {
		if(this.saldo < 34.50)
		{
			System.out.println("Saldo insuficiente para viajar en subte");
			return;
		}
		this.saldo -= 34.50;
		this.contadorSubte++;
	}
	
	public int contarViajes() {
		return this.contadorColectivo + this.contadorSubte;
	}
	
	public int contarViajesEnColectivo() {
		return this.contadorColectivo;
	}

	public int contarViajesEnSubte() {
		return this.contadorSubte;
	}
}
