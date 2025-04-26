// Question: find the minimum element in a sorted rotated array.

class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;

        while(left < right ) {
            int mid = left + (right - left)/ 2;

            if (nums[mid] <= nums[right]) {
                right = mid;
            } else {
                left = mid +1;
            }
        }
        return nums[left];
    }
}

// T/C: O(logn) , S/C: O(1)

// basically we are checking if the mid element is less than or equal to the right element or not.
// if it is less than or equal to the right element then we can check if the mid element is less than or equal to the left element or not.
// so we can easily find the minimum element in the array.