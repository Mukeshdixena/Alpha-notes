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
>>>>>>> d2f8c5f5f9d3a286e238c104e7610c72b5819f62
    void eat(){
        System.out.println("anything");
    }
}

<<<<<<< HEAD
class Deer extends Animal09 {
=======
class Deer extends Animal_09 {
>>>>>>> d2f8c5f5f9d3a286e238c104e7610c72b5819f62
    void eat(){
        System.out.println("grass");
    }
}