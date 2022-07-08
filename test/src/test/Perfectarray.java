package test;

public class Perfectarray {
	/*	Q6. Given an array of size N and you have to tell whether the array is perfect or not. An array is said
	
	 * to be perfect if it's reverse array matches the original array. If the array
	 * is perfect then print "PERFECT" else print "NOT PERFECT". Example 1: Input :
	 * Arr[] = {1, 2, 3, 2, 1} Output : PERFECT Explanation: Here we can see we have
	 * [1, 2, 3, 2, 1] if we reverse it we can find [1, 2, 3, 2, 1] which is the
	 * same as before. So, the answer is PERFECT. Example 2: Input : Arr[] = {1, 2,
	 * 3, 4, 5} Output : NOT PERFECT
	 */

	
	  public static boolean IsPerfect(int a[], int n)
	    {
	        int b[]= new int[n];
	        int j=n-1;
	        for(int i=0;i<a.length;i++)
	        {
	        	b[j]=a[i];
	        	j= j-1;
	            
	        }
	        
	        for(int k=0;k<b.length;k++)
	        {
	        	System.out.println("reverese aray:"+b[k]);
	        }
	        for(int i=0;i<n;i++)
	        {
	            if(a[i]!=b[i])
	            {
	                return false;
	            }
	        }
	        return true;
	        // Complete the function
	    }

	public static void main(String[] args) {
int[] ar = {1, 2, 3, 2, 1};

System.out.println(IsPerfect(ar,ar.length));
	}

}
