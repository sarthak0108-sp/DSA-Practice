class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        int n=nums.length;
        boolean[] used=new boolean[n]; 
        backtrack(nums,ans,new ArrayList<>(),n,used);
        return ans;
    }
    public void backtrack(int[] a,List<List<Integer>>ans,List<Integer>curr,int n,boolean[]used){
        if(curr.size()==n){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=0;i<n;i++){
            if(used[i])continue;
            used[i]=true;
            curr.add(a[i]);
            backtrack(a,ans,curr,n,used);
            curr.remove(curr.size()-1);
            used[i]=false;
        }

    }
}