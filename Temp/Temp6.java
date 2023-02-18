package Temp;

import java.util.ArrayList;
import java.util.Scanner;

public class Temp6 {

    static int factorial(int n) {
        return n * (n - 1);
    }

    static boolean isPrime(int n) {
        boolean ans = true;

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                ans = false;
            }
        }

        return ans;
    }

    static void prime(int n) {
        for (int i = 0; i < n; i++) {

        }
    }

    static ArrayList<Integer> findFactor(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                ans.add(i);
            }
        }
        return ans;
    }

    static ArrayList<Integer> findPrimeFactor(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                ans.add(i);
                n /= i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> ans = findFactor(n);
        System.out.println(ans);

        sc.close();
    }
}
