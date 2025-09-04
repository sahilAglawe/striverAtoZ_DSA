class Solution {
    public int reverse(int x) {
        int revN = 0;
        while (x != 0) {   // it can written for negative numbers as well
            int lastDigit = x % 10;
             x = x / 10;

              if (revN > Integer.MAX_VALUE / 10 || (revN == Integer.MAX_VALUE / 10 && lastDigit > 7))  // This condition is used to check for overflow .
                return 0; 

                if (revN < Integer.MIN_VALUE / 10 || (revN  == Integer.MIN_VALUE / 10 && lastDigit < -8)) 
                return 0; 
            revN = (revN * 10) + lastDigit;
        }
        return revN;
    }
}


// revN = 0
// x = 7889
// (revN * 10) + lastdigit = 0*10 + 9 = 9
// x = 788
// 9 * 10 + 8 = 98
// x = 78
// 98 * 10 + 8 = 988
// x = 7 
// 988 * 10 + 7 = 9887
// o/p -> 9887