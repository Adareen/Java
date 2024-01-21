package terzoBlocco;

import java.util.Scanner;

public class ReadAndWriteArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray=new int[5];
		
		System.out.println("inserisci 5 valori: ");
		riempiArray(myArray);
		stampaArray(myArray);
		

	}

	private static void stampaArray(int[] myArray) {
		// TODO Auto-generated method stub
		for(int i=0; i<myArray.length; i++)
		{
			System.out.print(myArray[i]+" ");
		}
		
	}

	private static void riempiArray(int[] myArray) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<myArray.length; i++)
		{
			myArray[i]=sc.nextInt();
		}
		
	}

}
