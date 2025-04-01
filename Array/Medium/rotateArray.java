class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // if arr size is 7 and k = 3 so remainder 4 so, we pushed 4 element on right side.
        int[] rotated = new int[n];

        for(int i = 0; i<n; i++){
            rotated[( i + k) % n] = nums[i];
        }

        for(int i = 0; i<n; i++){
            nums[i] = rotated[i];
        }
    }
}

// Input: nums = [1,2,3,4,5,6,7], k = 3
// Output: [5,6,7,1,2,3,4]
// Explanation:
// rotate 1 steps to the right: [7,1,2,3,4,5,6]
// rotate 2 steps to the right: [6,7,1,2,3,4,5]
// rotate 3 steps to the right: [5,6,7,1,2,3,4]
// it means we are rotating the array to the right by k steps.
// so, we are taking the last k elements and putting them in the front of the array.