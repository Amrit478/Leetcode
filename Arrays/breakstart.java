/*You are given an array of integers:

int[] numbers = {23, 45, 12, 67, 34, 89, 5, 38};
Write a Java program to:
Find and print the maximum value in the array.
Find and print the minimum value in the array.*/
public class Main {
    public static void main(String[] args) {
        int[] numbers = {23, 45, 12, 67, 34, 89, 5, 38};

        // Call the method to find and print max and min
        findMaxAndMin(numbers);
    }
    /*I will need three pointers to store two pointers which will return the max and min
    integer in the arrays and I will use for loop until i reach end of the array and and in that
    condition I will check if the integer is bigger than first pointer I will save in the big
    Integer and if it not than I will check with the small Integer and if it is not small than
    I discard and run the next integer and I will return the biggest and smallest pointer at the end.*/
    
  public static void findMaxAndMin(int[] numbers) {
        if (numbers.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            } else if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}

/*You are given an array of integers:
int[] numbers = {10, 5, 8, 20, 2, 18};
Write a Java program to:
Calculate and print the sum of all elements in the array.
Calculate and print the average (mean) value of the array elements.*/

public class Main {
  public static void main(String[] args){
    int[] numbers = {10, 5, 8, 20, 2, 18};

    Sumofall(numbers);
  }
  public static void Sumofall(int [] numbers) {
    /*I will declare first pointer and add the sum of the value given in this array.
    After adding the sum I can return that sum and I will use second pointer which has the
    length of all the numbers integer array and to find the average I will divide the sum
    by the length of that array. I will be also working with the while loop which will be 
    helping me move the array forward*/
    int sum = 0;

    // Calculate the sum of elements
    for (int i = 0; i < numbers.length; i++) {
        sum += numbers[i];
    }

    // Calculate the average
    double average = (double) sum / numbers.length;

    // Print the sum and average
    System.out.println("Sum of elements: " + sum);
    System.out.println("Average value: " + average);
  }
}

/*You are given an array of integers:
int[] numbers = {1, 3, 2, 5, 4, 8, 6, 7};
Write a Java program to find the maximum sum of a subarray of a given size k.

For example, for the array above and k = 3, the program should return 
"maximum sum of subarray of size 3 is 15" because the subarray [5, 4, 8] has the largest sum (5 + 4 + 8 = 15).*/






/*I am just going to write some logic for arrays because i have not study for past 2 days*/

public class Main {
  public static void main(String[] args) {
    int[] amrit = new int[10];
    int i = 0;

    amrit[0] = 12;
    amrit[1] = 1;
    amrit[2] = 2;
    amrit[3] = 3;
    amrit[4] = 4;
    amrit[5] = 5;
    amrit[6] = 6;
    amrit[7] = 7;

    // Now printing the non-zero (initialized) values of the array
    while (i < amrit.length && amrit[i] != 0) {
      System.out.println(amrit[i]);
      i++;
    }
  }
}
