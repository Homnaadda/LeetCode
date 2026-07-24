class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int len = nums.length;
        int [] arr = new int[len];
        arr[0] = nums[0];
        for(int i=1;i<len;i++){
            arr[i] = arr[i-1]+nums[i];
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i = 0;i<len;i++){
            int r = arr[i]%k;
            if (map.containsKey(r)) {
                if (i - map.get(r) >= 2) {
                    return true;
                    }
                }
            else {
                map.put(r, i);
            }
            
        }
        return false;
    }
}