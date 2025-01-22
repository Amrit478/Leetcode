class Solution {
    public int lengthOfLongestSubstring(String s) {
        /*I need to find out what is the longest substring in this same strings
        where if the number gets repated than it cancels the strings and save into
        the biggest one and start again until the string is finished */

        /*I will solve it using optimization method
        
        I will solve using hash tables because of the unique of hashing.
        Also I would apply fix window sliding technique because when we done
        those numbers than we can go next window */

        int[] charFrequency = new int[128]; 
        int maxLength = 0; 
        int n = s.length();

        for (int start = 0, end = 0; end < n; end++) {
            char currentChar = s.charAt(end);
            charFrequency[currentChar]++; 

            while (charFrequency[currentChar] > 1) {
                charFrequency[s.charAt(start)]--; 
                                start++; 
            }

            
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}
