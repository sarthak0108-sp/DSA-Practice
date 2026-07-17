class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
        Set<Integer>set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        
        int longest=1;
        for(int num:set){
            if(!set.contains(num-1)){
                int current=num;
                int count=1;
                while(set.contains(current+1)){
                    count++;
                    current++;
                }
                longest=Math.max(longest,count);
            }
           
        }
          
        return longest;
    }
}