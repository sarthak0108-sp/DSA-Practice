class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        combination(candidates,target,ans,new ArrayList<>(),0);
        return ans;
    }
    public void combination(int [] candidates,int target, List<List<Integer>>ans,List<Integer>curr,int i){
        if(target==0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(i>=candidates.length||target<0)return;
        curr.add(candidates[i]);
        combination(candidates,target-candidates[i],ans,curr,i);
         curr.remove(curr.size()-1);
         combination(candidates,target,ans,curr,i+1);
       

    }
}