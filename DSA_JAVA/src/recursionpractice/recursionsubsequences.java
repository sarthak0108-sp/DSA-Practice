package recursionpractice;

import java.util.Scanner;

public class recursionsubsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int ans=subsequence(s,s.length()-1,"");
		System.out.println();
		System.out.println(ans);

	}

	public static int subsequence(String ques,int idx, String ans) {
		// TODO Auto-generated method stub
		if(idx<0) {
			System.out.println(ans);
			return 1;
		}
		
		char ch=ques.charAt(idx);
		
		int b=subsequence(ques,idx-1,ans);
		int a=subsequence(ques,idx-1,ans+ch);
		return a+b;
		
		
	}

}
