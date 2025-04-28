class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int maxNum = 0;
        for(int num : nums){
            if(num > maxNum) {
                maxNum = num;
            }
        }

        int low = 1;
        int high = maxNum;

        while(low <= high) {
            int mid = low + (high - low)/2;
            int sum = 0;
            for(int num : nums) {
                sum += (num + mid - 1) / mid;
                if(sum > threshold){
                    break;
                }
            }

            if(sum <= threshold) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}

// T/C: O(nlog(maxNum)) , S/C: O(1)

// the idea is to use binary search to find the smallest divisor that satisfies the condition of the problem.
// we start by finding the maximum number in the array to set the upper bound of our search range.
// we then set the lower bound to 1. we perform binary search on the range [1, maxNum] and calculate the sum of the array elements divides by the current divisor (mid).
// if the sum is less than or equal to the threshold , we know that we can try a smaller divisor, so we move the upper bound down.
// if the sum is greater than the threshold , we know that we need to try a larger division, so we move the lower bound up.
// we repeat this process until we find the smallest divisor that satisfies the condition.
// then we return the smallest divisor that satisfies the condition.