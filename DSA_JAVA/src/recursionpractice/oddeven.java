package recursionpractice;

import java.util.Scanner;

public class oddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		printodd(n,5);
		printeven(n,1);

	}

	private static void printodd(int n, int i) {
		// TODO Auto-generated method stub
		if(i<1) {
			return;
		}
		
		if(i%2!=0) {
			System.out.println(i);
		
			
		}
		printodd(n,i-1);
		
		
	}

	public static void printeven(int n,int i) {
		// TODO Auto-generated method stub
		if(i==n) {
			return;
		}
		if(i%2==0) {
			System.out.println(i);
			
		}
		printeven(n,i+1);
		
	}

}
