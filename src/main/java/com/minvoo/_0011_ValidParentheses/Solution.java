package com.minvoo._0011_ValidParentheses;

public class Solution {

    public static boolean validParentheses(String parens) {

        char[] chars = parens.toCharArray();

        int counter = 0;

        for (char c : chars) {
            if (c == '(') {
                counter++;
            } else if (c == ')') {
                counter--;
                if (counter == -1) {
                    return false;
                }
            }
        }
        return counter == 0;
    }
}
