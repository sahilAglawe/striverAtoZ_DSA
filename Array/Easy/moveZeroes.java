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

/*

at index 0, we have 0 value. In that case, we don't do anything. Move right pointer to the next

[0,1,0,3,12]
 L R
Now we find 1 which is a non zero number, so it's time to swap left number and right number. In the end,

[1,0,0,3,12]
 L R
When we swap two numbers, we move left pointer to the next. And then, move right pointer to the next in the next iteration.

[1,0,0,3,12]
   L R 
We don't do anything because current number is 0. Move next.

[1,0,0,3,12]
   L   R 
We find non zero number, swap the left number and right number.

[1,3,0,0,12]
   L   R 
Then move left pointer to the next. In the next iteration move right to the next.

[1,3,0,0,12]
     L   R 
we find non zero number. Swap the left number and right number.

[1,3,12,0,0]
     L    R 
Move left pointer to the next.

[1,3,12,0,0]
        L R 
Then finish iteration. We successfully move all zeroes to the right places.
And the description says "you must do this in-place without making a copy of the array". We meet the condition the description says. */

// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]