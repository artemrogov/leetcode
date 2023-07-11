package org.artemrogov.reverse_str;

class Solution {
    public static char[] reverseString(char[] s) {
        int left = 0;
        int end = s.length-1;
        while (left < end) {
            char temp = s[left];
            s[left] = s[end];
            s[end] = temp;
            left ++;
            end --;
        }
        return s;
    }
}
public class ReverseStrMain {
    public static void main(String[] args) {
       String test01 = "hello world";
       char[] result = Solution.reverseString(test01.toCharArray());
       System.out.println(result);
    }
}
