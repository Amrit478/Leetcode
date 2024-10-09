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
