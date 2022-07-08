package test;

/*Q10. Given a number N. Your task is to check whether it is fascinating or not.
Fascinating Number: When a number(should contain 3 digits or more) is multiplied by 2 and 3 ,and
when both these products are concatenated with the original number, then it results in all digits from 1
to 9 present exactly once.
Example 1:
Input:
N = 192
Output: Fascinating
Explanation: After multiplication with 2
and 3, and concatenating with original
number, number will become 192384576
which contains all digits from 1 to 9.
Example 2:
Input:
N = 853
Output: Not Fascinating
Explanation: It's not a fascinating
number.

*/
public class BalanceArray {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		int a[] =  { 1, 2, 1, 2, 1, 3};
        int n = a.length;
      //  System.out.println(n / 2);
        int leftsum=0;
        int rightsum=0;
		  for (int i = 0; i < n / 2; i++)
		  {
			leftsum=  leftsum+a[i];
		  }
		  
		  for(int j=n/2;j<n;j++)
		  {
			  rightsum = rightsum+a[j];
		  }
		  int rem = Math.abs(leftsum-rightsum);
	            System.out.println( rem);
		
	}

}
