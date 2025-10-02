package matrixopration;
import java.util.*;

public class Oprations {

	public static void AcceptsData(int[][] arr) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Elements ");
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
				
			}
			
		}
		
	}

	public static void Display(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
				
			}
			System.out.println();
			
		}
		
	}

	public static int addAllNumber(int[][] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				sum += arr[i][j];
			}
		}
		return sum;
	}

	public static int[] Rowise(int[][] arr) {
		int sum[] = new int [arr.length];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				sum[i] += arr[i][j];
			}
		}
		return sum;
	}

	public static int[] Coloumwise(int[][] arr) {
		int sum[] = new int[arr[0].length];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				sum[j] += arr[i][j];
			}
		}
		return sum;
	}

	public static int FindMax(int[][] arr) {
		int max=arr[0][0];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j]>max)
				{
					max=arr[i][j];
				}
			}
		}
		return max;
	}

	public static int FindMin(int[][] arr) {
		int min=arr[0][0];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j]<min)
				{
					min=arr[i][j];
				}
			}
		}
		return min;
	}

	public static int[] RowMax(int[][] arr) {
		int [] max=new int[arr.length];
		
		
				
		for(int i = 0; i < arr.length; i++) {
			max[i]=arr[i][0];
			for(int j = 0; j < arr[i].length; j++) {
				
				if(max[i]<arr[i][j])
				{
					max[i]=arr[i][j];
				}
			}
		}
		return max;
	}

	
	
		
	}


