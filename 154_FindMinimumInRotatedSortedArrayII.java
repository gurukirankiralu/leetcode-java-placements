// 154 - Find Minimum in Rotated Sorted Array II
// Time Complexity: O(log n) average, O(n) worst case
// Space Complexity: O(1)
class Solution {
    public int findMin(int[] nums) {
        int low=0;
        int high=nums.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(nums[mid]==nums[low]&&nums[mid]==nums[high]){
                low++;
                high--;
                continue;
            }
            if(nums[mid]>nums[high]){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return nums[low];
    }
}
