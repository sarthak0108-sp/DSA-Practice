package recursionpractice;

import java.util.Scanner;

public class Nthtriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		nth_triangle(n,1,0);

	}

	public static void nth_triangle(int n,int i,int sum) {
		// TODO Auto-generated method stub
		if(i>n) {
			System.out.println(sum);
			return;
		}
		nth_triangle(n,i+1,sum+i);
		
		}

}
