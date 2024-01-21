package controller;



public class Todo {

	public String descrizione;
	public boolean completo;
	public Todo(String desc)
	{
		descrizione = desc;
		completo=false;
		System.out.println("Creato nuovo");
	}
	
	public void completa() {
		completo=true;
	}
	

}
