/*Given a string s, return the longest palindromic substring in s.
Constraints

    1 <= s.length <= 1000
    s consist of only digits and English letters (lower-case and/or upper-case).

Examples
Input: s = "babad"
Output: "bab"
Note: "aba" is also a valid answer.
Input: s = "cbbd"
Output: "bb"*/

/*I will checking the palindromic but this time i have to use two pointers and in that I have to check 
that if the string is matching than how long and store that in a pointer and keep repating the process until finished

public class PalindromeMatch {

    // Function to find the longest palindromic substring
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }

        int start = 0;  // starting index of the longest palindrome
        int end = 0;    // ending index of the longest palindrome
        
        for (int i = 0; i < s.length(); i++) {
            // Expand around the center for odd length palindromes
            int len1 = expandAroundCenter(s, i, i);
            // Expand around the center for even length palindromes
            int len2 = expandAroundCenter(s, i, i + 1);
            
            // Get the max length between odd and even length
            int len = Math.max(len1, len2);
            
            // If the length of this palindrome is greater than the previous longest, update the start and end pointers
            if (len > (end - start)) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        
        // Return the longest palindrome substring
        return s.substring(start, end + 1);
    }

    // Helper function to expand around the center and find the length of the palindrome
    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1; // Length of the palindrome
    }

    public static void main(String[] args) {
        PalindromeMatch pm = new PalindromeMatch();
        
        String s1 = "babad";
        System.out.println("Longest Palindrome for 'babad': " + pm.longestPalindrome(s1));
        
        String s2 = "cbbd";
        System.out.println("Longest Palindrome for 'cbbd': " + pm.longestPalindrome(s2));
    }
}
