package src.practice.recursion;

import java.util.*;

public class GenerateParentheses {

    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate("", n, n, result);
        return result;
    }

    private static void generate(String current, int openLeft, int closeLeft, List<String> result) {
        // Base case: no parentheses left
        if (openLeft == 0 && closeLeft == 0) {
            result.add(current);
            return;
        }

        // Add '(' if there are any left
        if (openLeft > 0) {
            generate(current + "(", openLeft - 1, closeLeft, result);
        }

        // Add ')' if it won't make the string invalid
        if (closeLeft > openLeft) {
            generate(current + ")", openLeft, closeLeft - 1, result);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        List<String> combinations = generateParenthesis(n);
        System.out.println(combinations);
    }
}
