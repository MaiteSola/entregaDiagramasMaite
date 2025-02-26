package org.cuatrovientos.dam.entornos.ejercicio6;

public abstract class Cuenta {
	
	protected int numCuenta;
	public int getNumCuenta() {
		return numCuenta;
	}


	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}


	public String getTitular() {
		return titular;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	protected String titular;
	protected double saldo;
	
	
	public Cuenta(int numCuenta, String titular, int saldo) {
		super();
		this.numCuenta = numCuenta;
		this.titular = titular;
		this.saldo = saldo;
	}


	public Cuenta() {
		super();
	}
	
	
	public void depDinerio(double cantidad) {
		
		//TODO implementar
	}
	
	public void retDinero(double cantidad) {
		
		//TODO implementar
	}
	
	public void mostrarInfo() {
		//TODO implementar: mostrar la cuenta.
	}
	
	

}
