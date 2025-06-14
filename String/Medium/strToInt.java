class Solution {
    public int myAtoi(String s) {
        if(s.length() == 0 || s == null) return 0;
        s = s.trim();
        if(s.length() == 0) return 0;
        int index = 0, sign = 1;
        long sum = 0;
        if(s.charAt(index)== '-'){
            sign = -1;
            index++;
        }
        else if(s.charAt(index) == '+'){
            index++;
        }
        while(index < s.length() && Character.isDigit(s.charAt(index))){
            sum = sum * 10 + (s.charAt(index)-'0');
            if(sign == 1 && sum > Integer.MAX_VALUE) {
                 return Integer.MAX_VALUE;
            }
            else if(sign == -1 && -sum<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            index++;
        }
        return (int) (sign*sum);
    }
}

// T/C : O(n) , S/C : O(1)