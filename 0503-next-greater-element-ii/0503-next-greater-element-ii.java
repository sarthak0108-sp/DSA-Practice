class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int a[]=new int[n];
        Arrays.fill(a,-1);
        Stack<Integer>st=new Stack<>();
        for(int i=2*n-1;i>=0;i--){
            int idx=i%n;
            while(st.size()>0 && nums[st.peek()]<=nums[idx]){
                st.pop();
            }
            if(i<n && !st.isEmpty()){
                a[idx]=nums[st.peek()];
            }
            st.push(idx);
        }
        return a;
    }
}