// Remove Duplicate from sorted array

class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i = 0;
        for(int j = 1; j < n; j++){
            if(nums[i] != nums[j]){
                nums[i + 1] = nums[j];
                i++;
            }
        }
        return (i+1);
    }
}

// T/C: O(n) , S/C: O(1)

// firstly, we declare two pointers i and j, where i is the slow pointer and j is the fast pointer.
// we iterate the array from j = 1 to n, where n is the length of the array.
// if the element at i and j is not equal, then we increment i and assign the value of j to i+1
// finally, we return the value of i+1 as the length of the array without duplicates.abstract 
// the array is modified in place, so no extra space is used.

// Example : 
// input : [1,1,2,2,3,4]
// i = 0, j = 1
// nums[i] = 1, nums[j] = 1 , so we do nothing
// i = 0, j = 2
// nums[i] = 1, nums[j] = 2, so we increment i and assign nums[j] to nums[i+1]
// i = 1, j = 3
// nums[i] = 2, nums[j] = 2 , so we do nothing
// i = 1, j = 4
// nums[i] = 2, nums[j] = 3, so we increment i and assign nums[j] to nums[i+1]
// i = 2, j = 5
// nums[i] = 3, nums[j] = 4, so we increment i and assign nums[j] to nums[i+1]
// finally we return i+1 = 3 as the length of array without duplicates.

// o/p : [1,2,3,4] , length = 3

