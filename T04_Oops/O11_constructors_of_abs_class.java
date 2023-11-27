package T04_Oops;

public class O11_constructors_of_abs_class {
    public static void main(String[] args) {

        // Horse h = new Horse();
        masteng m = new masteng();
        m.eat();
        // h.eat();
        // h.walk();
    }

}

abstract class Animal_1 {

    Animal_1() {
        System.out.println("animal constructor");
    }
    void eat(){
      System.out.println("eat somthing");  
    }
}

class Horse_1 extends Animal_1 {

    Horse_1() {
        System.out.println("Horse constructor");
    }

}
class masteng extends Horse_1 {

    masteng() {
        System.out.println("masteng constructor");
    }

}


