package org.lessons.java.snack2;

public class ContoBancario {
	
	
	private int numeroConto;
	private int saldo;
	
	
	public ContoBancario(int numeroConto) {
		this.numeroConto = numeroConto;
		this.saldo = 0;
	}
	
	public int getsSaldo() {
		return this.saldo;
	}

	public void deposita(int numeroDepositato) {
		this.saldo += numeroDepositato;
	}

	public void preleva(int numeroPrelevato) {
		int saldoEventuale= this.saldo - numeroPrelevato;
		
		if (saldoEventuale>0 && numeroPrelevato > 0) {
			this.saldo -= numeroPrelevato;
		}		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
