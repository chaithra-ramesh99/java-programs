package test;

import java.util.Scanner;

public class IndexElement {

	/*
	 Q5. Given an array Arr of N positive integers. Your task is to find the elements whose value is equal
to that of its index value ( Consider 1-based indexing ).
Example 1:
Input:
N = 5
Arr[] = {15, 2, 45, 12, 7}
Output: 2
Explanation: Only Arr[2] = 2 exists here.
Example 2:
Input:
N = 1
Arr[] = {1}
Output: 1
Explanation: Here Arr[1] = 1 exists.

	 */
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int[] ar = new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]= sc.nextInt();
		}
		
		System.out.println("Enter the index pos to find the eleme");
		int pos = sc.nextInt();
		if(pos>ar.length)
		{
			
		}
		else {
			System.out.println("element:"+ar[pos]);
		}
		
		
	}

}
