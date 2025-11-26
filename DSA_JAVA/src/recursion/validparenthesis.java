package recursion;

public class validparenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2;
		valid(n,n,"");
		

	}
	public static void valid(int op,int cl,String ans) {
		if(op==0&&cl==0) {
			System.out.println(ans);
			return;
		}
		if(op>0) {
			valid(op-1,cl,ans+"(");
		}
		if(op<cl) {
			valid(op,cl-1,ans+")");
		}
	}

}
