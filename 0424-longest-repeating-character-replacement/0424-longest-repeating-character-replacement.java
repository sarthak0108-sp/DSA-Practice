class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer>map=new HashMap<>();
        int maxfreq=0;
        int maxlen=0;
        int l=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            maxfreq=Math.max(map.get(ch),maxfreq);
            while((i-l+1)-maxfreq > k){
                char left=s.charAt(l);
                map.put(left,map.get(left)-1);
                if(map.get(left)==0){
                    map.remove(left);
                }
                l++;
            }
            maxlen=Math.max(maxlen,i-l+1);
        }
        return maxlen;
    }
}