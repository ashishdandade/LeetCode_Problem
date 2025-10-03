class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words=s.split(" ");
        if(pattern.length()!=words.length){
            return false;
        }
        Map<Character, String> patternToWord= new HashMap<>();
        Map<String, Character> wordToPattern= new HashMap<>();
        for(int i=0;i<words.length;i++){
            char patternChar=pattern.charAt(i);
            String word= words[i];
            if(!patternToWord.getOrDefault(patternChar,word).equals(word)|| wordToPattern.getOrDefault(word,patternChar)!=patternChar){
                return false;
            }
            patternToWord.put(patternChar,word);
            wordToPattern.put(word, patternChar);
        }
        return true;
    }
}