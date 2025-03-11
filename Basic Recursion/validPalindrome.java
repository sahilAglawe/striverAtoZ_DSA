class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
        	return true;
        }
        int start = 0;
        int last = s.length() - 1;
        while(start <= last) {
        	char currFirst = s.charAt(start);
        	char currLast = s.charAt(last);
        	if (!Character.isLetterOrDigit(currFirst )) { // this will check if the character is not a letter or digit.
        		start++;
        	} else if(!Character.isLetterOrDigit(currLast)) { // this will check if the character is not a letter or digit.
        		last--;
        	} else {
        		if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) { // this will check if the lowercase of the character at the start pointer is not equal to the lowercase of the character at last pointer.
        			return false;
        		}
        		start++;
        		last--;
        	}
        }
        return true;
    }
}

// Tc: O(n) , Sc: O(1)

// firstly we will check if the string is empty or not. if the string is empty then we will return the true.
// then we will define two pointers start and last. start will point to the first character of the string and last will point to the last character of the string.
// then we will iterate until start is less than or equal to last.
// we will check if the character at the start pointer is not a letter or digit then we will increment the start pointer.
// we will check if the character at the last pointer is not a letter or digit then we will decrement the last pointer.
// if the character at the start pointer is a letter or digit and the character at the last pointer is a letter or digit then,,
// we will check if the lowercase of the character at the start pointer is not equal to the lowercase of the character at last pointer then we will return false.
// otherwise, we will increment the start pointer and decrement the last pointer.
// finally, we will return true.

//Dry Run : 
 
// string = "MADAM"
// start = M , last = M
// start <= last , M == M , start++, last--
// start = A , last = A
// start <= last , A == A , start++, last--
// start = D , Last = D
// start <= last , D == D , 
// start <= last return true

// o/p -> true
