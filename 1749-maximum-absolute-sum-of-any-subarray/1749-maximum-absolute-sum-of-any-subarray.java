class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int curMin = 0,curMax= 0;
        int globMax = nums[0],globMin = nums[0];
        for(int i=0;i<nums.length;i++){
            int n = nums[i];
            curMin = Math.min(n,curMin+n);
            globMin  = Math.min(globMin,curMin);

            curMax = Math.max(n,curMax+n);
            globMax = Math.max(globMax,curMax);
        }
        return Math.max(globMax,Math.abs(globMin));
    }
}