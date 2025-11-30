package recursionpractice;

import java.util.Scanner;

public class Lastindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		int ans=lastindex(a,m,a.length-1);
		System.out.println(ans);
		

	}

	public static int lastindex(int[] a, int target,int idx) {
		// TODO Auto-generated method stub
		if(idx==0) {
			return -1;
		}
		if(target==a[idx]) {
			return idx;
			
		}
		return lastindex(a,target,idx-1);
		

	}

}
