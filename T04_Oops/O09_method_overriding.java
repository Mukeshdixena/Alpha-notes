package T04_Oops;

public class O09_method_overriding {
    public static void main(String[] args) {
        Deer d1 = new Deer();
        d1.eat(); // grass
    }
}

class Animal_09{
    void eat(){
        System.out.println("anything");
    }
}

class Deer extends Animal_09 {
    void eat(){
        System.out.println("grass");
    }
}