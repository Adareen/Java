package canzone;

public class Canzone {
	
	public String titolo; 
	public double durata;
	
	public Object autore; 
	

	// constructor
	public Canzone(String titolo, double durata, String autore) {
		
		this.titolo = titolo;
		this.durata = durata;
		this.autore = autore;
		//System.out.println("canzone - costruita");
	}



	public  boolean haAutore(String autore) {
		if(this.autore.equals(autore)) //provare con == string -> usa equals! 
		return true;
		else
			return false;
		
	}
	
	public boolean uguali(Canzone s) // così semplice? posso passare oggetti in classi
	{
		if(this.titolo.equals(s.titolo) && this.durata==s.durata)
			return true;
		else return false;
		
	}
	
	public String toString( ) {
		
		return "Canzone: "+this.autore + " - "+this.durata + " - "+this.titolo;
		
	}
}
	
	
	


