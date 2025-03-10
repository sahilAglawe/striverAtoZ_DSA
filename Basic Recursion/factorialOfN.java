// Question: Factorials less than or equal to n are calculated using the formula n! = n * (n-1) * (n-2) * ... * 1.

class Solution {
    static ArrayList<Long> factorialNumbers(Long n) {
        
        ArrayList<Long> result = new ArrayList<Long>(); // arraylist to store the result
        for(int i = 1; i<=n; i++){
            if(factorial(i) <= n)
             result.add(factorial(i)); // if the factorial of i is less than or equal to n then add it to the result
            if(factorial(i) > n)
             return result; // if the factorial of i is greater than n then return the result.
        }
        return result;
    }
    public static long factorial(long n){ // function to calculate the factorial of a number
        if(n == 1){
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }

}

// firstly we will create a function factorialNumbers() which will take a long n as input.
// we will create an arraylist result to store the result.
// then we will run a loop from 1 to n.
// we will check if the factorial of i is less than or equal to n or not.
// if it is then we will add the factorial of i to the result
// if the factorial of i is greater than n then we will return the result.
// then we will return the result.
// then we will create a function factorial() which will take a long n as input.
// we will check if n == 1, then we will return 1
// else we will return n * factorial(n-1).
// we will keep on calling the function until n becomes 1
// beacaue the factorial of 1 is 1.
// then we will return the function and the function will stop calling itself.

// Dry run: 
// n = 3 
// so, we will run a loop from 1 to 3.
// i = 1
// factorial(1) =1
// 1 <= 3, so we will add 1 to the result.
// i = 2
// factorial(2) = 2 * factorial(1) = 2 * 1 = 2
// 2 <= 3, so we will add 2 to the result.
// i = 3
// factorial(3) = 3 * factorial(2) = 3 * 2 = 6
// 6 <= 3, which is false, so we will return the result.

// o/p -> 1 2
// Tc: O(n) , Sc: O(n)