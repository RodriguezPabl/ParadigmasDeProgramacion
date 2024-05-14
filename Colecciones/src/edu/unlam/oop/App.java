package edu.unlam.oop;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		System.out.println("Ejercicio 1:\n");
		List<Mensajeria> lista = new ArrayList<Mensajeria>();
		int peso = 20;
		
		agregarPaquete(lista, 1, "a", "b", 30);
		agregarPaquete(lista, 4, "b", "c", 15);
		agregarPaquete(lista, 3, "c", "a", 20);
		agregarPaquete(lista, 6, "a", "c", 25);
		agregarPaquete(lista, 5, "d", "b", 5);
		
		System.out.println("Busqueda por numero de seguimiento:\n\t" + buscarPorNumeroDeSeguimiento(lista,5) + "\n");
		
		System.out.println("Paquetes que son mas pesados que " + peso + "Kg:");
		mostrarPaquetesConMasDeXPeso(lista, peso);
		
		System.out.println("\nEjercicio 2:\n");
		List<TiendaDeRopa> lista2 = new LinkedList<TiendaDeRopa>();
		Fecha fec = new Fecha(14,5,2024);
		agregarVenta(lista2, 1, "Pablo", 3000);
		agregarVenta(lista2, 7, "Romeo", 500);
		agregarVenta(lista2, 2, "Ignacio", 2500);
		agregarVenta(lista2, 4, "Pablo", 700);
		agregarVenta(lista2, 3, "Laura", 1800);
		
		System.out.println("Busqueda por numero de venta:\n\t" + buscarPorNumeroDeVenta(lista2, 2));
		
		System.out.println("Ventas en el " + fec + ":");
		mostrarVentasEnXFecha(lista2, fec);
		
	}
	
	//1.1
	public static void agregarPaquete(List<Mensajeria> lista, int numseg, String dirori, String dirdes, int peso) {
		lista.add(new Mensajeria(numseg, dirori, dirdes, peso));
	}
	
	//1.2
	public static Mensajeria buscarPorNumeroDeSeguimiento(List<Mensajeria> lista, int numseg) {
		int i = 0, fin = lista.size();
		while(i < fin) {
			Mensajeria m = lista.get(i);
			if(m.getNumeroDeSeguimiento() == numseg)
				return m;
			i++;
		}
		return null;
	}
	
	//1.3
	public static void mostrarPaquetesConMasDeXPeso(List<Mensajeria> lista, int peso) {
		lista.sort(null);
		int i = 0, fin = lista.size();
		while(i < fin) {
			Mensajeria m = lista.get(i);
			if(m.getPeso() > peso)
				System.out.println("\t" + m);
			i++;
		}
	}
	
	//2.1
	public static void agregarVenta(List<TiendaDeRopa> lista, int numVent, String nombreCli, double monto) {
		lista.add(new TiendaDeRopa(numVent, nombreCli, monto));
	}
	
	//2.2
	public static TiendaDeRopa buscarPorNumeroDeVenta(List<TiendaDeRopa> lista, int numVent) {
		int i = 0, fin = lista.size();
		while(i < fin) {
			TiendaDeRopa tienda = lista.get(i);
			if(tienda.getNumeroDeVenta() == numVent)
				return tienda;
			i++;
		}
		return null;
	}
	
	//2.3
	public static void mostrarVentasEnXFecha(List<TiendaDeRopa> lista, Fecha fecha) {
		int i = 0, fin = lista.size();
		while(i < fin) {
			TiendaDeRopa tienda = lista.get(i);
			Fecha f = tienda.getFecha();
			if(f.getAnio() == fecha.getAnio())
				if(f.getMes() == fecha.getMes())
					if(f.getDia() == fecha.getDia())
						System.out.println("\t" + tienda);
			i++;
		}
	}
}
