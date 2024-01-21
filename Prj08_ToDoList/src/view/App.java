package view;

import java.util.Scanner;

import controller.TodoController;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean cond = true;
		
		while(cond)
		{
			
			System.out.println( menu());
			int risposta= domanda("inserisci scelta");
			System.out.println("scelta effettuata è: "+ risposta);
			
			if(risposta==1)
			{
				
			}
			
		}
		
		System.out.println(menu());
		System.out.println("grz");
	}

	private static int domanda(String question) {
		// TODO Auto-generated method stub
		System.out.println(question);
		Scanner sc= new Scanner(System.in);
		int scelta=sc.nextInt();
		//sc.close();
		
		
		return scelta;
	}

	private static String menu() {
		String s="";
		
		s=s.concat("***********************\n");
		s+="1) add ToDo\n";
		// oppure 
		s=s.concat("2) print all\n");
		s=s.concat("3) exit\n");
		s=s.concat("***********************\n");
		
		return s;
	}
}
