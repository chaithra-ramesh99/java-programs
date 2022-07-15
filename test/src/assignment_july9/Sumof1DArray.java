package assignment_july9;

public class Sumof1DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] a= {1,2,3,4};
			
			int n[] = new int[a.length];
			n[0] = a[0];
 			for(int i=1;i<a.length;i++)
			{
				n[i] = n[i-1]+a[i];
				
			}
 			
 			for(int j=0;j<n.length;j++)
 			{
 				System.out.print(n[j]+" ");
 			}
			
	}

}
