package T02_String;

import java.util.Arrays;

public class SQ_all_assigment {
    public static int count_vovel(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public static boolean isAnagram(String str1, String str2) { // time O(26) ~ O(1) space O(26*2*int) ~ O(1)

        int frq1[] = new int[26];
        int frq2[] = new int[26];
        for (int i = 0; i < 26; i++) {
            int idx1 = str1.charAt(i) - 'a';
            int idx2 = str2.charAt(i) - 'a';
            frq1[idx1]++;
            frq2[idx2]++;
        }

        for (int i = 0; i < 26; i++) {
            if (frq1[i] != frq2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAnagram2(String str1, String str2) { // Time O(nlon(n)), space O(n)

        if (str1.length() != str2.length()) {
            return false;
        }

        str1 = str1.toLowerCase(); // O(n)
        str2 = str2.toLowerCase(); // O(n)

        char[] charArr1 = str1.toCharArray(); // O(n)
        char[] charArr2 = str2.toCharArray(); // O(n)

        Arrays.sort(charArr1); // O(nlon(n))
        Arrays.sort(charArr2); // O(nlon(n))

        return charArr1.equals(charArr2); // O(n)
    }

    public static void main(String[] args) {
        String str = "Apnacollege".replace("l", "");
        System.out.println(str);

    }
}
