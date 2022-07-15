package jul9;

public class Reversevowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stubng
		
		String str ="hello world";
	System.out.println(	reverseVowels(str));
	}
	
	public static boolean isVowel(char c)
	{
		return(c=='a' || c=='A'|| c=='e' || c=='E' || c=='i'|| c=='I' || c=='o' || c=='O'
				|| c=='u'|| c=='U');
	}
	
	public static String reverseVowels(String s) {
		String str ="";
		char[] c = s.toCharArray();
		int i=0,j= c.length-1;
		while(i<j)
		{
			if(!isVowel(c[i]))
			{
				i++;
			}
			else if(!isVowel(c[j]))
			{
				j--;
				
			}
			
			char temp = c[i];
			c[i]=c[j];
			c[j]= temp;
			
			i++;
			j--;
		}
		String ss = String.copyValueOf(c);
		return ss;
	}

}
