// Question : Reverse Words in a string

class Solution {
    public String reverseWords(String s) {
        String[] words = s.split("\\s+");   // \\s+ is a regular expression that are used for the removving the extra spaces
        StringBuilder res = new StringBuilder();

        for(int i = words.length-1; i>=0; i--){
            res.append(words[i]);
            if(i != 0) {
                res.append(" ");
            }
        }

        return res.toString().trim(); // trim() is used to remove the leading and trailing spaces ex. "   hello   " -> "hello"
    }
}


// i/p -> "The sky is blue"
// o/p -> "blue is sky The"


// T/C: O(n) , S/C: O(1)