/*Problem:
Given an array of positive integers nums and a positive integer target,
find the minimal length of a contiguous subarray of which the sum is greater than or equal to target.
If there is no such subarray, return 0.

📦 Example:
Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length of 2.*/

/*I will use sliding window here. I will try to check if my count reaches upto the target, and when 
that happens I will count the numbers that it took and now I will drop the first number of the window
and try if that reaches to the target and if not add another number and so forth

ALGORITHM WITH STEPS - 
I need two differnt pointers here one is for sum and one is for how many digits I have used
I will use for loop for the iteration*/

function minSubArrayLen(target, nums) {
    let left = 0;
    let sum = 0;
    let minLength = Infinity;
    
    for (let right = 0; right < nums.length; right++) {
        sum += nums[right];
        
        while (sum >= target) {
            minLength = Math.min(minLength, right - left + 1);
            sum -= nums[left];
            left++;
        }
    }
    
    return minLength === Infinity ? 0 : minLength;
}
