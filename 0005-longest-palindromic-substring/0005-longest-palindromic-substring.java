class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 2) return s; // Base case

        int start = 0, maxLength = 0;
        String longest = "";

        for (int i = 0; i < s.length(); i++) {
            // Expand around a single character (odd-length palindrome)
            String oddPalindrome = expandAroundCenter(s, i, i);
            // Expand around two adjacent characters (even-length palindrome)
            String evenPalindrome = expandAroundCenter(s, i, i + 1);

            // Check which palindrome is longer
            if (oddPalindrome.length() > maxLength) {
                longest = oddPalindrome;
                maxLength = oddPalindrome.length();
            }
            if (evenPalindrome.length() > maxLength) {
                longest = evenPalindrome;
                maxLength = evenPalindrome.length();
            }
        }

        return longest;
    }

    // Expands two pointers around a center to find the longest palindrome
    private String expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}

/*I AM GOING TO WRITE ALGORITHM FOR EACH QUESTION AND THAN SOLVE WHILE SITTING AT THE JOB */

/*ALGORITHM - I HAVE TO FIND THE PALINDROMIC STRING AND IT CAN BE RANGE FROM 2 CHARACTER INFINITY

1. I NEED TO CONVERT STRING INTO CHARACTER FIRST SO I CAN COMPARE THE STRINGS AND FIRST I HAVE TO CHECK IF THE STRING IS EMPTY OR NOT.
2. AFTER MAKING INTO CHARACTERS I WILL LOOP THEM THROUGH USING TWO POINTER TECHNIQUE
3. I WILL USE TWO POINTER WHERE ONE POINTER AT THE START AND OTHER POINTER IS AT OTHER END AND I WILL COUNT THE IF THE SUBSTRING MATCHES AND I WILL COUNT THE NUMBERS UNTIL SUBSTRING DOES NOT MATCH OR END
4. IF THERE IS NO MATCH FOR FIRST FEW CHARACTERS THAN I WILL MOVE START POINTER TO THE RIGHT AND THAN OTHER END POINTER TO LEFT.
5. ADD THE CHARACTER ARRAY INTO SUBSTRING AND MATCH IF THE LONGEST ARRAY AND THAN RETURN THE LONGEST ARRAY WHICH PALINDROMIC IS BACK
 */

 /*NEED TO WORK ON THIS DP APPROACH
 
 class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        boolean[][] f = new boolean[n][n];
        for (var g : f) {
            Arrays.fill(g, true);
        }
        int k = 0, mx = 1;
        for (int i = n - 2; i >= 0; --i) {
            for (int j = i + 1; j < n; ++j) {
                f[i][j] = false;
                if (s.charAt(i) == s.charAt(j)) {
                    f[i][j] = f[i + 1][j - 1];
                    if (f[i][j] && mx < j - i + 1) {
                        mx = j - i + 1;
                        k = i;
                    }
                }
            }
        }
        return s.substring(k, k + mx);
    }
} */