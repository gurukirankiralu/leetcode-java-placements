// 34 - Find First and Last Position of Element in Sorted Array
// Time Complexity: O(log n)
// Space Complexity: O(1)
public int upperBound(int []nums,int target){
        int low=0;
        int high=nums.length-1;
        int up=nums.length;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>target){
                up=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return up;
    }
 public int lowerBound(int[]nums,int target){
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>=target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public int[]firstAndLastPosition(int[]nums,int target){
        int first=lowerBound(nums,target);
        if(first<nums.length&&nums[first]==target){
            int last=upperBound(nums,target);
            return new int[]{first,last-1};
        }
        return new int[]{-1,-1};
    }
