/*class Solution {
    public static int printAllDivisors(int n) {
        for(int i = 1; i <= n; i++) {
            if( n % i == 0){
                system.out.print(i + "");
            }
        }
    }
} */

// this is only for printing the divisors of a number

//if we want to sum the divisors of a number then we need to modify the code as follows:


class Solution {
    public static int sumOfDivisors(int n) {
        int sum = 0;
        int i = 1;
        while(n>0){
        for( i = 1; i <= n; i++) {
            if( n % i == 0){
               sum = sum + i;
            }
        }
        n = n-1;
      }
        return sum;
    }
}


// n = 4
//f(1) = 1
//f(2) = 1 + 2 = 3
//f(3) = 1 + 3 = 4
//f(4) = 1 + 2 + 4 = 7

// sum =  1+3+4+7 = 15
// o/p -> 15