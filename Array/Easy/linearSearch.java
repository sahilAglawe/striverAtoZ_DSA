class Solution {
    static boolean searchInSorted(int arr[], int k) {
        int n = arr.length;
        for(int i = 0; i<n; i++){
            if(arr[i] == k){
                return true; //if there is no boolean datatype then we return the arr[i]
            } 
        }
        return false;
    }
}


/* input: arr[] = [1, 2, 3, 4, 6], k = 6
   Output: true
   Exlpanation: Since, 6 is present in the array at index 4 (0-based indexing), output is true. */