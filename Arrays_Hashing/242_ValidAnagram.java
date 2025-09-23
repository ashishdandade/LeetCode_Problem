class Solution {
    public boolean isAnagram(String s, String t) {
        // char[] sc= s.toCharArray();
        // char[] tc= t.toCharArray();
        // Arrays.sort(sc);
        // Arrays.sort(tc);
        // return Arrays.equals(sc, tc);

        if(s.length()!=t.length())return false;
        int[] charArr= new int[26];
        for(int i=0;i<s.length();i++){
            charArr[s.charAt(i)-'a']++;
            charArr[t.charAt(i)-'a']--;
           }
         for(int i:charArr){
            if(i!=0) return false;
        }
        return true;
    }
}