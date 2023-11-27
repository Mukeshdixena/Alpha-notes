package T03_BitManipulation;

import java.util.Scanner;

public class B03_check_even_or_odd {
    
    public static boolean isEven(int n){
        return (n&1) == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // isEvenOrOdd(n);
        // System.out.println(isEven(n));
        if(isEven(n)){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

        sc.close();
    }
}
