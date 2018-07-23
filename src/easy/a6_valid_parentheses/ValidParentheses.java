package easy.a6_valid_parentheses;

import java.util.*;

public class ValidParentheses {

    public boolean isValid(String s) {

        List<Character> arrayList = new ArrayList<>();

        for (char c : s.toCharArray()) {

        }

        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses t = new ValidParentheses();
        System.out.println(t.isValid("(("));
    }
}
