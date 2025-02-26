package org.cuatrovientos.dam.entornos.ejercicio4;

public class Productos extends Usuario {

	private String nombre;
	private int cantidad;
	private boolean comprado;

	public Productos(String nombre, int cantidad) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.comprado = false;
	}

	public void cambiarEstado() {
		this.comprado = !this.comprado;

	}

	public String getNombre() {
		return nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public boolean isComprado() {
		return comprado;
	}
}
