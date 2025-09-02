// Question : Largest Odd Number in a String


class Solution {
    public String largestOddNumber(String num) {
        for(int i = num.length() - 1; i>= 0; i--) {
            if(Character.getNumericValue(num.charAt(i)) % 2 == 1) { // getNumericValue-> It is used to convert a character to its integer value
                return num.substring(0, i+1);  // substring(start, end) -> It is used to extract a part of the string from start index to end-1 index , in this case we want to include the character at index 'i' so we use i+1 as end index
            }
        }
        return ""; // if there is no odd number in the string then return empty string
    }
}

// i/p -> "35427"
// o/p -> "35427"

// i/p -> "52"
// o/p -> "5"

// T/C: O(n) , S/C: O(1)
