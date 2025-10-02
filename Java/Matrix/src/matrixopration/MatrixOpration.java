package matrixopration;
import java.util.*;

public class MatrixOpration {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Row");
		int rows = sc.nextInt();
		System.out.println("Enter Size of col");
		int col = sc.nextInt();
		int[][] arr = new int[rows][col];
		
		while(true) {
			System.out.println();
			System.out.println("=============================");
			System.out.println("1: Accepts Data\n2 : Display Data");
			System.out.println("3:Add all number\n4: Addtion of Rowwise"
					+ "\n5:Coloumn Addtion\n6.Find max in Elements"
					+ "\n7.Find Min in Elements\n8.MAX in Rowwise");
			System.out.println("Enter Choice");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				Oprations.AcceptsData(arr);
				break;
			case 2:
				Oprations.Display(arr);
				break;
			case 3:
				int sum=Oprations.addAllNumber(arr);
				System.out.println("Addition of All Elements in Matrix "+sum);
				break;
			case 4:
				int[] add = Oprations.Rowise(arr);
				System.out.println("Addtion of Row ");
				for(int i = 0; i < add.length; i++) {
					System.out.print(add[i] + "\t");
				}
				System.out.println();
				break;
			case 5:
				int[] colAdd = Oprations.Coloumwise(arr);
				System.out.println(" Addtions of Coloum");
				for(int i = 0; i < colAdd.length; i++) {
					System.out.print(colAdd[i] + "\t");
				}
				System.out.println();
				break;
			case 6:
				int max=Oprations.FindMax(arr);
				System.out.println("MAX element is "+max);
			     break;
			case 7:
				int min=Oprations.FindMin(arr);
				System.out.println("MIN element is "+min);
			     break;
			case 8:
				int [] rowmax = Oprations.RowMax(arr);
				System.out.println("MAX elements in ROW");
				for(int i=0;i<rowmax.length;i++)
				{
					System.out.print(rowmax[i]+"\t");
				}
				System.out.println();
				break;
			 
			}
			
		}
		
	}

}
