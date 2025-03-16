 class Solution {
    public static boolean isPrime(int n) {
        int count = 0;
        for(int i = 1; i<=n; i++) {
            if(n % i == 0) {
                count ++;
            }
            if( count == 2 ) {
                return true;
            } else {
                return false;
            }
        }
    }
}


// prime number is a number which is divisible by 1 and itself only.
// so we need to check if the number id divisible by 1 and itself only.
// so we will run a loop from 1 to n and check if the number is divible by i or not
// if it is divisible then we will increase the count and if the count is 2 then, we will return true
// else we will return false.

// time complexity of this code is O(n) as we are running a loop from 1 to n.

// n = 5
// 5 % 1 == 0 => count = 1
// 5 % 2 != 0
// 5 % 3 != 0
// 5 % 4 != 0
// 5 % 5 == 0 => count = 2

// so the number is prime number.