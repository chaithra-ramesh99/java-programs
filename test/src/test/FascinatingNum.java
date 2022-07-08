package test;


/*Q10. Given a number N. Your task is to check whether it is fascinating or not.
Fascinating Number: When a number(should contain 3 digits or more) is multiplied by 2 and 3 ,and
when both these products are concatenated with the original number, then it results in all digits from 1
to 9 present exactly once.
Example 1:
Input:
N = 192
Output: Fascinating
Explanation: After multiplication with 2
and 3, and concatenating with original
number, number will become 192384576
which contains all digits from 1 to 9.
Example 2:
Input:
N = 853
Output: Not Fascinating
Explanation: It's not a fascinating
number.*/


public class FascinatingNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	boolean is = isFascinatingNum(192);
	if(is)
	{
		System.out.print("Fascinating num");
	}
	else {
		System.out.print("not a Fascinating num");
	}

	}
	
	static boolean isFascinatingNum(int n)
	{
		
		 String s="";
		 int n1= n*2;
		 int n2= n*3;
		 s =""+n+n1+n2;
		 int count=0;
		 boolean isFas=true;
		 
		 for(int  i='1';i<='9';i++)
		 {
			 for(int j=0;j<s.length();j++)
			 {
				 char ch = s.charAt(j);
				 if(ch==i)
				 {
					count++; 
				 }
			 }
			 if(count>1 || count==0)
			 {
				 isFas=false;
				 break;
				
			 }
			 
		 }
		 
		 
		return true;
	}

}
