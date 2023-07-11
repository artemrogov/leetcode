package org.artemrogov.validpalindrome;

class Solution {

    static boolean isAlphaNum(char c){
        return (48 <= c && c <= 57) || (65 <= c && c <= 90) || (97 <= c && c <= 122);
    }

    static char lowerCase(char c)
    {
        if(65<=c && c<=90)
            return (char)(c+32);
        else
            return c;
    }

    public static boolean isPalindrome(String s) {
        StringBuilder strBuff = new StringBuilder();
        for(char symbol : s.toCharArray())
        {
            if(isAlphaNum(symbol))
                strBuff.append(lowerCase(symbol));
        }
        String input,reversed;
        input= strBuff.toString();
        reversed= strBuff.reverse().toString();
        return input.equals(reversed);
    }
}
public class AppValidPalindrom {
    public static void main(String[] args) {
        String inputTestStrCase01 = "A man, a plan, a canal: Panama";
        showTestCase(inputTestStrCase01);
        String inputTestStrCase02 = "race a car";
        showTestCase(inputTestStrCase02);
    }

    public static void showTestCase(String str){
        if (Solution.isPalindrome(str)){
            System.out.println(str + " - is a palindrome");
        }else {
            System.out.println(str + " - is not palindrome");
        }
    }
}
