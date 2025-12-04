package recursionpractice;

import java.util.Scanner;

public class Replaceallzero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=n+"";
		
		String updated=replace(s,0);
		int num = Integer.parseInt(updated);
		System.out.println(num);

	}

	public static String replace(String ques,int i) {
		// TODO Auto-generated method stub
		if(i==ques.length()) {
			return ques;
		}
		char c=ques.charAt(i);
		if(c=='0') {
			ques=ques.substring(0,i)+'5'+ques.substring(i+1);
		}
		
		return replace(ques,i+1);
		
		
	}

}
