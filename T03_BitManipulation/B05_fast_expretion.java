package T03_BitManipulation;

public class B05_fast_expretion {

    public static int power(int a, int n) {
        int ans = 1;

        while (n != 0) {
            if ((n & 1) == 1) {
                ans *= a;
            }

            a = a * a;
            n = n >> 1;
        }
        return ans;
    }

    public static int power_modulo(int a, int n, int p){
        int res = 1;
        a = a % p;
        if(a == 0){
            return a;
        }
        while (n > 0) {
            if((a&1) == 1){
                res = (res * a) % p;
            }
            a = a * a;
            n = n >> 1;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(power(3, 2));
    }
}
