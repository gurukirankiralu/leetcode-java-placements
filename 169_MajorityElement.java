// 169 - Majority Element
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=nums.length/2;
        int maxKey=0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()>n){
                maxKey=entry.getKey();
                break;
            }
            }
             return maxKey;

        
       
    }
}
