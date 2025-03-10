class Solution {
    int sumOfSeries(int n) {
        if(n == 0){
            return n ;
        } else {
            return (n*n*n) + sumOfSeries(n - 1);
        }
    }
}

// Tc : O(N) , Sc : O(N)

// Given an integer n, calculate the sum of series 1^3 + 2^3 + 3^3 + 4^3 + … till n-th term.
// Example:

//Input: n = 5
//Output: 225
//Explanation: 13 + 23 + 33 + 43 + 53 = 225

// we are given an integer n , we need to calculate the sum of series 1^3 + 2^3 + 3^3 + 4^3 + … till n-th term.
// firstly we will check if n==0, then we will return n.
// else we will return the cube of n + the sum of the serie till n - 1.
// we will keep on calling the function until n becomes 0.
// then we will return  the function and the function will stop calling itself.

// Dry run:

// n = 3
// so, firstly we will check if n == 0, which is false, so we will return the cube of n + the sum of the series till n-1.
// n = 3
// so, we will return 3^3 + sumOfSeries(2)
// n = 2
// so, we will return 2^3 + sumOfSeries(1)
// n = 1
// so, we will return 1^3 + sumOfSeries(0)
// n == 0
// so, now n == 0, so we will return n.

// o/p -> 3^3 + 2^3 + 1^3 = 27 + 8 + 1 = 36