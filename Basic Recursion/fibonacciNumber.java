class Solution {
    public int fib(int n) {
         
        if(n <= 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2); // formula for fibonacci number
    }

    }
}

// Tc -> O(2^n) , Sc -> O(n)

// fib series -> 0 1 1 2 3 5 8 13 21 34 55 .....

// fib(5) = fib(4) + fib(3) ...formula

// it is a easy problem in which we need to find the nth fibonacci number.
// firstly we will check if the number is less than or equal to 1 or not
// if it is then we will return the number itself. beacause the ...
// fibonacci series starts from 0 and 1 so, if the number is less than or equal to 1 then it will be the number itself.
// else we will return the sum of the previous two  numbers.

// n = 5
// fib(5) = fib(4) + fib(3)
// : fib(4) = fib(3) + fib(2) = 2 + 1 = 3
// : fib(3) = fib(2) + fib(1) = 1 + 1 = 2

// fib(5) = 3 + 2 = 5
// o/p -> 5