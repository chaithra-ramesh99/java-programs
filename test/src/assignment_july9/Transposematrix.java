package assignment_july9;

public class Transposematrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix[][] = { {1,2,3},{4,5,6},{7,8,9}};

	System.out.print(traspose(matrix));	

		
		
		
	}

	private static int[][] traspose(int[][] matrix) {
		// TODO Auto-generated method stub
		int r = matrix.length;
		int c= matrix[0].length;
		
		int traspose[][]= new int[c][r];
		for(int i=0;i<c;i++)
		{
			for(int j=0;j<r;j++)
			{
				traspose[j][i]=matrix[j][i];
				//System.out.print(traspose[j][i]+" ");
				
			}
			//System.out.println();;
		}
		
		return traspose;
		
		
	}

}
