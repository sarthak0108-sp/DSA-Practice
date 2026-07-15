class Solution {
    public boolean judgeSquareSum(int c) {
        long i=0;
        long j=(long)Math.sqrt(c);
        while(i<=j){
            long sq=i*i+j*j;
            if(sq==c){
                return true;
            }
            else if(sq<c){
                i++;
            }
            else{
                j--;
            }
        }
        return false;
    }
}