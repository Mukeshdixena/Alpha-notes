package T04_Oops;

public class O10_abstract_classes {
    public static void main(String[] args) {
        // Animal an = new Animal(); // we can not creat an instace of any abstract class
        Horse h = new Horse();
        h.eat();
        h.walk();
    }
}

abstract class Animal {
    void eat() {
        System.out.println("eat somthing");
    }

    abstract void walk();
}

class Horse extends Animal {

    void walk() {
        System.out.println("walk in two lags");
    }
}

class Chicken extends Animal {
    void walk() {
        System.out.println("walk in two lags");
    }

}