// 15 - 3Sum
// Time Complexity: O(n²)
// Space Complexity: O(1)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result =new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int complement=nums[i];
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int val=complement+nums[left]+nums[right];
                if(val==0){
                    List<Integer>list=new ArrayList<>();
                    list.add(complement);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    result.add(list);
                     left++;
                     right--;
                     while(left < right && nums[left] == nums[left-1])
                      left++;

                     while(left < right && nums[right] == nums[right+1])
                      right--;
                }
                else if(val<0){
                    left++;
                }
                else{
                    right--;
                }
               
            }
        }
        return result;
    }
}
