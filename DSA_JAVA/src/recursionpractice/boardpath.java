package recursionpractice;

public class boardpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		bp(0,n,"");
		

	}

	public static void bp(int sum, int n, String ans) {
		// TODO Auto-generated method stub
		if(sum==n) {
			System.out.println(ans);
			return;
		}
		if(sum>n) {
			return;
		}
		for(int i=1;i<=n;i++) {
			bp(sum+i,n,ans+i);
		}
		
	}

}
