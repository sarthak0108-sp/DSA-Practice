package recursionpractice;

import java.util.Scanner;

public class Validparenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		genparenthesis(0,0,n,"");

	}

	public static void genparenthesis(int op, int cl, int n, String ans) {
		// TODO Auto-generated method stub
		if(op==n&&cl==n) {
			System.out.println(ans);
			return;
		}
		if(op>n||cl>n) {
			return;
		}
		genparenthesis(op+1,cl,n,ans+"(");
		if(op>cl) {
			genparenthesis(op,cl+1,n,ans+")");
		}
		
		
	}

}
