package model;

public class Canzone {

	//proprietà dell'oggetto
	public String titolo;
	public String cantante; 
	
	//metodo costruttore
	public Canzone(String titolo, String cantante){ // new Canzone("titolo", "cantante")
		this.titolo=titolo; 
		this.cantante=cantante;
	}
	
	// per generare i costruttori puoi anche fare tasto destro source -> create constructore using fields
	
	
	
	
	public String stampa() {
		return this.cantante+ " - "+ this.cantante;
	}
	
	
}
