// 18 - 4Sum
// Time Complexity: O(n^3)
// Space Complexity: O(1)
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>>result=new ArrayList<>();
        for(int i=0;i<nums.length-3;i++){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<nums.length-2;j++){
                if(j>i+1&&nums[j]==nums[j-1]){
                continue;
            }
                int left=j+1;
                int right=nums.length-1;
                while(left<right){
                    long val=(long)nums[i]+nums[j]+nums[left]+nums[right];
                    if(val==target){
                        List<Integer>list=new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        result.add(list);
                        left++;
                        right--;
                        while(left<right&&nums[left]==nums[left-1]){
                            left++;
                        }
                        while(left<right&&nums[right]==nums[right+1]){
                            right--;
                        }   
                    }
                    else if(val>target){
                        right--;
                    }
                    else{
                        left++;
                    }
                }

            }
        }
        return result;
    }
}
