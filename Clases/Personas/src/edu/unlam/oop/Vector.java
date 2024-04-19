package edu.unlam.oop;

import java.util.Objects;

public class Vector {
	private int valorX;
	private int valorY;
	private int valorZ;
	
	public Vector(int x, int y, int z) {
		this.valorX = x;
		this.valorY = y;
		this.valorZ = z;
	}
	
	public Vector multiplicacionPorEscalar(int escalar) {
		return new Vector(this.valorX * escalar, this.valorY * escalar, this.valorZ * escalar);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(valorX, valorY, valorZ);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vector other = (Vector) obj;
		return valorX == other.valorX && valorY == other.valorY && valorZ == other.valorZ;
	}

	public Vector sumaConVector(Vector vec) {
		int x = this.valorX + vec.valorX;
		int y = this.valorY + vec.valorY;
		int z = this.valorZ + vec.valorZ;
		return new Vector(x,y,z);
	}
	
	public Vector restaConVector(Vector vec) {
		return this.sumaConVector(vec.opuesto());
	}
	
	private Vector opuesto( ) {
		return new Vector(-this.valorX,-this.valorY,-this.valorZ);
	}
	
	public void mostrarVector() {
		System.out.println("(" + this.valorX + "," + this.valorY + "," + this.valorZ + ")");
	}
}
