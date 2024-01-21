package primoBlocco;

import java.util.Scanner;


public class Concatena {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=new String("");
		String s2=new String("");
		String s3=new String("");
		System.out.print("prima stringa:");
		s1=sc.next();
		System.out.print("seconda stringa:");
		s2=sc.next();
		System.out.print("terza stringa:");
		s3=sc.next();
		
		System.out.println(concatena(s1, concatena(s2, s3)));
		//System.out.println();
		
		
	}

	private static String concatena(String s1, String s2) {
		// TODO Auto-generated method stub
		String concatenata= new String("*");
		concatenata=s1.concat(concatenata);
		concatenata=concatenata.concat(s2);
		
		return concatenata;
	}

}
