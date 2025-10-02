package ArrayOpration;
import java.util.*;
public class Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter Array Size ");
		int size=sc.nextInt();
		
		int[] arr = new int[size];
		
		int choice;
		do
		{
	System.out.println("1.Accept Array Element\n2.Display Array\n3.Additon of Array Elements"
	+ "\n4.Find MAX\n5.Find MIN\n6.Search by Value\n7.Value Occurance Array"
		+ "\n8.Nth Max Number\n9. Max Prime Number ");
			System.out.println("Enter Choice ");
			 choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				ArrayService.acceptArray(arr);
				break;
			case 2:
				ArrayService.displayArray(arr);
				break;
			case 3:
				int sum=ArrayService.addition(arr);
				System.out.println("Addition is :"+sum);
				break;
			case 4:
				int max=ArrayService.findMax(arr);
				System.out.println("Max  is :"+max);
				break;
			case 5:
				int min=ArrayService.findMin(arr);
				System.out.println("Min  is :"+min);
				break;
			case 6:
				System.out.println("Enter Value to Search");
				int n =sc.nextInt();
				int index=ArrayService.SearchByValue(arr,n);
				if(index>0)
				{
					System.out.println(n+" Found at Index "+index);
				}
				else
				{
					System.out.println("Value Not Found!!");
				}
				break;
			case 7:
				System.out.println("Enter Value to Check Occurance");
				int num=sc.nextInt();
				int[] occur=ArrayService.occurance(arr,num);
				if(occur!=null)
				{
				System.out.println(num+" Occurance is At Array Index ");
				for(int i=0;i<occur.length;i++)
				{
					System.out.print(occur[i]+"\t");
				}
				System.out.println();
				}
				else
				{
					System.out.println("Number Not In Array!!");
				}
				break;
			case 8:
				System.out.println("Enter Nth number to Find Nth Max");
				int no=sc.nextInt();
				int maxx=ArrayService.findNthMax(arr,no);
				System.out.println(no+" Max Element is : "+maxx);
				
			case 9:
				int prime = ArrayService.primeMax(arr);
				System.out.println("Max prime number is " + prime);
				
				break;
			default:
			System.out.println("Invalid choice");
			
			}
}while(choice!=0);
		

	}

}
