// 229 - Majority Element II
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public List<Integer> majorityElement(int[] nums) {
          List <Integer> result=new ArrayList<>();
        int n=nums.length/3;
        HashMap <Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>n){
                result.add(entry.getKey());
            }
        }
        return result;
    }
}
