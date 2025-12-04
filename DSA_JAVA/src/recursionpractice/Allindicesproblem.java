package recursionpractice;

import java.util.Scanner;

public class Allindicesproblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		search(a,m,0);

	}

	public static void search(int[] a, int target,int i) {
		// TODO Auto-generated method stub
		if(i==a.length) {
			return;
		}
		if(a[i]==target) {
			System.out.print(i+" ");
		
		}
		
		search(a,target,i+1);
		
	}

}
