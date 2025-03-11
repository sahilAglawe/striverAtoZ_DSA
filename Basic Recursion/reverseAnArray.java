class Solution {
    public int[] reverseArray(int arr[]) {
       int left = 0;
       int right = arr.length -1;
       while(left < right){
           int temp = arr[left];
           arr[left] = arr[right];
           arr[right] = temp;
           
           left++;
           right--;
       }
       return arr;
    }
    
}

// Tc: O(n) ,Sc: O(1)

// Firstly we will define two pointers left and right. 
// left will point to the first element of the array and right will point to the lat element of the array.
// then we will swap the elements at the left and right pointers 
// and increment the left pointer and decrement the right pointer.
// we will do this until left is less than right.
// finally , we will return the reversed array.

// arr = [1,2,3,4,5]
// left = 0, right = 5
// left < right , swapping 1 and 5
// NGA: [5,2,3,4,1]
// left++ , right--
// left = 1, right = 4
// left < right , swapping 2 and 4
// NGA: [5,4,3,2,1]
// left++ , right--
// left = 2, right = 2
// left == right , return the reversed array.

// o/p -> [5,4,3,2,1]
