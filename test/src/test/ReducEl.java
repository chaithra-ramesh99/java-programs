package test;

import java.util.Arrays;

public class ReducEl {
	public long leftElement(long arr[], long n)
    {
        // Your code goes here 
       Arrays.sort(arr);
       
        if(n%2==0)
        {
        	
            return arr[(int)n/2-1];
        }
        else
        {
        	System.out.println("chai:"+(int) (n/2)+"pos:"+arr[(int) (n/2)]);
            return arr[(int)n/2];
        }
        
        
    }

	public static void main(String[] args) {
		long[] a=  {7, 8, 3, 4, 2, 9, 5};
		//{2,3,4,5}
		long n=2;
		ReducEl obj = new ReducEl();
         System.out.println(obj.leftElement(a, n));

	}

}
