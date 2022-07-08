package test;

public class BalanceArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] =  { 1, 2, 1, 2, 1, 3};
        int n = a.length;
      //  System.out.println(n / 2);
        int leftsum=0;
        int rightsum=0;
		  for (int i = 0; i < n / 2; i++)
		  {
			leftsum=  leftsum+a[i];
			  
		  }
		  
		  for(int j=n/2;j<n;j++)
		  {
			  rightsum = rightsum+a[j];
		  }
		  int rem = Math.abs(leftsum-rightsum);
	            System.out.println( rem);
		
	}

}
