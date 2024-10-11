import java.util.ArrayList;

public class Twomergesortarray {
    public static void main(String[] args) {
        // Given two sorted arrays
        int arr1[] = { 1, 3, 4, 5 };
        int arr2[] = { 2, 4, 6, 8 };

        // Call mergeArray to merge both arrays
        ArrayList<Integer> mergedArray = mergeArray(arr1, arr2);

        // Print the merged sorted array
        System.out.println(mergedArray);
    }

    public static ArrayList<Integer> mergeArray(int arr1[], int arr2[]) {
        ArrayList<Integer> arraythree = new ArrayList<>();
        int i = 0, j = 0;

        // Traverse both arrays and merge them
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                arraythree.add(arr1[i]);
                i++;
            } else {
                arraythree.add(arr2[j]);
                j++;
            }
        }

        // Add remaining elements from arr1 (if any)
        while (i < arr1.length) {
            arraythree.add(arr1[i]);
            i++;
        }

        // Add remaining elements from arr2 (if any)
        while (j < arr2.length) {
            arraythree.add(arr2[j]);
            j++;
        }

        return arraythree;
    }
}
