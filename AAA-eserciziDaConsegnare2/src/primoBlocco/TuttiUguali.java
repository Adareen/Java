package primoBlocco;

import java.util.Scanner;

public class TuttiUguali {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.print("a:");
		int a=sc.nextInt();
		
		System.out.print("b:");
		int b=sc.nextInt();
		System.out.print("c:");
		int c=sc.nextInt();
		
		if(compare(a,b,c)==1)
			System.out.println("tutti uguali");
			else
				System.out.println("almeno uno diverso");
	}

	private static int compare(int a, int b, int c) {
		// TODO Auto-generated method stub
		if(a==b && b==c)
			return 1;
		else 
			return 2;
	}
	


}
