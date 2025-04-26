/*Given a string s, find the length of the longest substring without repeating characters.

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. */

/*It is a sliding window question. I will use hashmap to record the unique substring for each time and 
and at the end I will return the longest substring possible.
ALGORITHM WITH THE STEPS -
I need to loop through this array using iteration for loop
I will use pointer to record the value that how many unique numbers are there
I will use window of how many unique values has gone through them and store in that pointer variable
I need another pointer to compare old unique value vs new unique value 
I will return the bigger number in this pointer*/


import java.util.HashMap;

public class Substring {
  public static void main(String[] args) {
    String s = "abcabcbb";
    System.out.println(longestsubstring(s)); // Should print 3
  }

  public static int longestsubstring(String s) {
    int start = 0;
    int maxLength = 0;
    HashMap<Character, Integer> amrit = new HashMap<>();

    for (int end = 0; end < s.length(); end++) {
      char c = s.charAt(end);

      if (amrit.containsKey(c) && amrit.get(c) >= start) {
        start = amrit.get(c) + 1;
      }

      amrit.put(c, end);
      maxLength = Math.max(maxLength, end - start + 1);
    }

    return maxLength;
  }
}


  //Recursive version
  public String longestsubstring(s){
    //Base case
    if(s.length() == 0) {
      return 0;
    }
    int start = 0;
    int end = 0;
    Hashmap<Character, Integer> amrit = new Hashmap<>();
//if it not duplicate than keep going and if we find duplicate than store in start and start again
    longestsubstring(amrit.contains(s) && );
  }








