package binarysearch;

import java.util.Arrays;
import java.util.Scanner;

public class bookallocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int books[]=new int[n];
		for(int i=0;i<n;i++) {
			books[i]=sc.nextInt();
		}
		System.out.println(search(books,m));


	}
	public static int search(int books[],int m) {
		int lo=0;
		int hi=0;
		int ans=0;
		for(int i=0;i<books.length;i++) {
			hi+=books[i];
		}
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(possible(books,m,mid)) {
				ans=mid;
				hi=mid-1;
			}
			else {
				lo=mid+1;
			}
		}
		return ans;
	}
	public static boolean possible(int books[],int m,int mid) {
		int nos=1;
		int pagesread=0;
		for(int i=0;i<books.length;) {
			if(books[i]+pagesread<=mid) {
				pagesread+=books[i];
				i++;
			}
			else {
				nos++;
				pagesread=0;
			}
			if(nos>m) {
				return false;
			}
		}
		return true;
	}

}
