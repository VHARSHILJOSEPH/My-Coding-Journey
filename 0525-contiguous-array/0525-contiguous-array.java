class Solution {
    public int findMaxLength(int[] nums) {
       HashMap<Integer,Integer> mp=new HashMap<>();
       mp.put(0,-1);
       int cursum=0;
       int maxlen=0;

       for(int i=0;i<nums.length;i++){
        cursum+=(nums[i]==0)?-1:1;
        if(!mp.containsKey(cursum)){
            mp.put(cursum,i);
        }
        else{
            maxlen=Math.max(maxlen,i-mp.get(cursum));
        }
       }
       return maxlen;
    }
}