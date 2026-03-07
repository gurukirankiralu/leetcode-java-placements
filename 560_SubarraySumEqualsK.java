// 560 - Subarray Sum Equals K
// Time Complexity: O(n)
// Space Complexity: O(n)
class Solution {
    public int subarraySum(int[] nums, int k) {
      HashMap<Integer,Integer>map=new HashMap<>();
      int count=0;
      int prefix=0;
      map.put(0,1);
      for(int i=0;i<nums.length;i++){
        prefix+=nums[i];
        int old=prefix-k;
        if(map.containsKey(old)){
            count+=map.get(old);
        }
            map.put(prefix,map.getOrDefault(prefix,0)+1);
      }
      return count;
    }
}
