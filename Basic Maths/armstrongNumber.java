class Solution {
    public boolean isArmstrong(int n) {
        int dup = n;
        int sum = 0;
        while(n > 0) {
            int ld = n % 10;
            sum = sum + (ld * ld * ld);
            n = n / 10;
        }
        if( sum == dup) {
            return true;
        } else {
            return false;
        }
        }
    }


// armstrong number = 153 = 1^3 + 5^3 + 3^3 = 153
// 153 = 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153

// it is same as palimdrome number but instead of reversing the nummber we need to
// cube the last digit and add it to the sum and then compare it with the original number
// if they are equal then return true else return false


