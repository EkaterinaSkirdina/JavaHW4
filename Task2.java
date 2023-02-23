package SeminarsHW.HW4;

import java.util.ArrayDeque;
import java.util.Deque;

public class Task2 {
    public static void main(String[] args) {
        String s = "({[]})}";
        System.out.println(isStringValid(s));
    }

    public static boolean isStringValid(String str) {
        if (str.length() % 2 != 0) {
            return false;
        }
        Deque<Character> array = new ArrayDeque<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{') {
                array.push(str.charAt(i));
            } else {
                if (str.isEmpty()) {
                    return false;
                }
                if (str.charAt(i) == ')' && array.pop() != '(') {
                    return false;
                }
                if (str.charAt(i) == ']' && array.pop() != '[') {
                    return false;
                }
                if (str.charAt(i) == '}' && array.pop() != '{') {
                    return false;
                }
            }

        }
        return array.isEmpty();
    }
}
