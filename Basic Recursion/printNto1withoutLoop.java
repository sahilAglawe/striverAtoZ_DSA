class Solution {

    void printNto1(int N) {
        if(N == 0) {
            return;
        } else {
            System.out.print(N + " ");
            printNto1(--N); // calling the function recusively with N-1
        }
    }
}


// Tc : O(N) , Sc : O(N)

// this problem is similar to the printNameNTimes and print1toNwithoutLoop problem.
// we are printing the number from N to 1 without using a loop.
// firstly we will check if N == 0, then we will return
// else we will print the numbers and call the function recursively with N-1.
// we will keep  on calling the functions until N becomes 0.
// then  we will return the function, and the function will stop calling itself.abstract 


// Dry run:
// N = 5
// so, firstly we will check if N == 0, which is false , so we will print the number and call the function recursively with N-1;
// --N => 4
// N = 4
// so, firstly we will check if N == 0, which is false , so we will print the number and call the function recursively with N-1;
// --N => 3
// N = 3
// so, firstly we will check if N == 0, which is false , so we will print the number and call the function recursively with N-1;
// --N => 2
// N == 2
// so, firstly we will check if N == 0, which is false , so we will print the number and call the function recursively with N-1;
// --N => 1
// N == 1
// so, firstly we will check if N == 0, which is false , so we will print the number and call the function recursively with N-1;
// --N => 0
// N == 0
// so, now N == 0, so we will return the function and the function will stop calling itself.

// o/p -> 5 4 3 2 1