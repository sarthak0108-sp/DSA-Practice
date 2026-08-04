class Solution {
    public int evalRPN(String[] tokens) {
        int n=tokens.length;
        Stack<Integer>st=new Stack<>();
        String s="+-*/";
        int res=0;
        for(String token:tokens){
            if(s.indexOf(token)!=-1){
                int d2=st.pop();
                int d1=st.pop();
                if(token.equals("+")){
                  res=d1+d2;
                }
                else if(token.equals("-")){
                  res=d1-d2;
                }
                 else if(token.equals("*")){
                  res=d1*d2;
                }
                 else if(token.equals("/")){
                    if(d2!=0){
                  res=d1/d2;
                  }
                }
                st.push(res);
            }
            else{
            st.push(Integer.parseInt(token));}
            
        }
        return st.peek();

    }
}