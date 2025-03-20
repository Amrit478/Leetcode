
public int linearSearch(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == target) {
            return i;
        }
    }
    return -1;
}



public int binarySearch(int[] arr, int target) {
    int low = 0, high = arr.length - 1;
    while (low <= high) {
        int mid = low + (high - low) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }
    return -1;
}


              //Doing extra this one 

import java.util.Arrays;

public class Hashing {

    private static final int TABLE_SIZE = 10;

    public static int hash(int key) {
        return key % TABLE_SIZE;
    }

    public static void insert(int[] hashTable, int key) {
        int index = hash(key);
        while (hashTable[index] != -1) {
            index = (index + 1) % TABLE_SIZE;
        }
        hashTable[index] = key;
    }

    public static int search(int[] hashTable, int key) {
        int index = hash(key);
        while (hashTable[index] != -1) {
            if (hashTable[index] == key) {
                return index;
            }
            index = (index + 1) % TABLE_SIZE;
        }
        return -1;
    }
}
