package T05_Recursion;

public class RQ03_length_of_string {
    public static void main(String[] args) {
        String str = "What is the length ";
        length(str, 0);
        length("123", 0);
    }

    public static void length(String str, int i) {
        if (str == "") {
            System.out.println(i);
            return;
        }

        length(str.substring(1), i + 1);

    }
}
