package arrays;

import java.util.Arrays;

public class Formlargestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {54, 546, 548, 60};
		int n=a.length;
		String str[]=new String[n];
		for(int i=0;i<n;i++) {
			str[i]=String.valueOf(a[i]);
		}
		Arrays.sort(str,(x,y)->(y+x).compareTo(x+y));
		 
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<n;i++) {
			sb.append(str[i]);
		}
		System.out.println(sb.toString());
	}

}
