class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         int n=strs.length;
         List<List<String>>ans=new ArrayList<>();
         boolean vis[]=new boolean[n];
         for(int i=0;i<n;i++){
            if(vis[i])continue;
            List<String>group=new ArrayList<>();
            group.add(strs[i]);
            vis[i]=true;
            for(int j=i+1;j<n;j++){
                if(!vis[j]&&isanagram(strs[i],strs[j])){
                    group.add(strs[j]);
                      vis[j]=true;
                }
              
            }
            ans.add(group);
         }
         return ans;
    }
    boolean isanagram(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        char []x=s1.toCharArray();
        char []y=s2.toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        return  Arrays.equals(x,y);
    }
}