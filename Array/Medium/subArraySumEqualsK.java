class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0, result = 0;
        Map<Integer, Integer> preSum = new HashMap<>();
        preSum.put(0,1);

        for(int i = 0; i< nums.length; i++){
            sum += nums[i];
            if(preSum.containsKey(sum - k)) {
                result += preSum.get(sum -k);
            }
            preSum.put(sum, preSum.getOrDefault(sum,0) + 1);
        }
        return result;
    }
}

// T/C: O(n) - we only need to iterate through the array once.

// So, in this ase, we can use a hashmap to store the prefix sum and its frequency.
// we can use the prefix sum to find the number of subarrays that sum to k.
// The prefix sum is the sum of all elements from the beginning of the array to the current index.
// we can use the prefix sum to find the number of subarrays that sum to k by checking if the prefix sum minus k exists in the hashmap.abstract .abstract 
// if it exists, we can add the frequency of that prefix sum to the result.
// we also need to update the frequency of the current prefix sum in the hashmap.
// we can use the get method to get the frequency of the prefix sum from the hashmap.
// if it doesnt exist , we can use put method to add the prefix sum to the hashmap with frequency 1.
// so, this is the basic idea of the algorithm.

/*Example 1:

Input: nums = [1,1,1], k = 2
Output: 2
Example 2:

Input: nums = [1,2,3], k = 3
Output: 2 */
