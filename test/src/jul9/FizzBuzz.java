package jul9;

import java.util.ArrayList;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stubw
		int n =5;
		//String a[]= new String[n];
		ArrayList<String> a = new ArrayList<>();
		
		for(int i=1;i<n;i++)
		{
		
			if(i%3==0 && i%5==0)
			{
				a.add("FizzBuzz");
			}
			else if(i%3==0)
			{
				a.add("Fizz");
			}
			else if(i%5==0)
			{
				a.add("Buzz");
			}
			else {
				a.add(""+i);
				//System.out.println(a[i]);
				
			}
		}
		
		for(String st:a)
		{
		System.out.println(st);
		}

	}




  
	
	
	

}
