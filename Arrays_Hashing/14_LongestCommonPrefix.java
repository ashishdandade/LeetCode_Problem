class Solution {
    public String longestCommonPrefix(String[] strs) {
        int numberOfString=strs.length;
        for(int charIdx=0; charIdx<strs[0].length();charIdx++){
            for(int strIdx=1; strIdx<numberOfString;strIdx++){
                if(strs[strIdx].length()<=charIdx || strs[strIdx].charAt(charIdx)!=strs[0].charAt(charIdx)){
                    return strs[0].substring(0,charIdx);
                }
            }
        }
        return strs[0];
    }
}