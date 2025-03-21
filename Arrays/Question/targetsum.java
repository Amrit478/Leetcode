/*Given an array arr[] of n integers and a target value, the task is to find whether there is a pair of elements in the array whose sum is equal to target. This problem is a variation of 2Sum problem.

Examples: 

Input: arr[] = [0, -1, 2, -3, 1], target = -2
Output: true
Explanation: There is a pair (1, -3) with the sum equal to given target, 1 + (-3) = -2.


Input: arr[] = [1, -2, 1, 0, 5], target = 0
Output: false
Explanation: There is no pair with sum equals to given target.*/

/* Thes second approach will be best if I have sorted array, and I can solve it using three ways 
1. I have to apply to sorting and than apply binary search which will help me to find the if the target is there with addition of sums. However sorting will make its time n * logn, and Another way is 
with sorting I can also apply two pointer technique where I will use two pointer and the first one will be on the start and other one will be on the end. In this case if the target value is small than
we move the start pointer to one side and if it bigger value than target value than we move the pointer from end to end -1.*/

   // Function to check whether any pair exists
    // whose sum is equal to the given target value
    static boolean twoSum(int[] arr, int target){
        // Sort the array
        Arrays.sort(arr);
//Need to learn how to write two pointer technique in the coding 
      int left = 0; int right = arr.length - 1;

      //Iterate until left pointer does not get bigger than right pointer
      while(left < right) {
        int sum = arr[left] + arr[right];

        //Now check if the sum matches upto the target or higher or lower than move the pointer based on that because we already sorted the array
        if(sum == target) {
          return true;
        }
        else if(sum > target) {
          //move the right pointer to the one less or to the left
          right--;
        }
        else if(sum < target) {
          left++;
        }
        //if no pair is found than I will return false like i have done here
        return false;
      }

/*I will write code here using hashset as well because this will be good for unsorted arrays */

 // Function to check whether any pair exists
    // whose sum is equal to the given target value
    static boolean twoSum(int[] arr, int target){

      Hashset<Integer> amrit = new Hashset<>();

      //Now write a loop to find all the elements if the pair is found or otherwise say target does not exist

      for(int i = 0; i < arr.length(); i++) {
        //Need to go chatgpt to search how this logic is written but I write here anyways
        int comp = target - arr[i];

        if(amrit.contains(comp)) {
          return true;
        }
        //Add the current element to the set
        amrit.add(arr[i]);
      }
      // If the pair is not found than return false
      return false
