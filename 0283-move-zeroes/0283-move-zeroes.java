class Solution {
    public void moveZeroes(int[] nums) {
        int l =0,r=0;
        
        while(l<nums.length){
            if(nums[l] == 0){
                l++;
            }else{
                int temp = nums[r];
                nums[r] = nums[l];
                nums[l] = temp;
                r++;
                l++;
            }
        }
    }
}