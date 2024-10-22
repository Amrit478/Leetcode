package Linkedlist;
import java.util.LinkedList;
import java.util.Scanner;

public class StartInteger {
    public static void main(String[] args) {
        // Initialize a scanner for user input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers (press 0 to finish):");

        // Create a LinkedList to store the numbers
        LinkedList<Integer> numbers = new LinkedList<>();
        int number;

        // Loop to collect user input
        while (true) {
            number = input.nextInt(); // Read the next integer

            // Check if the input is 0 to break the loop
            if (number == 0) {
                break;
            }

            // Add the number to the LinkedList
            numbers.add(number);
        }

        // Close the scanner
        input.close();

        // Print the collected numbers
        System.out.println("You entered the following numbers:");
        for (Integer num : numbers) {
            System.out.println(num);
        }
    }
}