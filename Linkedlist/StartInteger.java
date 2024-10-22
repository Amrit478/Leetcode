package Linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class StartInteger {
    public static void main(String[] args) {
        // I am going to work with an integer linked list here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers (press 0 to finish):");

        LinkedList<Integer> list = new LinkedList<>();
        int usernumber;

        try {
            while (true) {
                usernumber = input.nextInt();
                if (usernumber == 0) {
                    break; // Exit the loop if the user enters 0
                } else {
                    list.add(usernumber); // Add the number to the linked list
                }
            }
        } catch (Exception e) {
            System.out.println("We have an error, please try again.");
        } finally {
            input.close(); // Close the scanner to prevent resource leaks
        }

        // Display the numbers entered
        System.out.println("Numbers entered: " + list);
    }
}