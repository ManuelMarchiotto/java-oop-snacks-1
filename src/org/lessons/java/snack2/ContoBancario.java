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
	
	int getNumber() {
		return this.numeroConto;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContoBancario conto = new ContoBancario(101);
		
		System.out.println("il saldo iniziale del conto numero" + conto.getNumber() + " è di:" + conto.getsSaldo() +"€" + "\n");
		conto.deposita(100);
		conto.preleva(90);
		System.out.println("il saldo iniziale del conto numero" + conto.getNumber() +  "è di:" + conto.getsSaldo() +"€" + "\n");
		
	}

}
