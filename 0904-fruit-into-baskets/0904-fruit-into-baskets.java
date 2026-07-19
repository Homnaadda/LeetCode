class Solution {
    public int totalFruit(int[] fruits) {
        int left = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxLen = 0;
        for(int right = 0;right<fruits.length;right++){
            map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);
            while(map.size()>2){
                int leftFruit = fruits[left];
                map.put(leftFruit,map.get(leftFruit)-1);
                if(map.get(leftFruit) == 0){
                    map.remove(leftFruit);
                }
                left++;
            }
            int curLen = right-left+1;
            maxLen = Math.max(curLen,maxLen);
        }
        return maxLen;
        
    }
}