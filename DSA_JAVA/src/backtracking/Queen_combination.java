package backtracking;

import java.util.Scanner;

public class Queen_combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean a[]=new boolean[n];
		int q=sc.nextInt();
		queen(a,0,q,"",0);

	}

	public static void queen(boolean[] a, int cq, int noq, String ans,int idx) {
		// TODO Auto-generated method stub
		if(cq==noq) {
			System.out.println(ans);
			return;
		}
		for (int i = idx; i < a.length; i++) {
			if(a[i]==false) {
				a[i]=true;
				queen(a,cq+1,noq,ans+"q"+cq+"b"+i,i);
				a[i]=false;
			}
		}
		
	}

}
