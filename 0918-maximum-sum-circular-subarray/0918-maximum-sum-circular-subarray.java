class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int globMax = nums[0],globMin = nums[0];
        int curMax = 0,curMin = 0;
        int total = 0;

        for(int i=0;i<nums.length;i++){
            int n = nums[i];
            curMax = Math.max(n,curMax+n);
            globMax = Math.max(globMax,curMax);

            curMin = Math.min(n,curMin+n);
            globMin = Math.min(globMin,curMin);

            total+=n;
        }
        if(globMax>0){
            return Math.max(globMax,total-globMin);
        }else{
            return globMax;
        }
    }
}