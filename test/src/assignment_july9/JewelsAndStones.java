package assignment_july9;

public class JewelsAndStones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jewels ="z";
		String stones ="ZZ";
		
		
		
		
		
		System.out.print(numJewelsInStones(jewels,stones));
		
		 
				
	}
	
	public static int numJewelsInStones(String jewels, String stones)
	{
		char[] je = jewels.toCharArray();
		char[] st= stones.toCharArray();
		
		int found=0;
		for(int i=0;i<je.length;i++)
		{
			
			for(int j=0;j<st.length;j++ )
			{
				if(je[i]==st[j])
				{
					found++;
				}
			}
		}
		return found;
		
	}

}
