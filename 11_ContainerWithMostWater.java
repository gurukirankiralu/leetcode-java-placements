// 11 - Container With Most Water
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public int maxArea(int[] height) {
      int first=0;
      int last=height.length-1;
      int maxArea=0;
      while(first<last){
        int h=Math.min(height[first],height[last]);
        int w=last-first;
         int area=h*w;
        maxArea=Math.max(maxArea,area);
        if(height[first]<height[last]){
            first++;
        }
        else{
            last--;
        }

      }
      return maxArea;
    }
}
