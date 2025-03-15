class Solution {

    void mergeSort(int arr[], int l, int r) {
        if(l>=r) return;
        
        int mid=(l+r)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        merge(arr, l, mid, r);
    }
    
    void merge(int[] arr, int l, int mid, int r){
        ArrayList<Integer> ans = new ArrayList<>();
        int left=l, right=mid+1;
        
        while(left<=mid && right<=r){
            if(arr[left]<=arr[right]){ //left
                ans.add(arr[left]);
                left++;
            }else{
                ans.add(arr[right]); // right
                right++;
            }
        }
            while(left<=mid){ //left
                ans.add(arr[left]);
                left++;
            }
            while(right<=r){ //right
                ans.add(arr[right]);
                right++;
            }
        
        
        for(int i=l; i<=r; i++){
            arr[i]=ans.get(i-l);
        }
    }
}

//T/c : O(nLogn) , S/c : O(n)

// we used devide and conquer approach to solve this problem. we divided the array into teo parts and then merge them in sorted order.
// we used merge function to merge the two sorted arrays.
// firstly we created a new arrayList to store the sorted array.
// then we used two pointers left and right to iterate over the two arrays.
// we compared the element at left and right pointer and added the smaller element to the ans array.
// then we added the remaining element of the array to the ans array.
// then we copied the elements of the array to the original array.
// then we repeated the process for all the subarrays.
// finally we got the sorted array.

// example: arr=[3,2,1,5,4]
// after first devide: [3,2,1] [5,4]
// after second devide: [3] [2,1] [5] [4]
// after merging: [2,1,3] [4,5]
// after second merging: [1,2,3,4,5]



// we can also use iterative approach to solve thi problem. we can use a stack to store the subarrays and then merge them in sorted order.