package assignment_july9;

public class RichestCustomerWealth {

	public static void main(String[] args) {
		
		int a[][]= {{1,5},{7,3},{3,5}};
		
		System.out.println(maximumWealth(a));
		
	}
	
	public  static int maximumWealth(int[][] accounts) {
	       int r = accounts.length;
			int col= accounts[0].length;
			int sum=0;
			int max=Integer.MIN_VALUE;
			for(int i=0;i<r;i++)
			{
				sum=0; 
				for(int j=0;j<col;j++)
				{
					sum=sum+accounts[i][j];
				}
				if(max<sum)
				{
					max=sum;
				}
	            System.out.println("Sum of " + (i+1) +" row: " + max);    

			}
			return max;

	    }
	
	
}
