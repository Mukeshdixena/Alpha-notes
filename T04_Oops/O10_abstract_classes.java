package T04_Oops;

public class O10_abstract_classes {
    public static void main(String[] args) {
<<<<<<< HEAD
        // Animal10 an = new Animal10(); // we can not creat an instace of any abstract class
=======
        // Animal_class an = new Animal_class(); // we can not creat an instace of any abstract class
>>>>>>> d2f8c5f5f9d3a286e238c104e7610c72b5819f62
        Horse h = new Horse();
        h.eat();
        h.walk();
    }
}

<<<<<<< HEAD
abstract class Animal10 {
=======
abstract class Animal_class {
>>>>>>> d2f8c5f5f9d3a286e238c104e7610c72b5819f62
    void eat() {
        System.out.println("eat somthing");
    }

    abstract void walk();
}

<<<<<<< HEAD
class Horse extends Animal10 {
=======
class Horse extends Animal_class {
>>>>>>> d2f8c5f5f9d3a286e238c104e7610c72b5819f62

    void walk() {
        System.out.println("walk in two lags");
    }
}

<<<<<<< HEAD
class Chicken extends Animal10 {
=======
class Chicken extends Animal_class {
>>>>>>> d2f8c5f5f9d3a286e238c104e7610c72b5819f62
    void walk() {
        System.out.println("walk in two lags");
    }

}