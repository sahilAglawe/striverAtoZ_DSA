class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n*(n+1)/2; //sum of first natural numbers formula
        int sum2 = 0;
        for(int i = 0; i< n; i++){
            sum2 = sum2 + nums[i];
        }
        return sum-sum2; // will find the missing number.
    }
}

// we iterate a loop and find a sum2 .
// and return the sum - sum2 i.e missing number.