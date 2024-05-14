package edu.unlam.oop;

import java.time.LocalDateTime;

public class Fecha {
	private int dia, mes, anio;
	
	@Override
	public String toString() {
		return "[" + dia + "/" + mes + "/" + anio + "]";
	}

	public Fecha() {
		LocalDateTime localDate = LocalDateTime.now();
		setDia(localDate.getDayOfMonth());
		setMes(localDate.getMonthValue());
		setAnio(localDate.getYear());
	}
	
	public Fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}
}
