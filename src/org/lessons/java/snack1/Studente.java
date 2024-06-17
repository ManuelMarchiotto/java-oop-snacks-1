package org.lessons.java.snack1;

public class Studente {
	
	private String nome;
	private String cognome;
	private int eta;
	
	public Studente(String nome, String cognome, int eta ) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}

	public String getInfoStudente() {
		return this.nome + " " +  this.cognome + ", " + this.eta  + " anni";
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studente studentessa = new Studente ("Gina", "Ginetti", 33);
		Studente studente = new Studente ("Gino", "Remotti", 66);
		System.out.println(studentessa.getInfoStudente());
		System.out.println(studente.getInfoStudente());
		
		
	}
		

}
