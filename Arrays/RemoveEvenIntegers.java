public class RemoveEvenIntegers {
    public static void main(String[] args) {
        // Example input
        int[] numberone = {1, 2, 4, 5, 10, 11};
        // Call the method to remove even integers
        int[] result = removeEven(numberone);
        
        // Print the result
        System.out.print("Output: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static int[] removeEven(int[] arr) {
        // Count the number of odd integers
        int count = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                count++;
            }
        }

        // Create an array to hold the odd integers
        int[] result = new int[count];
        int j = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                result[j] = num;
                j++;
            }
        }

        return result; // Return the array with even integers removed
    }
}