// Question : valid Anagram
// Given two strings s and t return true if t is an anagram of s and false otherwise.

class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        return Arrays.equals(sChars , tChars);
    }
}


// T/C: O(nlogn) , S/C: O(1)