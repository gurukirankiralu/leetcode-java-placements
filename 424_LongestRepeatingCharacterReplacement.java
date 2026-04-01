// 424 - Longest Repeating Character Replacement
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public int characterReplacement(String s, int k) {
        int []freq=new int [26];
        int maxLen=0;
        int left=0;
        int right=0;
        int maxFreq=0;
        while(right<s.length()){
            char ch=s.charAt(right);
            freq[ch-'A']++;
            maxFreq=Math.max(maxFreq,freq[ch-'A']);
            if((right-left+1)-maxFreq<=k){
                maxLen=Math.max(maxLen,right-left+1);
            }
            else{
                freq[s.charAt(left)-'A']--;
                left++;
            }
            right++;

        }
        return maxLen;

    }
}
