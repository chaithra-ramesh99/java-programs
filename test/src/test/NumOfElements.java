package test;

import java.util.Scanner;

public class NumOfElements {

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
