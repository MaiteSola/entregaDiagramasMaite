package org.cuatrovientos.dam.entornos.ejercicio4;

public class Usuario {

	private String nombre;
	protected String id;
	private ListaCompra listaCompra;
	
	
	public Usuario() {
		super();
	}

	public Usuario(String nombre, String id) {
		
		this.setNombre(nombre);
		this.id = id;
		this.setListaCompra(new ListaCompra());
		
	} 
	
	public void agregarProducto(String nombre, int cantidad) {
		//TODO hay que implementarlo
		//listaCompra.agregarProducto(nombre,cantidad);
	}
	
	public void verLista() {
		//TODO implementar el método
	}
	
	public void tacharLista(String nombre, int cantidad) {
		//TODO implementar
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ListaCompra getListaCompra() {
		return listaCompra;
	}

	public void setListaCompra(ListaCompra listaCompra) {
		this.listaCompra = listaCompra;
	}
}
