package Linkedlist;
import java.util.LinkedList;
import java.util.Scanner;

public class StartString {
    public static void main(String[] args) {
        // Initialize a scanner for user input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the strings (press 'e' to finish):");

        // Create a LinkedList to store the strings
        LinkedList<String> words = new LinkedList<>();
        String word;

        // Loop to collect user input
        while (true) {
            word = input.nextLine(); // Read the next string

            // Check if the input is 'e' to break the loop
            if (word.equalsIgnoreCase("e")) {
                break;
            }

            // Add the string to the LinkedList
            words.add(word);
        }

        // Close the scanner
        input.close();

        // Print the collected strings
        System.out.println("You entered the following strings:");
        for (String str : words) {
            System.out.println(str);
        }
    }
}