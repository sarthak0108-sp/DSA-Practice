class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:tasks){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int res=0;
        for(int num:map.keySet()){
            int freq=map.get(num);
            if(freq==1)return -1;
            res+=Math.ceil((double)freq/3);
        }
        return res;
    }
}