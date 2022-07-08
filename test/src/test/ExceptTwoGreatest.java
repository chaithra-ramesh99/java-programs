package test;

public class ExceptTwoGreatest {

	public static void main(String[] args) {
		
		int n[] ={2, 8, 7, 1, 5};
		
		
		for (int i = 0; i < n.length; i++)
	    {
	        int count = 0;
	         
	        for (int j = 0; j < n.length; j++)
	        {
	            if (n[j] > n[i])
	                count++;
	        }
	 
	        if (count >= 2)
	        System.out.print(n[i] + " ");
	        
	    }
		/*
		 * for(int i=0;i<a.length;i++) { 
		 * int count =0;
		 *  for(int j=0;j<a.length;j++) {
		 * if(a[j]>a[i]) { count++; }
		 * 
		 * if(count>=2) { System.out.println(a[i]); } } }
		 */

	}

}
