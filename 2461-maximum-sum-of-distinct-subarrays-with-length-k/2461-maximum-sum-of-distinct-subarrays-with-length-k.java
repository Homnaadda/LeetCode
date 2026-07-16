class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        int left = 0;
        long curSum = 0;
        long maxSum = 0;
        for(int i = 0;i<nums.length;i++){
            while(set.contains(nums[i])){
                curSum-=nums[left];
                set.remove(nums[left]);
                left++;
            }
            set.add(nums[i]);
            curSum+=nums[i];
            if(i-left+1==k){
                maxSum = Math.max(curSum,maxSum);
                curSum -=nums[left];
                set.remove(nums[left]);
                left++;
            }
        }
        return maxSum;
    }
}