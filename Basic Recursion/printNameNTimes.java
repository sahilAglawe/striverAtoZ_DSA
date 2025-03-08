class Solution {
         
    void printName(int N) {
        if( N == 0){
            return;
        } else {
            System.out.print("GFG"+ " ");
            printName(--N); // calling the function recursively with N-1
        }
    }
}

// TC: O(N), SC: O(N)

// so, the above code is a simple example of recursion where we are printing the name N times.
// we are using the printName() function to print the name N times.
// we are checking if N == 0, then we will return, else we will print the name and call the function recursively with N-1.
// so, the function will keep calling itself until N becomes 0
// and then it will return and the function will stop calling itself.

// N = 3
// so, firstly fuction checks if N == 0, which is false, so it prints the name 
// and calls the function recursively with N-1, which is 2
// then the function checks if N == 0, which is false, so it prints the same
// and calls the function recursively with N-1, which is 1
// then the function checks if N == 0, which is false, so it prints the same
// and calls the function recursively with N-1, which is 0
// then the function checks if N == 0, which is true, so it returns...

// o/p => GFG GFG GFG