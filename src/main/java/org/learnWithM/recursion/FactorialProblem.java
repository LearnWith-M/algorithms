package org.learnWithM.recursion;

public class FactorialProblem {

    public static int factorial(int n) {
        int res = 1;
        for (int i = 2; i <= n; i++) {
            res = res * i;
        }
        return res;
    }

    public static int factorialRecurse(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return n * factorialRecurse(n - 1);
    }

    public static void main(String[] args) {
        int input = 5;
        // returns 120
        System.out.println(factorial(input));
        System.out.println(factorialRecurse(input));
    }
}
