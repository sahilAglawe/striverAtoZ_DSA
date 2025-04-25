// Question : find the first and last position of an element in a sorted array.

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        boolean found = false;
        int x = -1;

        while ( left <= right) {
            int mid = (left + right)/ 2;
            if(nums[mid] == target) {
                x = mid;
                found = true;
                break;
            }
            if(nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        } 

        if(!found) {
            return new int[]{-1, -1};
        }
        left = x;
        right = x;

        while(left >= 0 && nums[left] == target) {
            left--;
        }
        while (right < nums.length && nums[right] == target) {
            right++;
        }

        return new int[]{left + 1, right - 1};
    }
}


// T/C : O(logn) , 