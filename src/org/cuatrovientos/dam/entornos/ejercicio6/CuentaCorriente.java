package org.cuatrovientos.dam.entornos.ejercicio6;

public class CuentaCorriente extends Cuenta {

	private double limite;
	
		
	public CuentaCorriente(int numCuenta, String titular, int saldo, double limite) {
		super(numCuenta, titular, saldo);
		this.limite = limite;
	}

	public double retDin(Cuenta c,double limite) {
		return 0;
		//TODO Devuelve el dinero a retirar.
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	
	
}
