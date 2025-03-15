class Solution {
    public int lengthOfLongestSubstring(String s) {
        /*I am going to use hash table with sliding window with it
        STEPS FOR ALGORITHM FOR CODING
         
         1. Use while loop for string length until it reaches until end
         2. Use pointer to store that how many distinct elements are there and store in the another pointer
         3. if i have another thing comes up like that i will compare the other pointers to match which substring is bigger.         
         */
            HashSet<Character> set = new HashSet<>();

        int left = 0; // Left pointer for the sliding window

        int maxLength = 0; // Variable to store the maximum length found


        for (int right = 0; right < s.length(); right++) {

            // If the character is already in the set, remove characters from the left

            // until we can add the current character

            while (set.contains(s.charAt(right))) {

                set.remove(s.charAt(left));

                left++;

            }

            // Add the current character to the set

            set.add(s.charAt(right));

            // Update the maximum length

            maxLength = Math.max(maxLength, right - left + 1);

        }


        return maxLength;
}
}