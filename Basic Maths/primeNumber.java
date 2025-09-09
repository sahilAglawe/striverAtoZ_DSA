 class Solution {
    public static boolean isPrime(int n) {
       if(n <= 1) return false;
       if(n == 2) return true;

       for(int i = 2; i<Math.sqrt(n); i++) {
          if(n % i == 0) {
            return false;
          }
       }
       return true;
    }
}


// prime number is a number which is divisible by 1 and itself only.
// so we need to check if the number id divisible by 1 and itself only.
// so we will run a loop from 1 to n and check if the number is divible by i or not
// if it is divisible then we will increase the count and if the count is 2 then, we will return true
// else we will return false.

// time complexity of this code is O(n) as we are running a loop from 1 to n.

