package recursionpractice;

import java.util.Scanner;

public class Mazepath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
	    int count=path(n,m,0,0,"");
	    System.out.println(count);
	   

	}

	public static int path(int n,int m,int row, int col, String ans) {
		// TODO Auto-generated method stub
		if(row==n-1 && col==m-1) {
			System.out.println(ans);
			return 1;
		}
		if(row>n-1||col>m-1) {
			return 0;
		}
		int a=path(n,m,row+1,col,ans+"V");
		int b=path(n,m,row,col+1,ans+"H");
		int count=a+b;
		return count;
		
		
		
	}

}
