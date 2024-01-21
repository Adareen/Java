package controller;

import java.util.Scanner;

import model.Canzone;

public class CanzoneCtrl {
	
	public Canzone[] canzoni;
	
	public CanzoneCtrl() {
		this.canzoni=new  Canzone[10];
		System.out.println("costruito controller");
	}
	
	public void caricaCanzoniDB() {
		
		String[] database= {
				"pino e po; asd",
				"qqq; poll",
				"zcv; oer",
				"pino e po; asd",
				"qqq; poll",
				"qqq; poll",
				"qqq; poll",
				"qqq; poll",
				"qqq; poll",
				"zcv; oer"
		};
		int pos=0;
		for (String song : database) {
			
			String[] insieme=song.split(";");
			String titolo=insieme[0];
			String cantante=insieme[1];
			Canzone c=new Canzone(titolo, cantante);
			canzoni[pos++]=c;
		}
		
	}
	
	
	public void caricaCanzoniFile){
		File f=new File("canzoni2020.csv");
		try {
			String riga=s;
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
