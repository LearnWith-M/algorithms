package org.learnWithM.leetcode;

import java.util.*;

public class ValidParanthesisProblem {

    public static boolean isValidParanthesis(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        //  Open bracket string
        String openBrackets = "([{";

        //  Respective closed brackets
        Map<String, String> parenthesisMap = new HashMap<>();
        parenthesisMap.put("(", ")");
        parenthesisMap.put("{", "}");
        parenthesisMap.put("[", "]");

        Stack<String> paraStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (openBrackets.contains(String.valueOf(s.charAt(i)))) {
                paraStack.push(String.valueOf(s.charAt(i)));
            } else {
                if (!paraStack.isEmpty()) {
                    String popStr = paraStack.pop();
                    if (!Objects.equals(parenthesisMap.get(popStr), String.valueOf(s.charAt(i)))) {
                        return false;
                    }
                }
                else{
                    return false;
                }

            }
        }

        return paraStack.isEmpty();
    }

    public static void main(String[] args) {
        //   ([)] must return false
        String paranthasis = "([)]";
        System.out.println(isValidParanthesis(paranthasis));

    }
}