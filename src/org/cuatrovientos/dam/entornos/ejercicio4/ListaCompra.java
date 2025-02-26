package org.cuatrovientos.dam.entornos.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class ListaCompra extends Usuario {

	private List<Productos> producto;

	public ListaCompra() {
		super();
		setProducto(new ArrayList<>());

	}

	public List<Productos> getProducto() {
		return producto;
	}

	public void setProducto(List<Productos> producto) {
		this.producto = producto;
	}

	public void agregarProducto(String nombre, int cantidad) {
		// TODO implementar: Añadir a la lista
	}

	public void verProductos() {
		// TODO implentar. Con un for each imprimir todos los productos de la lista y
		// sus cantidades.
	}

	public void tacharProducto(String nombre) {
		// TODO implementar: Con un equals buscar el producto a tachar en un for each y
		// cambiar su estado de producto.
	}

}
