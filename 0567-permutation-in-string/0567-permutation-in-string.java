class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        if(n>m){
            return false;
        }
        HashMap<Character,Integer>map1=new HashMap<>();
        HashMap<Character,Integer>map2=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch=s1.charAt(i);
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        int l=0;
        for(int i=0;i<m;i++){
            char ch1=s2.charAt(i);
            map2.put(ch1,map2.getOrDefault(ch1,0)+1);
            while(i-l+1>n){
                char left=s2.charAt(l);
                map2.put(left,map2.get(left)-1);
                if(map2.get(left)==0){
                    map2.remove(left);
                }
                l++;
            }
            if(map1.equals(map2)){
                return true;
            }
        }
        return false;
    }
}