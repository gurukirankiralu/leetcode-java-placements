// 1903 - Largest Odd Number in String
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public String largestOddNumber(String num) {
        int r=num.length()-1;
        while(r>=0){
            char last=num.charAt(r);
            if((last-'0')%2==1){
                return  num.substring(0,r+1);
            }
            r--;
        }
        return "";
    }
}
