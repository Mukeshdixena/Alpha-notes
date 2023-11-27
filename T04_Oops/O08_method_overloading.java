package T04_Oops;

public class O08_method_overloading {
    public static void main(String[] args) {
        Calculator calsi = new Calculator();
        calsi.sum(3, 4);
        calsi.sum(3.3f, 4); // by defult java 3.3 treat as a double
        calsi.sum(3.3f, 4.3f);
        calsi.sum(3, 4, 6);
    }

}

class Calculator {
    void sum(int a, int b) {
        System.out.println(a + b);
    }

    void sum(float a, int b) {
        System.out.println(a + b);
    }

    void sum(float a, float b) {
        System.out.println(a + b);
    }

    void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

}