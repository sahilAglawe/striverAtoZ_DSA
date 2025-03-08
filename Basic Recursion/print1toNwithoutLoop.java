class Solution {
    int i = 0;
public void printNos(int n) {
if ( n == i ) {
      return;
  } else {
      i++;
      System.out.print(i +" ");
      printNos(n);
  }
}
}


// Tc -> O(n) , Sc -> O(n)

// we are print a number from 1 to n without using a loop.
// we are using recursion to print the numbers.
// firstly we will check if the number is equal  to i or not
// if it is equal then we will return
// else we will increment the value of i and print the value of i and call the function again with the updated value of i.
// we will keep on calling the function until the value of i is equal to n.
// then we will return the function.

// n = 5
// i = 0
// so , n != i so, increment i and print i and call the function again with the updated value of i.
// i++ => i = 1
// print(1)
// i = 1 , n != i 
// i++ => i = 2, print(2)
// i = 2 , n != i
//i++ => i = 3, print(3)
// i = 3 , n != i
// i++ => i=4, print(4)
// i = 4, n!= i 
// i++ => i = 5, print(5)
// i = 5, n == i so, return

// o/p -> 1 2 3 4 5
