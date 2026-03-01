// 34 - Find First and Last Position of Element in Sorted Array
// Time Complexity: O(log n)
// Space Complexity: O(1)
class Solution {
    public int firstPosition(int []nums,int target){
        int low=0;
        int high=nums.length-1;
        int first=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                first=mid;
                high=mid-1;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return first;
    }
    public int lastPosition(int []nums,int target){
        int low=0;
        int high=nums.length-1;
        int last=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                last=mid;
                low=mid+1;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return last;
    }
    public int[] searchRange(int[] nums, int target) {
       int first=firstPosition(nums,target);
       if(first!=-1){
        return new int[]{first,lastPosition(nums,target)};
       }
       
       return new int[]{-1,-1};
    }
}
