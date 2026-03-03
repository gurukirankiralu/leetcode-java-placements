// 2149 - Rearrange Array Elements by Sign
// Time Complexity: O(n)
// Space Complexity: O(n)
class Solution {
    public int[] rearrangeArray(int[] nums) {
        if(nums==null||nums.length==0){
            return nums;
        }
        int []ans=new int[nums.length];
        int p=0;
        int n=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                ans[p]=nums[i];
                p=p+2;

            }
            else{
                ans[n]=nums[i];
                n=n+2;
            }
        }
        return ans;
    }
}
