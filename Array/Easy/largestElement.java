class Solution {
    public static int largest(int[] arr) {
      int n = arr.length;
      int max = arr[0];
      int cnt = 0;
        for(int i = 0; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
                cnt++;
            }
        }
        return max;
    }
}

// T/C: O(n) S/C: O(1)

// we firstly declare a variable max and assign the first element of the array as it.
// then we iterate through the array and check if the current element is greater than the max element then we update the max element and increment the count.
// finally , we return the max element.
// this is most optimal solution with O(n) time complexity and O(1) space complexity.

// we can also solve this problem using sorting but it was not optimal as it will take O(nlogn) time complexity.

// example:
// arr = [1,2,3,4,5]
// max = arr[0] = 1
// iterate through the array
// 1 < 2 => max = 2
// 2 < 3 => max = 3
// 3 < 4 => max = 4
// 4 < 5 => max = 5
// return 5

// o/p: 5
