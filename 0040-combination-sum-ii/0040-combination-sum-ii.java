class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>>ans=new ArrayList<>();
        int n=candidates.length;
        combination(candidates,target,ans,new ArrayList<>(),n,0);
        return ans;
    }
    public void combination(int a[],int target,List<List<Integer>>ans,List<Integer>curr,int n,int idx){
        if(target==0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(target<0)return;
        for(int i=idx;i<n;i++){
            if(i>idx && a[i-1]==a[i])continue;
            curr.add(a[i]);
            combination(a,target-a[i],ans,curr,n,i+1);
            curr.remove(curr.size()-1);
        }

    }
}