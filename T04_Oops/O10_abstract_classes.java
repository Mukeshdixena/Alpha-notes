package T04_Oops;

public class O10_abstract_classes {
    public static void main(String[] args) {
<<<<<<< HEAD
        // Animal10 an = new Animal10(); // we can not creat an instace of any abstract class
=======
        // Animal_class an = new Animal_class(); // we can not creat an instace of any abstract class
>>>>>>> d93b1d9096354e37d5367d92966e1cc517847122
        Horse h = new Horse();
        h.eat();
        h.walk();
    }
}

<<<<<<< HEAD
abstract class Animal10 {
=======
abstract class Animal_class {
>>>>>>> d93b1d9096354e37d5367d92966e1cc517847122
    void eat() {
        System.out.println("eat somthing");
    }

    abstract void walk();
}

<<<<<<< HEAD
class Horse extends Animal10 {
=======
class Horse extends Animal_class {
>>>>>>> d93b1d9096354e37d5367d92966e1cc517847122

    void walk() {
        System.out.println("walk in two lags");
    }
}

<<<<<<< HEAD
class Chicken extends Animal10 {
=======
class Chicken extends Animal_class {
>>>>>>> d93b1d9096354e37d5367d92966e1cc517847122
    void walk() {
        System.out.println("walk in two lags");
    }

}