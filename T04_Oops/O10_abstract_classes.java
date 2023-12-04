package T04_Oops;

public class O10_abstract_classes {
    public static void main(String[] args) {
        // Animal_class an = new Animal_class(); // we can not creat an instace of any abstract class
        Horse h = new Horse();
        h.eat();
        h.walk();
    }
}

abstract class Animal_class {
    void eat() {
        System.out.println("eat somthing");
    }

    abstract void walk();
}

class Horse extends Animal_class {

    void walk() {
        System.out.println("walk in two lags");
    }
}

class Chicken extends Animal_class {
    void walk() {
        System.out.println("walk in two lags");
    }

}