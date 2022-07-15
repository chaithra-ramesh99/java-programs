package assignment_july9;

public class MoveZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {0,1,0,3,12};
		
		/*1,0,0,3,12
		 * 
		 * 
		*/
		
		int left=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
			int temp;
			temp = a[left];
				a[left]=a[i];
				a[i]= temp;
				left++;
			}
				
			
		}
 		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+",");
		}

	}

}
