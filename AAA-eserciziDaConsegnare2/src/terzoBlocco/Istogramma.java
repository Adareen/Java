package terzoBlocco;

public class Istogramma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vettore= {5,1,2};
		printArray(vettore);
	}

	private static void printArray(int[] vettore) {
		// TODO Auto-generated method stub
		for(int i=0;i<vettore.length;i++)
		{
			System.out.print(i+": ");
			//int val= vettore[i];
			for(int j=0; j<vettore[i]; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
