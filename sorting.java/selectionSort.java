class Solution {
    void selectionSort(int[] arr) {
        
        int n=arr.length;
        for(int i=0; i<n-1; i++){
            int mini=i;
            for(int j=i+1; j<n; j++){
                if(arr[mini]>arr[j]){
                    mini=j;
                }
            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
    }
}


// TC: O(n^2) SC: O(1)

// firstly , we will find the minimum element in the array and then swap it with the first element of the array.
// then we will find the minimum element in the remaining array and swap it with the second element of the array.
// and so on.
// this is how the selection sort works.

// Dry run:
// arr[] = {64, 25, 12, 22, 11}
// find the  minimum element in the array and swap it with the first element of the array.
// {11 25 12 22 64}
// find the  minimum element in the array and swap it with the second element of the array.
// {11 12 25 22 64}
// find the  minimum element in the array and swap it with the third element of the array.
// {11 12 22 25 64}
// it is sorted now.