package T04_Oops;

public class O09_method_overriding {
    public static void main(String[] args) {
        Deer d1 = new Deer();
        d1.eat(); // grass
    }
}

<<<<<<< HEAD
class Animal09{
=======
class Animal_09{
>>>>>>> d93b1d9096354e37d5367d92966e1cc517847122
    void eat(){
        System.out.println("anything");
    }
}

<<<<<<< HEAD
class Deer extends Animal09 {
=======
class Deer extends Animal_09 {
>>>>>>> d93b1d9096354e37d5367d92966e1cc517847122
    void eat(){
        System.out.println("grass");
    }
}