package org.learnWithM.arraysAndStrings;

public class PangramProblem {

    public static boolean isPangram(String s) {
        int MAX_CHAR = 26;
        boolean[] visited = new boolean[MAX_CHAR];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                visited[c - 'A'] = true;
            }
            if (c >= 'a' && c <= 'z') {
                visited[c - 'a'] = true;
            }

        }

        for (int j = 0; j < MAX_CHAR; j++) {
            if (!visited[j]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";
        System.out.println(isPangram(s));
    }
}
