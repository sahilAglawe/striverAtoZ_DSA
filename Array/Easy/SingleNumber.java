//Find the number that appears once, and the other numbers twice


class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int num : nums) {
            result ^= num;
        }
        return result;
    }
}


// T/C: O(N) , S/C : O(1)

// The XOR used in this solution has the following properties:
// 1. a^a = 0 (XOR of a number with itself is 0)
// 2. a^0 = a (XOR of a number with 0 is the number itself)

// so if we XOR all the numbers in the array together, the numbers that appear twice will
// cancel each other out, and we will be left with the number that appears once.

// for ex, arr = [1,2,3,4,5,1,2,3,4]
// after XORing all the numbers together , we will bw left with 5
// as all the number that appear twice will cancel each other out...
// so the final result will be 5