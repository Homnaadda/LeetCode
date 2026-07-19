class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || nums.length == 0 || k<=0){return new int[0];}

        int n = nums.length;
        int[] arr = new int[n-k+1];
        int r = 0;
        Deque<Integer> d = new LinkedList<>();
        for(int i=0;i<n;i++){

            if(!d.isEmpty() && d.peek()<i-k+1){
                d.poll();
            }

            while(!d.isEmpty() && nums[d.peekLast()]<nums[i]){
                d.pollLast();
            }
            d.offer(i);
            if(i>=k-1){
                arr[r++] = nums[d.peek()];
            }
        }
        return arr;
    }
}