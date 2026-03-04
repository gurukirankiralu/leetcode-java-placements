class Solution {
    public int longestConsecutive(int[] nums) {
   Set<Integer> set=new HashSet<>();
   int length=0;
   for(int i:nums){
    set.add(i);
   }
   for(int num:set){
    if(!set.contains(num-1)){
        int currentNum=num;
        int currentLength=1;
        while(set.contains(currentNum+1)){
            currentNum++;
            currentLength++;
        }
        length=Math.max(length,currentLength);
    }
   }
   return length;
    }
}
