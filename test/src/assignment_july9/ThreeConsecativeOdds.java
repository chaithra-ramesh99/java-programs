package assignment_july9;

import java.util.ArrayList;

public class ThreeConsecativeOdds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,34,3,4,5,7,23,12};
		
		
			System.out.print("count:"+threeConsecutiveOdd(a));
		
	}
	
	public static boolean threeConsecutiveOdd(int[] a)
	{
		
		int count =0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				count =0;
				
			}
			
			else if(a[i]%2!=0)
			{
				count++;
				
				//System.out.println("i pos:"+a[i]+":-"+count);
			}
			if(count==3)
			{
				return true;
			}
			
		}
		return false;
		
	}

}
