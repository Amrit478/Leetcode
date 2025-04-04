class Solution {
    public int reverse(int x) {
        long finalNum = 0;
        while(x!=0){
            int lastDig = x%10;
            finalNum += lastDig;
            finalNum = finalNum*10;
            x= x/10;
        }
        finalNum = finalNum/10;
        if(finalNum > Integer.MAX_VALUE || finalNum<Integer.MIN_VALUE){
            return 0;
        }
        if(x<0){
            return (int)(-1*finalNum);
        }
        return (int)finalNum;
    }
}
/*THIS QUESTION WANTS ME TO REVERSE THE NUMBERS EXCEPT 0 AND THE NAGETIVE NUMBER REMAIN AT THEIR VALUE SO JUST SWITCH THE NUMBERS EXCEPT 0 */

/*ALGORITHM WITH THE STEPS WHICH WORKS BUT NOT OPTIMAL

I HAVE TO USE THREE POINTERS WITH USING FOR LOOP 
1. ONE POINTER IS FOR THE SAVE THE ALL THE CHARACTERS OR NUMBERS FROM THE BACK AND ANOTHER POINTER IS IF I HAVE 0 THAN MAKE IT SKIP AND THIRD POINTER IS RETURN ALL THE SAVED CHARACTER IN THE ARRAY  */

/* OPTIMAL APPROACH
Algorithm:

    Handle the Sign:

        Store the sign of the number and work with its absolute value.

    Extract and Reverse Digits:

        Initialize reversedNum = 0.

        Use a loop to extract digits from the last position (x % 10).

        Append the digit to reversedNum by multiplying reversedNum by 10 and adding the extracted digit.

        Reduce x by dividing it by 10 (x = x / 10).

    Check for 32-bit Overflow:

        Before adding a new digit, check if reversedNum will exceed the 32-bit integer range ([-2³¹, 2³¹ - 1]).

        If it exceeds, return 0.

    Restore the Sign and Return the Result. */