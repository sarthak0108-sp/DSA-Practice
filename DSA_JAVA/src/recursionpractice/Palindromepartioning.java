package recursionpractice;

import java.util.Scanner;

public class Palindromepartioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		partition(s,"");

	}

	public static void partition(String s, String ans) {
		// TODO Auto-generated method stub
		if(s.length()==0) {
			System.out.println(ans);
			return;
		}
		for(int i=1;i<=s.length();i++) {
			String s1=s.substring(0,i);
			if(ispal(s1)) {
				partition(s.substring(i),ans+s1+"|");
			}
		}
		
	}

	public static boolean ispal(String s) {
		// TODO Auto-generated method stub
		int i=0;
		int j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
