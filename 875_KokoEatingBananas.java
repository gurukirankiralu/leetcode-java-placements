// 875 - Koko Eating Bananas
// Time Complexity: O(n log m)
// Space Complexity: O(1)
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        for(int i:piles){
            max=Math.max(max,i);
        }
        int low=1;
        int high=max;
        int k=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            int totalHour=0;
            for(int i=0;i<piles.length;i++){
                totalHour+=(piles[i]+mid-1)/mid;
                if(totalHour>h){
                    break;
                }

            }
            if(totalHour<=h){
                k=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }

        }
        return k;
    }
}
