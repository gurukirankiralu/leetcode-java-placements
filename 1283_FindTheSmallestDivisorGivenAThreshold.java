// 1283 - Find the Smallest Divisor Given a Threshold
// Time Complexity: O(n log m)
// Space Complexity: O(1)
class Solution {
    public int totalSum(int[]nums,int divisor,int threshold){
        int sum=0;
        for(int i:nums){
            sum+=(i+divisor-1)/divisor;
            if(sum>threshold){
                return sum;
            }
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int max=0;
        for(int i:nums){
            max=Math.max(max,i);
        }
        int low=1;
        int high=max;
        while(low<=high){
            int mid=low+(high-low)/2;
            int sum=totalSum(nums,mid,threshold);
            if(sum<=threshold){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}
