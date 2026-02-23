// 53 - Maximum Subarray
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int currentSum=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
                if(currentSum+nums[i]>nums[i]){
                currentSum=Math.max(nums[i],currentSum+nums[i]);
            }
            else{
                currentSum=nums[i];  
            }
            max=Math.max(max,currentSum);
        }
      return max;
        
    }
}
