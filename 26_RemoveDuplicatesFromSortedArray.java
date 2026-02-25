// 26 - Remove Duplicates from Sorted Array
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public int removeDuplicates(int[] nums) {
       int i=0;
       int j=1;
       while(j<nums.length){
        if(nums[i]==nums[j]){
            j++;
        }
        else{
            nums[i+1]=nums[j];
            i++;
            j++;

        }
       }
       return  i+1;

    }
}
