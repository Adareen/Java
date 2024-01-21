package controller;

import model.Canzone;

public class PlayList {
	public Canzone[] canzoni;
	public String nome;
	
	public Playlist(String nome)
	{
		this.nome=nome;
		this.canzoni=new Canzone[10];
		System.out.println("costruito playlist");
		
	}
	
}
