package test;

import java.util.Scanner;

/*Q9. Write a program to find the sum of the given series 1+2+3+ . . . . . .(N terms)
Example 1:
Input:
N = 1
Output: 1
Explanation: For n = 1, sum will be 1.
Example 2:
Input:
N = 5
Output: 15
Explanation: For n = 5, sum will be 1
+ 2 + 3 + 4 + 5 = 15.
Q10. Given a number N. 
*/
public class Sumofseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum = 0;
		for(int i=0;i<=n;i++)
		{
			sum= sum+i;
		}
		System.out.print(sum);

	}

}
