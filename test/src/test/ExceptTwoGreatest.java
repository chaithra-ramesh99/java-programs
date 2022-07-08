package test;


/*Q8. Given an array of N distinct elements, the task is to find all elements in array except two greatest
elements in sorted order.
Example 1:
Input :
a[] = {2, 8, 7, 1, 5}
Output :
1 2 5
Explanation :
The output three elements have two or
more greater elements.
Example 2:
Input :
a[] = {7, -2, 3, 4, 9, -1}
Output :
-2 -1 3 4*/
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
		

	}

}
