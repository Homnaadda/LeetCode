class Solution {
    public boolean isPalindrome(String s) {
        int left = 0,right = s.length()-1;

        while(left<right){
            if(!alphaNum(s.charAt(left))){
                left++;
            }else if(!alphaNum(s.charAt(right))){
                right--;
            }else{
                if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
                    return false;
                }
                left++;
                right--;
            }   
        }
        return true;
    }
    public boolean alphaNum(char ch){
        return (ch>='a' && ch<='z')|| (ch>='A' && ch<='Z') || (ch>='0' && ch<='9');
    }
}