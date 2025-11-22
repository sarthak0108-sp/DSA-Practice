package binarysearch;

import java.util.Arrays;
import java.util.Scanner;

public class aggressivecows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=sc.nextInt();
		int stall[]=new int[n];
		for(int i=0;i<n;i++) {
			stall[i]=sc.nextInt();
		}
		Arrays.sort(stall);
		System.out.println(search(stall,c));

	}
	public static int search(int stall[],int c) {
		int low=0;
		int high=stall[stall.length-1]-stall[0];
		int ans=0;
		while(low<=high) {
			int mid=(low+high)/2;
			if(isitpossible(mid,stall,c)) {
				ans=mid;
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		return ans;
	}
	public static boolean isitpossible(int mid,int stall[],int c) {
		int placed=1;
		int pos=stall[0];
		for(int i=1;i<stall.length;i++) {
			if(stall[i]-pos>=mid) {
				placed++;
				pos=stall[i];
			}
			
			if(placed==c) {
				return true;
			}
		}
		return false;
		
	}

}
