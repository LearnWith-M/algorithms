package org.learnWithM.arraysAndStrings;

public class CamelcaseConversionProblem {

    public static void convertToCamelcase(String s){
        int n = s.length();
        StringBuilder res = new StringBuilder();
        boolean capitalizeNext = false;

        for(int i=0; i< n ; i++){
            if(s.charAt(i) == ' '){
                capitalizeNext = true;
            }
            else if(capitalizeNext){
                res.append(Character.toUpperCase(s.charAt(i)));
                capitalizeNext = false;
            }
            else {
                res.append(s.charAt(i));
            }
        }

        System.out.println(res);
    }
    public static void main(String[] args) {
        String s = "i got intern at geeksforgeeks";
        convertToCamelcase(s);
    }
}
