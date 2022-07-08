package test;

import java.util.Scanner;

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
