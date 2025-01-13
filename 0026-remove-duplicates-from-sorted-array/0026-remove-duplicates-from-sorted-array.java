class Solution {
    public int removeDuplicates(int[] nums) {
        return removeDuplicatesHelper(nums, 0, 1);
    }

    private int removeDuplicatesHelper(int[] nums, int index, int nextIndex) {
        // Base case: if `nextIndex` reaches the end of the array, return `index + 1`
        if (nextIndex == nums.length) {
            return index + 1;
        }

        // If the current and next elements are the same, skip the duplicate
        if (nums[index] == nums[nextIndex]) {
            return removeDuplicatesHelper(nums, index, nextIndex + 1);
        } else {
            // Move the unique element to the next position in the array
            nums[index + 1] = nums[nextIndex];
            return removeDuplicatesHelper(nums, index + 1, nextIndex + 1);
        }
    }
}
