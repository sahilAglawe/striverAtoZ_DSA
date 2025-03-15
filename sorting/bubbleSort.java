class Solution
 {
    
	public static void bubbleSort(int arr[], int n)
    {
        
        if(n ==1){
            return;
        }
        for(int i = 0; i<n-1; i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        bubbleSort(arr,n-1);
    }
}

// Tc: O(n^2) , Sc: O(1)

// firstly, we are checking if n==1, then return as we dont need to sort the array if there is only one element.
// then we are running a loop from 0 to n-1 and checking if the current element is greater than the next element, 
// if yes then we are swapping the elements.
// then we are calling the function recursively with n-1 as the size of the array will be reduced by 1 after each iteration.
// this will continue until the array is sorted.
// finally, the array will be sorted in ascending order.

// Dry run:
// arr[] = {5,4,3,2,1}
// n=5
// i = 0
// arr[] = {4,5,3,2,1} , 
// i = 1
// arr[] = {4,3,5,2,1} ,
// i = 2
// arr[] = {4,3,2,5,1} ,
// i = 3
// arr[] = {4,3,2,1,5} ,
// and lastly , the last element will be placed at its correct position.
// and lastly , the array will be sorted in ascending order.

// arr[] = {1,2,3,4,5}

