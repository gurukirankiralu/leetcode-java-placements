// 485 - Max Consecutive Ones
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int current=0;
        for(int num:nums){
            if(num==1){
                current++;
                count=Math.max(current,count);
            }
            
            if(num!=1){
                current=0;
            }
        }
        return count;
    }
}
