class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        while(left < right) {
            int mid = (left + right) /2;
            if(mid % 2 == 1) {
                mid--;
            }
            if(nums[mid] != nums[mid+1]) {
                right = mid;
            } else {
                left = mid + 2;
            }
        }
        return nums[left];
    }
}

// T/C: O(logn) , S/C: O(1)

// The array is sorted and continous and has only one element which is not repeated.
// The rest of the elements are repeated twice.
// so, in this case we can use binary search to find the element which is not repeated.
// the idea is to find the mid element and check if the mid element is equal to the next element or not.
// if is equal to the next element then we can check if the mid is even or odd.
// if it is even then we can check if the mid element is equal to the next element or not.
// if it is equal then we can move the next element to the left side of the mid element and check again.
// so we can move left to mid+2 and right to mid-1.
// then return the left element which is not repeated.
