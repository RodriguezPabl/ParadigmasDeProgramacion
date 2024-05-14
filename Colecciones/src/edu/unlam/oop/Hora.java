package edu.unlam.oop;

import java.time.LocalDateTime;

public class Hora {
	private int hora, minuto, segundo;
	
	public Hora() {
		LocalDateTime localDate = LocalDateTime.now();
		setHora(localDate.getHour());
		setMinuto(localDate.getMinute());
		setSegundo(localDate.getSecond());
	}

	@Override
	public String toString() {
		return "[" + hora + ":" + minuto + ":" + segundo + "]";
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}
}
