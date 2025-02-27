//Need to find if the merge array is even or odd
//Also this is sorted array otherwise merge and than sort the array 
/*To find the median of an array, first sort the array in ascending order; then, if the array has an odd number of elements, the middle element is the median; if it has an even number of elements, the median is the average of the two middle elements.  */
/*Need to run a loop and enter into third array all the elements and sort the array and than write another method to check if the third array is odd or even and than based on that find the median out */
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] arr3 = new int[m + n]; // Merged sorted array
        int i = 0, j = 0, k = 0;

        // Merge two sorted arrays
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                arr3[k++] = nums1[i++];
            } else {
                arr3[k++] = nums2[j++];
            }
        }

        // If elements are left in nums1
        while (i < m) {
            arr3[k++] = nums1[i++];
        }

        // If elements are left in nums2
        while (j < n) {
            arr3[k++] = nums2[j++];
        }

        // Find the median
        int size = arr3.length;
        if (size % 2 == 0) { // Even length
            return (arr3[size / 2 - 1] + arr3[size / 2]) / 2.0;
        } else { // Odd length
            return arr3[size / 2];
        }
    }
}
    
