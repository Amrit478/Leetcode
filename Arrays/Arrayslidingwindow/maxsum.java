/*Question:
Given an array of integers nums and an integer k, return the maximum sum of a subarray of length k.

Input: nums = [2, 1, 5, 1, 3, 2], k = 3  
Output: 9  
Explanation: Subarray with maximum sum is [5, 1, 3].
Input: nums = [1, 9, -1, -2, 7, 3, -1, 2], k = 4  
Output: 16  
Explanation: Subarray with maximum sum is [7, 3, -1, 2].
🔹 Constraints:
1 ≤ k ≤ length of nums ≤ 10⁵
-10⁴ ≤ nums[i] ≤ 10⁴*/
/*Brute force will be running two loops and than calculate the value but according to my i need solution in under 0(nlog(n))
and worst case scene is 0(n^2)*/

/*I need to write a loop where  I will run the array ends. In this loop I will give one logic that the
  sum will continue until the window size and than store to the pointer. It will do to the next how many 
  windows there are avilable. After storing each value to the new pointer I will count which sum is the 
  bigger and store that to the return pointer and discard the other sum and keep going on until I find 
  the biggest sum*/
  
public class maxsum {
  public static void main(String[] args){
    int [] nums = [2, 1, 5, 1, 3, 2]; 
    int K = 3;
  }
  
}
