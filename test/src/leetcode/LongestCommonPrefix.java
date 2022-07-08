package leetcode;
import java.util.*;
import java.lang.*;
import java.io.*;

	

	class LongestCommonPrefix {
		public String longestCommonPrefix(String[] S) {
			if (S.length == 0) return "";
			String prefix = S[0];
			System.out.println("test:"+prefix.indexOf(prefix));

			for (int i = 1; i < S.length; i++)
			{
				System.out.println("pos:"+S[i].indexOf(prefix));
				while (S[i].indexOf(prefix) != 0) {
					System.out.println("pos if:"+S[i].indexOf(prefix));

					prefix = prefix.substring(0, prefix.length() - 1);
					System.out.println("prefix:"+prefix);

					if (prefix.isEmpty())
						return "";
				} 
			}
			return prefix;
		}
		public static void main(String args[]) {
			// Your code goes here
			LongestCommonPrefix ob = new LongestCommonPrefix();
			String s[] = {"flower", "flow", "flight"};
			System.out.println(ob.longestCommonPrefix(s));
		}
	}
