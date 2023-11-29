package T07_Backtraking;

public class B03_FindPermutation {
    public static void main(String[] args) {
        solve("abc", "");
    }

    public static void solve(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
        
            // "abcde" remove c = "ab" + "de" = "abde"
            String newStr = str.substring(0, i) + str.substring(i + 1);
            solve(newStr, ans + ch);
        }
    }
}
