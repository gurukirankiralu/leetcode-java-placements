// 1358 - Number of Substrings Containing All Three Characters
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public int numberOfSubstrings(String s) {
        int []freq=new int [3];
        int left=0;
        int right=0;
        int count =0;
        while(right<s.length()){
            char ch=s.charAt(right);
            freq[ch-'a']++;
            while(freq[0]>0&&freq[1]>0&&freq[2]>0){
                count+=s.length()-right;
                freq[s.charAt(left)-'a']--;
                left++;
            }
            right++;
        }
        return count;
    }
}
