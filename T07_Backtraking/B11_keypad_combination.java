package T07_Backtraking;

public class B11_keypad_combination {
    public static void main(String[] args) {
        keypad_combination("23");
    }

    final static char[][] L = { {}, {}, { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 'i' }, { 'j', 'k', 'l' },
            { 'm', 'n', 'o' }, { 'p', 'q', 'r', 's' }, { 't', 'u', 'v' }, { 'w', 'x', 'y', 'z' } };

    static void keypad_combination(String str) {
        int len = str.length();
        if (len == 0) {
            System.out.println("");
        }

        bfs(0, len, new StringBuilder(), str);
    }

    static void bfs(int pos, int len, StringBuilder sb, String str) {
        if (pos == len) {
            System.out.println(sb);
        } else {
            char dig = str.charAt(pos);
            int idx = Character.getNumericValue(dig);
            char[] letter = L[idx];

            for (int i = 0; i < letter.length; i++) {
                bfs(pos + 1, len, sb.append(letter[i]), str);
            }
        }
    }
}
