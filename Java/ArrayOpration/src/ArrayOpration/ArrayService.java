package ArrayOpration;
import java.util.*;
public class ArrayService {
   
	public static void acceptArray(int[] arr) {
		 Scanner sc= new Scanner(System.in);
		// TODO Auto-generated method stub
		 System.out.println("Enter Array Elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();		
		}
		
	}

	public static void displayArray(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
	}

	public static int addition(int[] arr) {
		// TODO Auto-generated method stub
		int sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		return sum;
	}

	public static int findMax(int[] arr) {
		// TODO Auto-generated method stub
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				
			}
			
		}
		return max;
	}

	public static int findMin(int[] arr) {
		// TODO Auto-generated method stub
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
				
			}
			
		}
		return min;
	}

	public static int SearchByValue(int[] arr, int n) {
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]==n) {
				return i+1;
			}
		}
		
		return -1;
	}

	public static int[] occurance(int[] arr, int num) {
		// TODO Auto-generated method stub
		
		int[] occur=new int[arr.length];
		int cnt=0;
		for(int j=0;j<occur.length;j++)
		{
			occur[j]=-1;
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==num)
			{
				occur[cnt]=i;
				cnt++;
			}
		
			
		}
		if(cnt>0)
		{
			
			return occur;
		}
		else
		{
			return null;
		}
	}

	public static int findNthMax(int[] arr, int n) {
		for(int i=0;i<n;i++) {
			int pos=findMaxpos(arr,i);
			
			int temp=arr[i]; 
			arr[i]=arr[pos];
			arr[pos]=temp;
			
		}
		return arr[n-1];
	}
	private static int findMaxpos(int[] arr, int start) {
		int pos=start;
		int max=arr[pos];
		for(int i=start+1;i<arr.length;i++) {
			if(max<arr[i]) {
				pos=i;
				max=arr[i];
			}
		}
		return pos;
	}

	public static int primeMax(int[] arr) {
		int [] isprime = new int[arr.length];
		int cnt=0;
		for(int i = 0; i < arr.length; i++ ) {
		if(isPrime(arr[i]))
		{
		 isprime[cnt]=arr[i];	
		cnt++;
		}
		}
		
        int prime=findMax(isprime);
        
		return prime;
	}

	private static boolean isPrime(int num) {
		if(num <= 1){
         return false;
      }
      else{
          for(int i = 2; i < num; i++){
              if(num % i == 0){
                  return false;
             }
          }
      }
      return true;
	}

}
