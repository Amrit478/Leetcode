import java.util.ArrayList;

public class Twosorted {
    public static void main(String[] args) {
        int[] arrone = {1, 2, 3, 45, 5, 6, 7, 8, 199};

        // Call the function and print the result
        ArrayList<Integer> result = evenarray(arrone);

        // Print the result list
        System.out.println(result);
    }

    // Function to return an ArrayList of odd numbers
    public static ArrayList<Integer> evenarray(int[] arrone) {
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        // Iterate through the array and add only odd numbers to the list
        for (int i = 0; i < arrone.length; i++) {
            if (arrone[i] % 2 != 0) {  // Only add odd numbers
                oddNumbers.add(arrone[i]);
            }
        }

        return oddNumbers; // Return the ArrayList of odd numbers
    }
}
