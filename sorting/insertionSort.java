class Solution
{
  static void insert(int arr[],int i)
  {
       int j = i;
       while(j > 0 && arr[j - 1] > arr[j]){ // j > 0 is used to check if the previous element is greater than the current element.
           int temp = arr[j -1];  // arr[j-1] is the previous element.
           arr[j - 1] = arr[j]; //arr[j] is the current element.
           arr[j] = temp;
           j--;
       }
  }
  
  public void insertionSort(int arr[], int n)
  {
      for(int i = 0; i <= n-1; i++){
          insert(arr,i);
      }
  }
}


// Tc: O(n^2) , Sc: O(1)

// firstly, we are running a loop from 0 to n-1 and calling the insert function with the current index.
// then we are running a while loop until j>0 and the previous element is greater than than the current element.
// then we are swapping the elements.
// this will continue until the array is sorted.

// Dry run:
// arr[] = {5,4,3,2,1}
// n = 5
// i = 0
// j = 0
// first iteration: arr[] = {4,5,3,2,1} , j=1
// second iteration: arr[] = {3,4,5,2,1} , j=2
// third iteration: arr[] = {2,3,4,5,1} , j=3
// fourth iteration : arr[] = {1,2,3,4,5} , j=4
// and lastly, the array will be sorted in ascending order.
// arr[] = {1,2,3,4,5}