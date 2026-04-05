// 76 - Minimum Window Substring
// Time Complexity: O(n)
// Space Complexity: O(n)
class Solution {
    public String minWindow(String s, String t) {
       int []hash=new int [128];
       int left=0;
       int right=0;
       int count =0;
       int n=t.length();
       int minLen=Integer.MAX_VALUE;
       int startIndex=-1;
       for(int i=0;i<n;i++){
        hash[t.charAt(i)]++;
       }
       while(right<s.length()){
        if(hash[s.charAt(right)]>0){
            count++;
        }
        hash[s.charAt(right)]--;
        while(count==n){
            if(right-left+1<minLen){
                minLen=right-left+1;
                startIndex=left;
            }
            hash[s.charAt(left)]++;
            if(hash[s.charAt(left)]>0){
                count--;
            }
            left++;
        }
        right++;
       }
       return startIndex==-1?"":s.substring(startIndex,startIndex+minLen);
    }
}
