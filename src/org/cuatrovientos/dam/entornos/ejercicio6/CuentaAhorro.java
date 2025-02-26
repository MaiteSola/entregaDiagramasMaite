package org.cuatrovientos.dam.entornos.ejercicio6;

public class CuentaAhorro extends Cuenta {

	private double interes;
	
		
	public CuentaAhorro(int numCuenta, String titular, int saldo, double interes) {
		super(numCuenta, titular, saldo);
		this.interes = interes;
	}

	public void mostrarInfo(Cuenta c, double interes) {
		//TODO muestra la información de la cuenta y el interés
	}
	
	public double aplInteres(double interes, Cuenta c) {
		return 0;
		//TODO devuelve el saldo con el interés aplicado
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}


	
	
	
}
