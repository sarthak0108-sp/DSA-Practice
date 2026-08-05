class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
       // ArrayList<Integer>ans=new ArrayList<>();
        int ans[]=new int[n];
        Stack<Integer>st=new Stack<>();
        // for(int i=0;i<nums.length;i++){
        //     ans.add(0);
        // }
        for(int i=2*n-1;i>=0;i--){
            int idx=i%n;
            while(st.size()>0 && st.peek()<=nums[idx]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[idx]=-1;
            }
            else{
                ans[idx]=st.peek();
            }
            st.push(nums[idx]);
        }
        return ans;
    }
}