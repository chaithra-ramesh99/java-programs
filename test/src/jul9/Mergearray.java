package jul9;

import java.util.ArrayList;

public class Mergearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer a[] = {2,5,15,18};
		Integer b[]= {6,10,23,50};
		ArrayList<Integer> list = new ArrayList<>();
		
	int i=0,j=0;
	while(i<a.length && j<b.length)
	{
		if(a[i]<b[j])
		{
			list.add(a[i]);
			i++;
		}
		else {
			list.add(b[j]);
			j++;
		}
	}
	
	while(i<a.length)
	{
		list.add(a[i]);
		i++;
	}
	while(j<b.length)
	{
		list.add(b[j]);
		j=j+1;
	}
	
	System.out.println(list);
	}
	
	//public static ArrayList<Int> mergeArray(Ar)r

}
