package secondoBlocco;

import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("inserisci numero di caratteri: ");
		Scanner sc=new Scanner(System.in);
		int caratteri=sc.nextInt();
		
		System.out.println("La password generata: "+ passwordGenerator(caratteri));
		

	}

	private static String passwordGenerator(int caratteri) {
		// TODO Auto-generated method stub
		String password= new String("");
		for(int i=0; i<caratteri; i++)
		{
			int seed= (int) Math.ceil(Math.random()*126);
			char c=(char)seed;
			if(seed>=33)
			{
				password+=c; // uso la concatenazione delle stringhe con + 
			}else
				i--;
			
		}
		
		
		return password;
		
	}

}
