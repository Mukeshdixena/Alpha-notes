package T03_BitManipulation;

class BOperators {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        
        // Binary AND
        System.out.println(a&b);

        // Binary OR
        System.out.println(a|b);
        
        // Binary XOR
        System.out.println(a^b);
        
        // Binary ~ once complement
        System.out.println(~b);


        for (int i = 0; i < 1000; i++) {
            System.out.println(i + " " + (~i));
        }
    }

}
