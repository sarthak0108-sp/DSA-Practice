package stack_practice;

import java.util.Stack;

public class Find_celebrity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { {0, 0, 1, 0},
				{0, 0, 1, 0},
				{0, 0, 0, 0},
				{0, 0, 1, 0}};
		
       Stack<Integer> st=new Stack<>();
       for(int i=0;i<arr.length;i++) {
    	   st.push(i);
       }
       while(st.size()>1) {
    	   int a=st.pop();
    	   int b=st.pop();
    	   if(arr[a][b]==1) {
    		   st.push(b);
    	   }
    	   else {
    		   st.push(a);
    	   }
       }
       int c=st.pop();
       boolean f=true;
       for(int i=0;i<arr.length;i++) {
    	   if(i==c) {
    		   continue;
    	   }
    	   if(arr[i][c]==0) {
    		   f=false;
    		   break;
    	   }
    	   if(arr[c][i]==1) {
    		   f=false;
    		   break;
    	   }
       }
       if(f) {
    	   System.out.println(c);
       }
       else {
    	   System.out.println("Not a celeb");
       }
       
	}

}
