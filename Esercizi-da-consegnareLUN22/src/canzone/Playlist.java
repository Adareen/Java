package canzone;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Playlist {

	ArrayList<Canzone> playlist=new ArrayList<Canzone>(); // dichiaro l'arraylist di canzoni
	
	public void aggiungi(String titolo, int durata, String autore) {
		Canzone canzone= new Canzone(titolo, durata, autore);
		this.playlist.add(canzone);
		System.out.println("canzone: " + titolo +" - aggiunta");
	}
	
	public void eliminaAutore(String autore)
	{
		// ho dovuto cercare online. la prima volta ho usato foreach e remove method dall'arraylist ma dava concurrantmodexc
		for(Iterator<Canzone> itr = playlist.iterator();
        itr.hasNext();)
		{            
			Canzone canzone = itr.next();            
			if(canzone.autore.equals(autore))
			{
				System.out.println("rimuovo -> "+canzone);
				// listOfPhones.remove(phone);  // wrong again
				itr.remove(); // right call
			}
}
		
	}
	
	public boolean haDuplicati() {
		boolean duplicati=false;
		int cnt=0;
		for (Canzone canzone : playlist) {
			for (Canzone canzone2 : playlist) 
			{
				if(canzone2.titolo.equals(canzone.titolo) && canzone2.durata==canzone.durata)
				{
					cnt++;
					//System.out.println("trovo primo valore - normale");
					if(cnt>1)
					{
						System.out.println("trovato duplicato");
						duplicati=true;
						cnt=1;
					}
				}
			}cnt=0;	
		}
		return duplicati;
	}
	
	public int quanteAutore(String autore)
	{
		int cnt=0;
		for (Canzone canzone : playlist) {
			if(canzone.autore.equals(autore))
					cnt++;
		
		}
		return cnt;
	}
	
	public int quanteCanzoni(ArrayList<Canzone> playlist)
	{
		int cnt=0;
		for (Canzone canzone : playlist) {
			cnt++;
		}
		return cnt;
	}
	
	public void stampaAutore(String autore)
	{
		for (Canzone canzone : playlist) {
			if(canzone.autore.equals(autore))
				System.out.println(canzone);
			
		}
	}
}

