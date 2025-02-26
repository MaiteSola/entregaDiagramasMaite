package org.cuatrovientos.dam.entornos.diagramasdeclases.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Invoice {
	
	private String customer;
	private List<Product> products;
	public Invoice(String customer) {
		super();
		this.setCustomer(customer);
		this.products= new ArrayList<>();
		
	}
	
	
	
	
	public Invoice() {
		super();
	}




	public void add(Product p) {
		products.add(p);
	}
	
	public void remove(int index) {
		//TODO implementar
	}
	
	public float total() {
		return 0;
		//TODO mostrar un total
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}
	
	
	
	
	//falta métodos de invoice

}
