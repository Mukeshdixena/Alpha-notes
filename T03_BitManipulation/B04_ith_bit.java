package T03_BitManipulation;

import java.util.Scanner;

public class B04_ith_bit {

    public static int getbit(int n, int i) {
        // int mask = (1<<i);
        // int temp1 = (n&mask);
        // int temp2 = (temp1>>i);
        // return temp2;

        // if((n&(1<<i)) == 0){
        // return 0;
        // }else{
        // return 1;
        // }
        int mask = (1 << i);
        return (n & mask) >> i;
    }

    public static int setBit(int n, int i) {
        int mask = (1 << i);
        return (n | mask);
    }

    public static int clearBit(int n, int i) {
        int mask = (~(1 << i));
        return (n & mask);
    }

    public static int updateBit(int n, int i, int newBit) {
        // if (newBit == 0) {
        // return clearBit(n, i);
        // } else {
        // return setBit(n, i);
        // }

        n = clearBit(n, i);
        int mask = (newBit << i);
        return n | mask;

    }

    public static int clearLastIBit(int n, int i) {
        // int mask = (~0) << i; // ~0 == 1111111...
        int mask = (-1) << i; // -1 == 1111111...

        return n & mask;

    }

    public static int clearRangOfBits(int n, int l, int r) {
        int a = ((~0) << (l + 1));
        // int b = (1 << r) - 1; // 01000 - 1 = 00111
        int b = ~((~0) << (r - 1));
        int mask = a | b;
        System.out.println(mask);
        return (n & mask);
    }

    public static boolean isPowerOfTwo(int n) {
        // if ((n & (n - 1)) == 0) {
        //     return true;
        // } else {
        //     return false;
        // }
        return (n & (n - 1)) == 0;
    }

    public static int countSetBit(int n) {
        int count = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
    // public static int power(int a, int b){
    // int ans = 1;
    // while(b )
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int i = sc.nextInt();

        // System.out.println(getbit(n, i));
        // System.out.println(setBit(n, i));
        // System.out.println(clearBit(n, i));
        // System.err.println(clearLastBit(15,2));
        // System.err.println(clearRangOfBits(1023, 6, 4));
        System.out.println(countSetBit(n));

        sc.close();
    }
}
