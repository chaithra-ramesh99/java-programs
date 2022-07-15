package assignment_july9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoultedifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[] = {4,2,1,3};

System.out.print(minAbdiff(a));

		
	}
	
	public static List<List<Integer>> minAbdiff(int arr[])
	{
		int min_diff = Integer.MAX_VALUE;
		List<List<Integer>> result = new ArrayList<>();
		
		Arrays.sort(arr);
		for(int i=1;i<arr.length;i++)
		{
			min_diff = Math.min(arr[i]-arr[i-1], min_diff);
		}
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]-arr[i-1]==min_diff)
			{
				List<Integer> list = new ArrayList<>();
				list.add(arr[i-1]);
				list.add(arr[i]);
				result.add(list);
			}
		}
		
		
		
		return result;
		
	}

}
