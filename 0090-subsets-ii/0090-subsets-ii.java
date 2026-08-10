class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>ans=new ArrayList<>();
        int n=nums.length;
        subset(nums,ans,new ArrayList<>(),n,0);
        return ans;
    }
    public void subset(int[]a,List<List<Integer>>ans,List<Integer>curr,int n,int idx){
         ans.add(new ArrayList<>(curr));
         for(int i=idx;i<a.length;i++){
            if(i>idx && a[i]==a[i-1])continue;
               
            curr.add(a[i]);
            subset(a,ans,curr,n,i+1);
            curr.remove(curr.size()-1);
         }
    }
}