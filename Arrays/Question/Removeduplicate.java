/*Given a sorted array arr[] of size n, the goal is to rearrange the array so that all distinct elements appear at the beginning in sorted order. Additionally, return the length of this distinct sorted subarray.

Input: arr[] = [2, 2, 2, 2, 2]
Output: [2]
Explanation: All the elements are 2, So only keep one instance of 2.


Input: arr[] = [1, 2, 2, 3, 4, 4, 4, 5, 5]
Output: [1, 2, 3, 4, 5]

Input: arr[] = [1, 2, 3]
Output: [1, 2, 3]
Explanation : No change as all elements are distinct.*/

/*To find the distinct elements I will use Hashset because it will find distinct elements

STEPS FOR ALGORITHM
1. run while loop until array length.
2. apply hashmap and return the distinct elements*/

 static int removeDuplicates(int[] arr) {
   
