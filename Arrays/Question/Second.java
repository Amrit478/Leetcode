/*Given an array of positive integers arr[] of size n, the task is to find second largest distinct element in the array.

Note: If the second largest element does not exist, return -1.

Examples:

Input: arr[] = [12, 35, 1, 10, 34, 1]
Output: 34
Explanation: The largest element of the array is 35 and the second largest element is 34.


Input: arr[] = [10, 5, 10]
Output: 5
Explanation: The largest element of the array is 10 and the second largest element is 5.

*/
import java.util.HashSet;
import java.util.Set;

class GfG {
    static int getSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            return -1;
        }

        // Step 1: Use a set to get unique values
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        if (set.size() < 2) {
            return -1;
        }

        // Step 2: Find largest and second largest
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : set) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr1 = {12, 35, 1, 10, 34, 1};
        System.out.println(getSecondLargest(arr1)); // Output: 34

        int[] arr2 = {10, 5, 10};
        System.out.println(getSecondLargest(arr2)); // Output: 5

        int[] arr3 = {10, 10, 10};
        System.out.println(getSecondLargest(arr3)); // Output: -1
    }
}
