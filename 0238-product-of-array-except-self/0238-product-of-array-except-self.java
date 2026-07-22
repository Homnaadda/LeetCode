class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len];
        ans[0] = 1;

        for(int i=1;i<len;i++){
            ans[i] = nums[i-1]*ans[i-1];
        }
        int rightPro = 1;

        for(int r = len-1;r>=0;r--){
            ans[r] = rightPro*ans[r];
            rightPro *= nums[r];
        }
        
        return ans;
    }
}