package assignment_july9;

public class Majorityelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[]= {3,3,4};
		
			System.out.print(majorityElement(nums));
		
	}
	
	  public static int majorityElement(int[] nums) {
	       
			int n = nums.length;
			int times = n/2;
			int el = -1;
			for(int i=0;i<n;i++)
			{
				int count=0;

				for(int j=0;j<n;j++)
				{
					if(nums[i]==nums[j])
					count++;
				}
				
				if(count<=times)
				
					el = -1;
				
				else  el = nums[i];
				
				
					
			}
			return el;
			
			
			
			
		//	return count;
	  }
				
				
			
	        
		


	  
}
