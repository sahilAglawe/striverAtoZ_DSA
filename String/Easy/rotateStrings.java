// Question : check whether one string is a rotation of another

class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) {
            return false;
        }
        return (s + s).contains(goal);
    }
}


// T/C : O(n) , S/C : O(1)