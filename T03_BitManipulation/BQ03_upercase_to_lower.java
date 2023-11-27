package T03_BitManipulation;

// import java.util.Scanner;

public class BQ03_upercase_to_lower {

    public static char tolower(char c) {
        char res = (char) (c | ' ');
        return (char) res;
    }
    public static char toUpper(char c) {
        char res = (char) (c & ' ');
        return (char) res;
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        System.out.println(toUpper('A'));
        // System.out.println((int) 'a');

        // sc.close();
    }
}
