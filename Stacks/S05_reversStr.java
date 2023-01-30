package Stacks;

import java.util.*;

public class S05_reversStr {
    public static void main(String[] args) {
        String str = "Mukesh";
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }
        System.out.println(reversStr(s));
    }

    public static StringBuilder reversStr(Stack<Character> s) {
        StringBuilder ans = new StringBuilder("");

        while (!s.isEmpty()) {
            char ch = s.pop();
            ans.append(ch);
        }
        return ans;
    }
}
