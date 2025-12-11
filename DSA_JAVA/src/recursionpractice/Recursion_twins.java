package recursionpractice;

import java.util.Scanner;

public class Recursion_twins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		twins(s,0,0);

	}

	public static void twins(String ques, int i,int count) {
		// TODO Auto-generated method stub
		if(i>ques.length()-3) {
			System.out.println(count);
			return;
		}
		
		if(ques.charAt(i)==ques.charAt(i+2)) {
			count++;
		}
		twins(ques,i+1,count);
		
	}

}
