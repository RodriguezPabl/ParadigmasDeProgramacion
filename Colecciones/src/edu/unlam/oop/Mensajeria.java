package edu.unlam.oop;

import java.util.Objects;

public class Mensajeria implements Comparable<Mensajeria>{
	private int numeroDeSeguimiento;
	private String dirOrigen;
	private String dirDestino;
	private int peso;
	
	public Mensajeria(int numseg, String dirori, String dirdes, int peso) {
		numeroDeSeguimiento = numseg;
		dirOrigen = dirori;
		dirDestino = dirdes;
		this.peso = peso;
	}
	
	public int getPeso() {
		return peso;
	}
	
	public int getNumeroDeSeguimiento() {
		return numeroDeSeguimiento;
	}
	
	@Override
	public int compareTo(Mensajeria o) {
		int p1 = this.getPeso();
		int p2 = o.getPeso();
		
		return p1 - p2;
	}
	
	@Override
	public String toString() {
		return "Mensajeria [numeroDeSeguimiento=" + numeroDeSeguimiento + ", dirOrigen=" + dirOrigen + ", dirDestino="
				+ dirDestino + ", peso=" + peso + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mensajeria other = (Mensajeria) obj;
		return Objects.equals(dirDestino, other.dirDestino) && Objects.equals(dirOrigen, other.dirOrigen)
				&& numeroDeSeguimiento == other.numeroDeSeguimiento && peso == other.peso;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(dirDestino, dirOrigen, numeroDeSeguimiento, peso);
	}
	
	
}
