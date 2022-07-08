package test;

import java.util.Scanner;

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
