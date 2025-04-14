class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        // Build the hash table
        for (int i = 0; i < n; i++) {
            numMap.put(nums[i], i);
        }

        // Find the complement
        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement) && numMap.get(complement) != i) {
                return new int[]{i, numMap.get(complement)};
            }
        }

        return new int[]{}; // No solution found
    }
}

// T/C : O(N) 

// this solution uses a hash table to store the indices of the numbers in the array.

// ex: nums = [2,7,11,15], target = 9
// the hash table will look like this: 
// {2:0, 7:1, 11:2, 15:3} we save the index and the number in pair .
// for target = 9, we will check if the complement (9-2=7) exists in the table.
// if it does , we return the indices of the two numbers.
// in this case, we will return [0,1] as the indices of 2 and 7 respectively.
