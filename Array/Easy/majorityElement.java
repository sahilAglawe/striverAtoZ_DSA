class Solution {
    public int majorityElement(int[] nums) {
       Arrays.sort(nums);
       int n = nums.length;
       return nums[n/2];
    }
}

// T/C:O(NLogN) , S/C : O(1)

// we sort the array and return the middle element of the array as the majority element.

// for ex: arr = [1,2,3,4,5]
// after sorting the array => arr = [1,2,3,4,5]
// n = 5
// n/2 = 5/2 = 2
// return arr[2] = 3
// o/p : 3
// but this is not optimal solution as it will take O(nlogn).