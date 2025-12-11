package recursionpractice;

import java.util.Scanner;

public class Convertstrtoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		convert(s,0,0);

	}

	public static void convert(String ques, int i, int num) {
		// TODO Auto-generated method stub
		if(i==ques.length()) {
			System.out.println(num);
			return;
		}
		num=num*10+(ques.charAt(i)-'0');
		convert(ques,i+1,num);
		
	}

}
