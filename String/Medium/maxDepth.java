// Quesstion : Maximum depth of nested parenthesis

class Solution {
    public int maxDepth(String s) {
        int count = 0;
        int maxNum = 0;
        for(char c : s.toCharArray()) {
            if(c == '(') {
                count++;
                if(maxNum < count)
                maxNum = count;
            }else if(c == ')') {
                count--;
            }
        }
        return maxNum;
    }
}

// T/C : O(n) , S/C : O(1)