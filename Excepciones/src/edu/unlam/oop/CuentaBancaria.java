package edu.unlam.oop;

public class CuentaBancaria {
	private double saldo;
	
	public CuentaBancaria(double monto) {
		try {
			if(monto < 0)
				throw new MiExcepcion("Monto negativo ingresado");			
			saldo = monto;
		}
		catch(MiExcepcion e) {
			
		}
	}
	
	public boolean retirar(double monto) {
		try {
			if(monto < 0)
				throw new MiExcepcion("Monto negativo ingresado");	
			if(saldo < monto)
				throw new MiExcepcion("Monto mayor al saldo de la cuenta");
			saldo -= monto;
			System.out.println("se retiraron: " + monto + " pesos");
			return true;
		}
		catch(MiExcepcion e) {
			return false;
		}
	}
}
