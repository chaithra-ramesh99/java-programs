package test;

import java.util.Scanner;

public class NumOfElements {
	/*
	 * Q3. Given an sorted array A of size N. Find number of elements which are less
	 * than or equal to given element X. Example 1: Input: N = 6 A[] = {1, 2, 4, 5,
	 * 8, 10} X = 9 Output: 5 Example 2: Input: N = 7 A[] = {1, 2, 2, 2, 5, 7, 9} X
	 * = 2 Output: 4
	 * 
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
		System.out.println("Enter  elme");
		int el = sc.nextInt();
		int min =0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<=el)
			{
				min++;
			}
		}
		System.out.print(min);
		
	}

}
