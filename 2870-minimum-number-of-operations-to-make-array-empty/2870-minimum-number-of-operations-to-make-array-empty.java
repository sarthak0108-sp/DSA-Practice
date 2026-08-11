class Solution {
    public int minOperations(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();
        int ans=0;
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int num:map.keySet()){
            int freq=map.get(num);
            if(freq==1)return -1;
            ans+=Math.ceil((double)freq/3);
        }
        return ans;
    }
}