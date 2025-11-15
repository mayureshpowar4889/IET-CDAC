package com.demo.array;

import java.util.Arrays;

public class My1DArray {

	private int[] arr;
	private int count ;
	
	
	public My1DArray() {
		
		arr = new int[10];
		count = 0;
	}


	public My1DArray(int[] arr, int count) {
		
		this.arr = arr;
		this.count = count;
	}


	public My1DArray(int size) {
		arr = new int[size];
		this.count = 0;
	}
	
	public int getCapacity() {
		return arr.length;
		
	}
	
	public int getSize() {
		return count;
	}
	
	public boolean add(int x) {
		if(count<getCapacity())
		{
			arr[count] = x;
			count ++;
			return true;
		}
		return false;
	}
	
	

	
	
	
	
	@Override
	public String toString() {
		return "Array : [arr=" + Arrays.toString(arr) + "]";
	}
	
	
	
	public boolean addpos(int value,int pos) {
		if(count<arr.length && pos<count ) {
			
			for(int i=count;i>pos;i--) {
				arr[i]=arr[i-1];
		    }
			
			arr[pos]=value;
			count++;
			return true;
		}
		return false;
		
		
	}
	
    public int searchByValue(int value) {
    	for(int i=0;i<count;i++) {
    		if(arr[i]==value) {
    			return i;
    		}
    	}
    	return -1;
    	
    }
    
   
	public boolean deleteByPos(int pos) {
		if(pos<count) {
			for(int i=pos;i<count-1;i++) {
				arr[i]=arr[i+1];
			}
			arr[count-1]=0;
			count--;
			return true;
		}
		return false;
	}
	
	public boolean deleteByValue(int value) {
		int idx=searchByValue(value);
		if(idx!=-1) {
			return deleteByPos(idx);
		}
		return false;
	}
	
	
	public void rotateArray(boolean flag,int num) {
		
	
		if(flag) {
			//right rotation
			for(int cnt=0;cnt<num;cnt++) {
				int temp=arr[count-1];
				for(int i=count-1;i>0;i--) {
					arr[i]=arr[i-1];
				}
				arr[0]=temp;
			}
		
		}else{
			//left rotation
			for(int cnt=0;cnt<num;cnt++) {
				int first=arr[0];
				for(int i=0;i<count-1;i++) {
					arr[i]=arr[i+1];
				}
				arr[count-1]=first;
			}
			
		}
		
	}

	public int[] reverseArray(boolean flag) {
		if(flag) {
			for(int i=0,j=count-1;i<j;i++,j--) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			return arr;
		}else {
			int[] arr1=new int[count];
			for(int i=count-1,j=0;i>=0;i--,j++) {
				arr1[j]=arr[i];
			}
			return arr1;
		}
		
	}
	
	
	
	
	public double getSumElements() {
		int sum=0;
		for(int i=0 ; i<getSize();i++) {
			sum+=arr[i];
		}
		return sum;
	}


	public My1DArray digitSumOfAllElements() {
		
		My1DArray result = new My1DArray();
		for (int i=0;i<this.getSize();i++) {
			int num = this.arr[i];
			int sum = 0;
			if(num==0) {
				result.add(0);
				continue;
			}
			while(num>0) {
				sum = sum + num % 10;
				num =num/10;
			}
			
			result.add(sum);
		}
		
		return result;
	}
	


	public My1DArray factOfPrime() {
		
		My1DArray result = new My1DArray();
		for (int i=0 ; i<this.count;i++) {
			
			int num= arr[i];
			
			if(isprime(num)) {
				
				result.add(fact(num));
			}
		}
		
		return result;
	}


	private int fact(int num) {
		int fact =1;
		if (num < 0)
			return -1;
	    if (num == 0 || num == 1)
	    	return 1;
	    
	    for(int i=1 ; i<=num;i++) {
				fact=fact*i;
			}
	
		return fact;
	}


	private boolean isprime(int num) {
		if(num <= 1) {
			return false;
		}
		
			for(int i = 2; i < num; i++) {
				if(num % i == 0 ) {
					return false;
				}
			}
		
		return true;
	}


	public int findMaxPrime() {
		My1DArray result = new My1DArray();
		for(int i=0 ; i< this.count ;i++) {
			int num = this.arr[i];
			if(isprime(num)) {
				result.add(num);
			}
		}
		System.out.println("Prime Numbers: "+ result);

		return findMax(result);
	}


	public int findMax(My1DArray result) {
		if(result==null) {
			return 0;
		}
		int max=result.arr[0];
		
		for(int i=0;i<result.count;i++) {
			if(max<result.arr[i]) {
				max=result.arr[i];
			}
		}
		
		return max;
	}

	
	
	public My1DArray copyOfRevPrime() {
        My1DArray copy = new My1DArray(this.count);  

        for (int i = 0; i < this.count; i++) {
            int num = this.arr[i];

            if (isprime(num) && num > 5) {
                // Prime and >5  reverse it
                copy.add(reverseNumber(num));
            } else {
                // Otherwise  copy as is
                copy.add(num);
            }
        }
        return copy;
    }


	private int reverseNumber(int num) {
		int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
		
	}
	
}
