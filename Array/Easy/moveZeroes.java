class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;
        int n = nums.length;
        for(int right = 0; right < n; right++) {
            if(nums[right] != 0) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
    }
}

// first we declare the variable left .
// then we iterate the loop from right = 0 to nums.length
// and we check nums[right] != 0 then, we used to swap values
// after that increment the left variable,
// we find our solution.

// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]