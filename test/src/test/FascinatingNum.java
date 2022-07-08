package test;

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
