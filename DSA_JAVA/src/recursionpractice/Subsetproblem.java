package recursionpractice;

import java.util.Scanner;

public class Subsetproblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		int count=subset(a,target,0,"",0);
		System.out.println();
		System.out.println(count);

	}

	public static int subset(int a[], int target, int cs, String ans, int idx) {
		// TODO Auto-generated method stub
		if(target==cs) {
			System.out.print(ans+" ");
			return 1;
		}
		if(idx==a.length) {
			return 0;
		}
		int r1=subset(a,target,cs+a[idx],ans+a[idx]+" ",idx+1);
		int r2=subset(a,target,cs,ans,idx+1);
		return r1+r2;
		
	}

}
