// 31 - Next Permutation
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int i=n-2;
        while(i>=0&&nums[i]>=nums[i+1]){
            i--;
        }
        if(i>=0){
            for(int j=n-1;j>i;j--){
                if(nums[j]>nums[i]){
                    swap(i,j,nums);
                    break;
                }
            }
        }
            reverse(i+1,n-1,nums);
        
    }
    public void swap(int first,int last,int[]nums){
        int temp=nums[first];
        nums[first]=nums[last];
        nums[last]=temp;
    }
    public void reverse(int first,int last,int[]nums){
        while(first<last){
            swap(first,last,nums);
            first++;
            last--;
        }
    }
}
