package terzoBlocco;

import java.util.Scanner;

public class MininoDiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray=new int[3];
		
		fillArray(myArray);
		stampaMinVal(myArray);
		
		

	}

	private static void fillArray(int[] myArray) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<myArray.length; i++)
		{
			myArray[i]=sc.nextInt();
		}
		
		
	}
	

    private static void stampaMinVal(int[] myArray) {
    	int minIndex=-1;
    	int minVal = myArray[0];
    	for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] < minVal) {
                minVal = myArray[i];
                minIndex=i;
                
            }
        }
    	System.out.println("valore minimo: "+ minVal+"\t indice: "+ minIndex);
    }
}
