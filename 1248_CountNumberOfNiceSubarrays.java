// 1248 - Count Number of Nice Subarrays
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public int subArrays(int[]nums,int k){
        int count=0;
        int left=0;
        int right=0;
        int sum=0;
        while(right<nums.length){
            sum+=nums[right]%2;
            while(sum>k){
                sum-=nums[left]%2;
                left++;
            }
            count+=right-left+1;
            right++;

        }
        return count;

    }
    public int numberOfSubarrays(int[] nums, int k) {
        return subArrays(nums ,k)-subArrays(nums, k-1);
    }
}
