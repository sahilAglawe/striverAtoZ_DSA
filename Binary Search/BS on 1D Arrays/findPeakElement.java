class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length-1;

        while(left < right) {
            int mid = (left + right) / 2;

            if(nums[mid] > nums[mid+1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}


// T/C: O(logn) , S/C: O(1)

// The idea is to use binary search to find the peak element.
// we compare the mid element with the next element to decide which half of the array to search in.
// if the mid element is greater than the next element, then we know that the peak element must be in the left half of the array (including mid).
// if the mid element is greater than the next element, then we know that the peak element must be in the right half of the array (excluding mid).
// we repeat this process until we find the peak element , which is the ellement that is greater than its neighbours.
// we return the index of the peak element.
