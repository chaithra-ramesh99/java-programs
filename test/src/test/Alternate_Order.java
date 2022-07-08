package test;

import java.util.Scanner;

public class Alternate_Order {
	
	/*
	 * Q4. You are given an array A of size N. You need to print elements of A in
	 * alternate order (starting from index 0). Example 1: Input: N = 4 A[] = {1, 2,
	 * 3, 4} Output: 1 3 Example 2: Input: N = 5 A[] = {1, 2, 3, 4, 5} Output: 1 3 5
	 */
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int[] ar = new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]= sc.nextInt();
		}
		System.out.println("alternate order:-");
		for(int i =0;i<ar.length;i++)
		{
			if(i%2==0)
			System.out.print(ar[i]);
		}
		
	}

}
