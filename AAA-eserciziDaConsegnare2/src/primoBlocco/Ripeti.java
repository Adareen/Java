package primoBlocco;

import java.util.Scanner;

public class Ripeti {

	public static void main(String[] args) {
		
		System.out.println("inserire una stringa e un numero intero positivo.");
		Scanner sc=new Scanner(System.in);
		String myString=new String("");
		myString=sc.nextLine();
		int n=sc.nextInt();
		stampaCopie(myString, n);
		
		

	}
	
	public static void stampaCopie(String testo, int numeroCopie)
	{
		if(numeroCopie<0)
			System.out.println("errore");
		else
			for(int i=0; i<numeroCopie; i++)
			System.out.println(testo);
	}

}
