package recursionpractice;

import java.util.Scanner;

public class Coinsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=10;
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		coinsum(a,sum,0,"",0);

	}

	public static void coinsum(int[] a, int total, int n, String ans,int idx) {
		// TODO Auto-generated method stub
		if(total==n) {
			System.out.println(ans);
			return;
		}
		if(n>total) {
			return;
		}
		
		for(int i=idx;i<a.length;i++) {
			coinsum(a,total,n+a[i],ans+a[i],i); 
		}
		
		
		
	}

}
