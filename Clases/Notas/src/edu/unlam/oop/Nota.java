package edu.unlam.oop;

public class Nota {
	
    private int nota;
    
    public Nota(int valorInicial) {
    	this.nota = valorInicial;
    }
    
    public int obtenerValor() {
    	return this.nota;
    }
    

    public boolean aprobado() {
    	if(this.nota >= 4)
    		return true;
    	return false;
    }
    
    public boolean desaprobado() {
    	if(this.nota < 4)
    		return true;
    	return false;
    }
}
