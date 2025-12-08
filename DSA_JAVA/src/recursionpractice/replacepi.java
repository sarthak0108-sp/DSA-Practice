package recursionpractice;

import java.util.Scanner;

public class replacepi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++) {
			String s=sc.nextLine();
			replacpi(s,0,"");
			}
}

	public static void replacpi(String s, int i,String ans) {
		// TODO Auto-generated method stub
		if(i>=s.length()) {
			System.out.println(ans);
			return;
		}
		
		if(i<s.length()-1&&s.charAt(i)=='p'&&s.charAt(i+1)=='i') {
			replacpi(s,i+2,ans+"3.14");
		}
		else {
		 replacpi(s,i+1,ans+s.charAt(i));}
	}

}
