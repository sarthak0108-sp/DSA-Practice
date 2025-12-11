package recursionpractice;

import java.util.Arrays;
import java.util.Scanner;

public class Dictionaryorder_larger {
	static String s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		s=sc.next();
		
		char[] a=s.toCharArray();
		Arrays.sort(a);
		String sorted=new String(a);
		StringBuilder sb=new StringBuilder(sorted);
		largerorder(sb,"");

	}

	public static void largerorder(StringBuilder ques, String ans) {
		// TODO Auto-generated method stub
		if(ques.length()==0) {
			if(ans.compareTo(s)>0) {
				System.out.println(ans);
			}
			return;
		}
		for(int i=0;i<ques.length();i++) {
		char ch=ques.charAt(i);
		String s1=ques.substring(0,i);
		String s2=ques.substring(i+1);
		largerorder(new StringBuilder(s1+s2),ans+ch);
		
		
		}
		
		
	}

}
