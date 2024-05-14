package edu.unlam.oop;

public class TiendaDeRopa {
	private int numeroDeVenta;
	private Fecha fecha;
	private Hora hora;
	private String nombreDelCliente;
	private double montoDeLaVenta;
	
	public TiendaDeRopa(int numVent, String nombreCli, double monto) {
		numeroDeVenta = numVent;
		nombreDelCliente = nombreCli;
		montoDeLaVenta = monto;
		fecha = new Fecha();
		hora = new Hora();
		
	}

	@Override
	public String toString() {
		return "TiendaDeRopa [Numero de venta: " + numeroDeVenta + ", Cliente: " + nombreDelCliente + ", Monto: " + montoDeLaVenta + ", fecha=" + fecha + ", hora=" + hora
				+ "]";
	}

	public int getNumeroDeVenta() {
		return numeroDeVenta;
	}

	public void setNumeroDeVenta(int numeroDeVenta) {
		this.numeroDeVenta = numeroDeVenta;
	}

	public Fecha getFecha() {
		return fecha;
	}

	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}

	public Hora getHora() {
		return hora;
	}

	public void setHora(Hora hora) {
		this.hora = hora;
	}

	public String getNombreDelCliente() {
		return nombreDelCliente;
	}

	public void setNombreDelCliente(String nombreDelCliente) {
		this.nombreDelCliente = nombreDelCliente;
	}

	public double getMontoDeLaVenta() {
		return montoDeLaVenta;
	}

	public void setMontoDeLaVenta(double montoDeLaVenta) {
		this.montoDeLaVenta = montoDeLaVenta;
	}
}
