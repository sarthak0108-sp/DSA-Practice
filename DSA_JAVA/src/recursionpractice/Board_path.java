package recursionpractice;

import java.util.Scanner;

public class Board_path {
        static int c;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		count(n,m,0,"");
		System.out.println();
		System.out.println(c);

	}

	public static void count(int n, int m,int cp, String ans) {
		// TODO Auto-generated method stub
		if(cp==n) {
			System.out.println(ans);
			c++;
			return ;
		}
		if(cp>n) {
			return ;
		}
		for(int i=1;i<=m;i++) {
			count(n,m,cp+i,ans+i);
		}
		
	}

}
