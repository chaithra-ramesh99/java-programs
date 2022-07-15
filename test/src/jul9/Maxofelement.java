package jul9;

public class Maxofelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		char a[]= {'p','r','o','g','r','a','m'};
		
		
		//System.out.println(getMaxMin(a));
		
		String str = "java program";

	}
	
	
	//reverse array of characters
	public static void reverChar(int str)
	{
		/*
		 * char[] for(int i=str.length()-1;i>=0;i++) { newstr = newstr+str[i]; }
		 */
		
	}
	
	
	//get max
	public  static int getMAx(int a[]) {
		int max= a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=max)
			{
				max=a[i];
			}
		}
		return max;
		
	}
	
	//get max and min
		public  static void getMaxMin(int a[]) {
			int max= Integer.MIN_VALUE;
			int min= Integer.MAX_VALUE;
			
			if(a.length==0)
			{
				
			}

			for(int i=0;i<a.length;i++)
			{
				if(a[i]>=max)
				{
					max=a[i];
				}
				else if(a[i]<=min)
				{
					min =a[i];
				}
			}
			
			System.out.println("max:"+max+","+"min:"+min);
			
		
			
		}

}
