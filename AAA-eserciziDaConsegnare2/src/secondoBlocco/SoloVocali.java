package secondoBlocco;

import java.util.Scanner;

public class SoloVocali {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String myString = new String("");
		System.out.print("inserisci stringa: ");
		myString=sc.nextLine();
		soloVocali(myString);
	}

	private static void soloVocali(String myString) {
		// TODO Auto-generated method stub
		for(int i=0;i<myString.length();i++)
		{
			if(myString.charAt(i)=='a' || myString.charAt(i)=='e' || myString.charAt(i)=='i' || myString.charAt(i)=='u' || myString.charAt(i)=='o')
			{
				System.out.print(myString.charAt(i));
			}
		}
	}

}
