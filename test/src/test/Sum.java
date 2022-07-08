package test;

import java.util.Scanner;


/*Q1. Given an array of N integers. Your task is to print the sum of all of the integers.
Example 1:
Input:
4
1 2 3 4
Output:
10
Example 2:
Input:
6
5 8 3 10 22 45
Output:
93
*/

public class Sum {

	public static void main(String[] args) {
	

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]= sc.nextInt();
			
		}
		int total=0;
		for (int i=0; i<n; i++)   
		{  
			 total = total+arr[i];
	
		}  
		System.out.print("sum:"+total);  
	
	}

}
