// 410 - Split Array Largest Sum
// Time Complexity: O(n log m)
// Space Complexity: O(1)
class Solution {
    public int numberOfSubArrays(int[]nums,int capacity){
        int norOfSubArrays=1;
        int sum=0;
        for(int i:nums){
            int currentSum=sum+i;
            if(currentSum<=capacity){
                sum+=i;
            }
            else{
                norOfSubArrays++;
                sum=i;
            }
        }
        return norOfSubArrays;
    }
    public int splitArray(int[] nums, int k) {
        int low=0;
        long high=0;
        for(int i:nums){
            low=Math.max(i,low);
             high+=i;     
        }
        while(low<=high){
            long mid=low+(high-low)/2;
            int subArrays=numberOfSubArrays(nums,(int)mid);
            if(subArrays<=k){
                high=mid-1;
            }
            else{
                low=(int)mid+1;
            }
        }
        return  low;
    }

}
