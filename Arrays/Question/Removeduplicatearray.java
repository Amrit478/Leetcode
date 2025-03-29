/*Input: nums = [1,1,2]
Output: 2, nums = [1,2]
Explanation: Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the returned length.
Example 2:

Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4]
Explanation: Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively. It doesn't matter what values are set beyond the returned length.
*/
/* Steps to solve this problem
This is the sorted array where I can use hash table for sending the unique elements
*/
public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        // Length of the updated array
  int n = nums.length;
  int i = 0;
  Hashtable<Integer> amrit = new Hashtable<>();
  while(n < i) {
    //Need to work on it when reach at home
  }
