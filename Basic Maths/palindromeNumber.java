class Solution {
    public boolean isPalindrome(int x) {
        int revN = 0;
        int dup = x;
        while( x > 0) {
            int ld = x % 10;
            x = x / 10;
            revN = revN * 10 + ld; // formula to reverse the number 
        }
        if(revN == dup){
            return true;
        }else {
            return false;
        }
    }
}



//palindrome number = 121->121 , 1331->1331

//the entire process is same as reverseInteger but we need to store the original
//number in a variable (i.e int dup = x) and then comapre it with the reverse number
//if they are equal then return true else return false
