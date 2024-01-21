package view;

import controller.CanzoneCtrl;
import model.Canzone;

public class App {
	
	public static void main(String[] args)
	{
		CanzoneCtrl database=new CanzoneCtrl();
		//CanzoneCtrl ctrl2=new CanzoneCtrl();
		database.caricaCanzoniDB();
		
		Canzone[] tutteCanzoni= database.canzoni;
		
		for (Canzone canzone : tutteCanzoni) {
			System.out.println(canzone.stampa());
		}
	
	}

}
