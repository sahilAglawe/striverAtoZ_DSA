class Solution {
    // Function to count the frequency of all elements from 1 to N in the array.
    public List<Integer> frequencyCount(int[] arr) {
        Integer [] hash = new Integer[arr.length];
        
        Arrays.fill(hash, 0);
        
        for(int i = 0; i< arr.length; i++){
            hash[arr[i]-1]++;
        }
        return Arrays.asList(hash);
    }
}

// Arrays.fill -> Basically is used to fill the array with the given value . In general this function is used to reset the array to a default value.
// Arrays.asList -> This function is used to convert the array to a list.
// T/c: O(N) , S/c: O(N)

// firstly , we will create an array of size N and fill it with 0.
// then we will iterate over the array and increment the value at the index arr[i]-1.
// finally we will return the list of the array.

// Dry Run:
// arr[] = [2, 3, 2, 3, 5]
// hash[] = [0, 0, 0, 0, 0]
// we run a loop from 0 to 4, and increment the value at the index arr[i]-1.
// we have 1 occuring 0 times,
// 2 occuring 2 times, 3 occuring 2 times, 4 occuring 0 times, 5 occuring 1 time.
// hash[] = [0, 2, 2, 0, 1]
// finally we return the list of the array.

// o/p: [0, 2, 2, 0, 1]
