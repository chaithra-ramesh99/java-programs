package test;

public class Perfectarray {
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
