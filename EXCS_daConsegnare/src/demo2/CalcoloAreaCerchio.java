package demo2;

import java.util.Scanner;

public class CalcoloAreaCerchio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("dammi il raggio:");
		
		double raggio=scanner.nextDouble();
		//Cerchio cerchio=new Cerchio(raggio);
		System.out.println("perimetro del cerchio vale: "+ Cerchio.perimetro(raggio));
		System.out.println("area del cerchio vale: "+ Cerchio.area(raggio));
	}

}
