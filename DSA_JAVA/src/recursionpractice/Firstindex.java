package recursionpractice;

import java.util.Scanner;

public class Firstindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		int ans=firstindex(a,m,0);
		System.out.println(ans);
		

	}

	public static int firstindex(int[] a, int target,int idx) {
		// TODO Auto-generated method stub
		if(idx==a.length-1) {
			return -1;
		}
		if(target==a[idx]) {
			return idx;
			
		}
		return firstindex(a,target,idx+1);
		
	}

}
