class Solution {
    static int evenlyDivides(int n) {
        int count = 0;
        while( n > 0 ) {
           // int lastDigit = n % 10;  when we want to extract last digit. if 7889 = 9
            count = count + 1;
            n = n / 10; // 7889 = 788
        }
        return count;
    }
};



// TC : O(log_10(n)) 