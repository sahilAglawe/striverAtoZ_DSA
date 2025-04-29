class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        for (int pile : piles) {
            right = Math.max(right, pile);
        }
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canEat(piles, h, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
    
    private boolean canEat(int[] piles, int h, int k) {
        int hours = 0;
        for (int pile : piles) {
            hours += (pile + k - 1) / k; // Equivalent to ceil(pile / k)
        }
        return hours <= h;
    }
}

// T/C: O(nlog(max(piles))) , S/C: O(1)

/*
 Step-by-Step Walkthrough
1. Initial Check: Compute the maximum pile size to set the upper bound.
2. Binary Search:
Compute mid speed.
Check if all bananas can be eaten in h hours at mid speed.
Adjust the search range based on feasibility.
3. Termination: The loop ends when left == right, giving the minimum valid k.
 */