class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        int n=nums.length;
        subset(nums,ans,new ArrayList<>(),n,0);
        return ans;
    }
    public void subset(int a[],List<List<Integer>>res,List<Integer>ans,int n,int i){
        if(i==n){
            res.add(new ArrayList<>(ans));
            return;
        }
     ans.add(a[i]);
     subset(a,res,ans,n,i+1);
     ans.remove(ans.size()-1);
     subset(a,res,ans,n,i+1);

    }
}