class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        int shortLen=Integer.MAX_VALUE;
        for(String word:strs ){
            shortLen=Math.min(shortLen,word.length());
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<shortLen;i++){
            char pre=strs[0].charAt(i);
        for(String word:strs){
            if(word.charAt(i)!=pre){
                return sb.toString();
            }
        }
        sb.append(pre);
        }
        return sb.toString();
    }
}
