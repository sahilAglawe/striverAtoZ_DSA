class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n= nums.length;
        int maxi = 0;
        int count = 0;
        for(int i = 0; i<n; i++){
            if(nums[i] == 1){
                count++;
                maxi = Math.max(maxi, count);
            } else {
                count = 0;
            }
        }
        return maxi;
    }
}

// Tc: O(N)

/* Input: nums = [1,1,0,1,1,1]
   Output: 3
   Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3. */
