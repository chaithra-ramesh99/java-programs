package test;

import java.util.Scanner;

public class Alternate_Order {
	

	

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
