class Solution {
    public boolean isPalindrome(String s) {
        String rem=s.toLowerCase().replaceAll("[^a-z0-9]","");
        int i=0;
        int j=rem.length()-1;
        while(i<j){
            if(rem.charAt(i)!=rem.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}