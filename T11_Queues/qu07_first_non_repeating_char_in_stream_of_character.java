package T11_Queues;

import java.util.LinkedList;
import java.util.Queue;

public class qu07_first_non_repeating_char_in_stream_of_character {
    public static void main(String[] args) {
        String str = "aabccxb";
        printNonRepeating(str);
    }

    static void printNonRepeating(String str) {
        int freq[] = new int[26];
        Queue<Character> qu = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch - 'a']++;
            qu.add(ch);

            while (!qu.isEmpty() && freq[qu.peek() - 'a'] > 1) {
                qu.poll();
            }

            if (qu.isEmpty()) {
                System.out.print(-1);
            } else {

                System.out.print(qu.peek());
            }
        }
    }
}
