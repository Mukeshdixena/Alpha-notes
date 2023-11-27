package T04_Oops;

public class O07_inheritance {

    public static void main(String[] args) {

        Animal Hourse = new Animal();
        Hourse.colour = "grean";
        Hourse.eat();
        Hourse.breathe();

        Fish sarkFish = new Fish();
        sarkFish.colour = "blue";
        sarkFish.eat();
        sarkFish.breathe();
        sarkFish.fins = 6;
        sarkFish.swin();
    }

}

// Base class
class Animal {
    String colour;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

// Derived Class

class Fish extends Animal {
    int fins;

    void swin() {
        System.out.println("swins in water");
    }
}
