class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] charFreq= new int[26];
        for(char x: text.toCharArray()){
            charFreq[x-'a']++;
        }
        charFreq['l'-'a']/=2;
        charFreq['o'-'a']/=2;

        int maxBalloon= Integer.MAX_VALUE;
        for(char c:"balon".toCharArray()){
            maxBalloon=Math.min(maxBalloon, charFreq[c-'a']);
        }
        return maxBalloon;
    }
}