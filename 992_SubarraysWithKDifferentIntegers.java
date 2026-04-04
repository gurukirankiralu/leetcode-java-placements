// 992 - Subarrays With K Different Integers
// Time Complexity: O(n)
// Space Complexity: O(n)
class Solution {
    public int numberOfSubArrays(int[]nums,int k){
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int right=0;
        int left=0;
        while(right<nums.length){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            while(map.size()>k){
                map.put(nums[left],map.getOrDefault(nums[left],0)-1);
                if(map.get(nums[left])==0){
                    map.remove(nums[left]);
                }
                left++;
            }
             count+=(right-left+1);
            right++;
        }
        return count;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return numberOfSubArrays(nums,k)-numberOfSubArrays(nums,k-1);
        
        
    }
}
