// 1011 - Capacity To Ship Packages Within D Days
// Time Complexity: O(n log m)
// Space Complexity: O(1)
class Solution {
    public int numberOfDays(int []weights,int capasity ){
        int day=1;
        int load=0;
        for(int i=0;i<weights.length;i++){
            load+=weights[i];
            if(load>capasity){
                day++;
                load=weights[i];
            }
        }
        return day;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        for(int i:weights){
            low=Math.max(low,i);
            high+=i;
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            int day=numberOfDays(weights,mid);
            if(day<=days){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
  
        }
    return low;
    }
}
