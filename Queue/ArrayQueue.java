package Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ArrayQueue{
  public static void main(String[] args) {
   
        int[] array = {1, 2, 3, 4, 5};
    
        // Create a queue
        Queue<Integer> queue = new LinkedList<>();
    
        // Add elements from the array to the queue
        for (int num : array) {
            queue.add(num);
        }
    
        // Process elements from the queue
            while (!queue.isEmpty()) {
                int element = queue.remove();
                // Apply your logic here
                System.out.println(element * 2); // Example: double each element
            }
        }
    }