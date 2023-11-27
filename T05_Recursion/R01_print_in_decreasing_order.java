package T05_Recursion;

import java.util.Scanner;

public class R01_print_in_decreasing_order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDec(n);
        sc.close();
    }

    public static void printDec(int n) {

        if (n <= 0) {
            System.out.println();
            return;
        }

        System.out.print(n + " ");

        printDec(n - 1);
    }
}
