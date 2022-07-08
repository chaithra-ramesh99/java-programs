package test;

import java.util.Scanner;

public class IndexElement {

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
