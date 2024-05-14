package edu.unlam.oop;

public class Excepcion{
	
	public Excepcion() {
		
	}
	
	public static void main(String[] args) throws MiExcepcion{
		Excepcion e = new Excepcion();
		e.dividir(2, 0);
		e.raizCuadrada(-1);
		
		//Ejercicio 4
		CuentaBancaria c1 = new CuentaBancaria(20000);
		c1.retirar(15000);
		c1.retirar(7500);
	}
	
	//Ejercicio 3
	public void dividir(int n1, int n2) {
		int n;
		try {
			n = n1 / n2;
			System.out.println("La division dio: " + n);			
		}
		catch(ArithmeticException e) {
			System.out.println("Excepcion capturada: " + e.getMessage());
			return;
		}
	}
	
	//Ejercicio 2
	public void raizCuadrada(int n) {
		int r;
		try {
			if(n < 0)
				throw new MiExcepcion("Numero invalido");
			r = (int) Math.sqrt(n);
			System.out.println("La raiz cuadrada de "+ n + " es: " + r);
		}
		catch(MiExcepcion e) {
			
		}
	}
}