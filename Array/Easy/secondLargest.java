class Solution {
    public int getSecondLargest(int[] arr) {
        int n = arr.length;
        int max = arr[0];
        int secMax = -1;
        for(int i = 0; i<n; i++){
            if(arr[i] > max){
                secMax = max; // here , we update secMax and max element.
                max = arr[i];
            } else if(arr[i] > secMax && arr[i] < max){ // this condition is for the case when the current element is greater than the element and less than the max element.
                secMax=arr[i];
            }
            }
            return secMax;
        }
        
    }


// T/C: O(N) , S/C: O(1)

// we firstly declare two variables max and secMax and assign the first element of the array as max and -1 as secMax.
// then we iterate through the array and check if the current element is greater than the element ,
// then we update the secMax and max element.
// finally ,  we return the secMax element.

// example: arr = [1,2,3,4,5]
// max = arr[0] = 1
// secMax = -1
// iterate through the array
// 1 < 2 => secMax = 1, max = 2
// 2 < 3 => secMax = 2, max = 3
// 3 < 4 => secMax = 3, max = 4
// 4 < 5 => secmax = 4, max = 5
// else if 5 > 4 && 5 < 5 => if both conditions true then update secMax = 4
// return 4

// o/p: 4