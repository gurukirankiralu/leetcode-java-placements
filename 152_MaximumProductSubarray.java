// 152 - Maximum Product Subarray
// Time Complexity: O(n)
// Space Complexity: O(1)
// I struggled a lot to solve  this problem
class Solution {
    public int maxProduct(int[] nums) {
        int currentMax=nums[0];
        int currentMin=nums[0];
        int maxProduct=nums[0];
        for(int i=1;i<nums.length;i++){
          if(nums[i]<0){
            int temp=currentMax;
            currentMax=currentMin;
            currentMin=temp;
          }
          currentMin=Math.min(currentMin*nums[i],nums[i]);
          currentMax=Math.max(currentMax*nums[i],nums[i]);
          maxProduct=Math.max(maxProduct,currentMax);
      }
        return maxProduct;
    }
}
