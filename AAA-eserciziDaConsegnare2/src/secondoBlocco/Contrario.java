package secondoBlocco;

import java.util.Scanner;

public class Contrario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String myString = new String(" ");
		System.out.print("inserisci stringa: ");
		Scanner sc=new Scanner(System.in);
		myString= sc.nextLine(); // nextLine() prende tutta la rigafino a /n
		reverseeeee(myString);
		
	}

	private static void reverseeeee(String myString) {
		// TODO Auto-generated method stub
		for (int i=myString.length()-1;i>=0;i--)
		{
			System.out.print(myString.charAt(i));
		}	
	
		
		
	}
	
	

}
