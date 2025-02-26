package org.cuatrovientos.dam.entornos.diagramasdeclases.ejercicio2;

public class Product extends Invoice {

	private String name;
	private int qty;
	private float price;
	public Product() {
		super();
	}
	public Product(String name, int qty, float price) {
		super();
		this.name = name;
		this.qty = qty;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", qty=" + qty + ", price=" + price + "]";
	}
	
	
	public float total() {
		float totalPrice;
		
		totalPrice=qty*price;
		
		return totalPrice;
	}
	
	
	
	
	
	
}
