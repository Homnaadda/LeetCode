class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int curlen = 0;
        int maxlen = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=1){
                maxlen = Math.max(curlen,maxlen);
                curlen = 0;
            }
            else{curlen+=1;}
        }
        return Math.max(curlen,maxlen);
    }
}