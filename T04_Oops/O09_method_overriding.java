package T04_Oops;

public class O09_method_overriding {
    public static void main(String[] args) {
        Deer d1 = new Deer();
        d1.eat(); // grass
    }
}

class Animal{
    void eat(){
        System.out.println("anything");
    }
}

class Deer extends Animal {
    void eat(){
        System.out.println("grass");
    }
}