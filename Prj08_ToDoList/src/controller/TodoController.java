package controller;

public class TodoController {

	public Todo[] lista; // da vedere meglio 
	public TodoController() {
		lista= new Todo[5];
		System.out.println("controller costruito!");
	}
	
	public void addTodo(String desc, int pos)
	{
		Todo temp= new Todo(desc);
		lista[pos] =temp;
		System.out.println("ToDo aggiunto alla lista");
	}
	
	
	
}
