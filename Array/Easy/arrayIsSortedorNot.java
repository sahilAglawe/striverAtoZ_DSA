class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i = 0; i<n; i++){
            if(nums[i] > nums[i + 1]){ // if the current element is greater than the next element then increment the count.
               count++;
            }
            if(count > 1){
                return false;
            }
            
        }
        return true;
    }
}

// T/C: O(N) , S/C: O(1)

// we firstly declare a variable count and assign 0 to it.
// then we iterate through the array and check if the current element is greater than the next element then we increment the count.
// if the count is greater than 1 then we return false.
// finally, we return true.


// example: 
// arr = [1,2,3,4,5]
// iterate through the array
// 1 > 2 => count = 1
// 2 > 3 => count = 1
// 3 > 4 => count = 1
// 4 > 5 => count = 1
// if(count > 1) => 1 > 1 => condition false
// so , return true

// o/p: true