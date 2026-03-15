// 1482 - Minimum Number of Days to Make m Bouquets
// Time Complexity: O(n log m)
// Space Complexity: O(1)
class Solution {
    public int numberOfBouquets(int[] bloomDay, int day,int k){
        int adjFlower=0;
        int bouquets=0;
        for(int i:bloomDay){
            if(i<=day){
                adjFlower++;
            }
            else{
                bouquets+=adjFlower/k;
                adjFlower=0;
            }
            }
             bouquets+=adjFlower/k;
        return bouquets;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k>bloomDay.length){
            return -1;
        }
        int low=Integer.MAX_VALUE;
        int high=0;
        for(int i:bloomDay){
            low=Math.min(low,i);
            high=Math.max(high,i);
        }  
        while(low<=high){
                int mid=low+(high-low)/2;
                int bouquets=numberOfBouquets(bloomDay,mid,k);
                if(bouquets>=m){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            return low;

    }
}
