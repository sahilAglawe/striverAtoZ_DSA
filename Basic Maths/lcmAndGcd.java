class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        int lcm;
        int gcd =1;
        
        for(int i=1; i<=Math.min(a,b); i++){
            if(a % i == 0 && b % i == 0 ){
                gcd = i;
            }
        }
        lcm = ( a * b)/ gcd; // lcm formula = (a*b)/gcd
        
        return new int[]{lcm,gcd};
    }
};

// gcd - greatest common divisor
// lcm - least common multiple
// firstly we will find the gcd of the two numbers
// we will iterate from 1 to min(a,b) and check if both a & b are divisible by i or not
// if they are divisible then we will store the value if i in gcd
// then we will find the lcm of the two numbers using the formula lcm = (a*b)/gcd
// then we will return the lcm and gcd in an array.
// Tc: O(min(a,b)) , Sc: O(1)


// a = 5, b = 10 so, the 5 is min number so we will iterate from 1 to 5 
// gcd = 1
// 5 % 1 == 0 && 10 % 1 == 0 => gcd = 1
// 5 % 2 != 0 && 10 % 2 != 0
// 5 % 3 != 0 && 10 % 3 != 0
// 5 % 4 != 0 && 10 % 4 != 0
// 5 % 5 == 0 && 10 % 5 == 0 => gcd = 5 so, update gcd = 5

// lcm = (5*10)/5 = 50/5 = 10
// so, the lcm = 10 and gcd = 5

// we return the array {10,5} as lcm and gcd...