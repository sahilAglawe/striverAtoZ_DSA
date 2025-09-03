// Question : check whether one string is a rotation of another

class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) {
            return false;
        }
        return (s + s).contains(goal);  // contains() -> It is used to check whether a string contains a specific sequence of characters or not
    }                                   // ( s + s ) -> If we concatenate the string 's' with itself, it will contain all possible rotations of 's'
}


// T/C : O(n) , S/C : O(1)