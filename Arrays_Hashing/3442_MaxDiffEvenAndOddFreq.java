class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26];

        // Count frequency of each character
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        int maxOdd = Integer.MIN_VALUE;
        int minEven = Integer.MAX_VALUE;

        // Find max odd frequency and min even frequency
        for (int f : freq) {
            if (f > 0) {
                if (f % 2 == 1) { // odd
                    maxOdd = Math.max(maxOdd, f);
                } else { // even
                    minEven = Math.min(minEven, f);
                }
            }
        }

        return maxOdd - minEven;
    }
}