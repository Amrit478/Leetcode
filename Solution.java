/*Question - Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.*/

//Still has few errors
class Solution {
    public int findDuplicate(int[] nums) {
        //Need to find duplicate number and than print that number
        for(int i = 0; i < nums.length; i++) {
            for(int m = 0; m < nums.length; m++) {
                if(nums[i] == nums[m]) {
                     return nums[i];
                }
            }
           
        } 
        return -1;
    }
}
