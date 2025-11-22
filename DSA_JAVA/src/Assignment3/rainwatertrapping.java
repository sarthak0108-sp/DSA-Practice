package Assignment3;

import java.util.Scanner;

public class rainwatertrapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
        	int n=sc.nextInt();
    		int a[]=new int[n];
    		for(int i=0;i<n;i++) {
    			a[i] = sc.nextInt();
    		}
    		int left[]=new int[a.length];
    		int right[]=new int[a.length];
    		left[0]=a[0];
    		for(int i=1;i<left.length;i++) {
    			left[i]=Math.max(a[i], left[i-1]);
    		}
    		right[right.length-1]=a[a.length-1];
    		for(int i=right.length-2;i>=0;i--) {
    			right[i]=Math.max(a[i], right[i+1]);
    		}
    		int ans=0;
    		for(int i=0;i<a.length;i++) {
    			ans+=Math.min(left[i], right[i])-a[i];
    		}
    		System.out.println(ans);
        }

	}

}
