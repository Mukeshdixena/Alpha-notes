package T04_Oops;

public class O14_super_keyword {
    public static void main(String[] args) {
        Horse_2 h = new Horse_2();
        h.getColour();

    }
}

class Animal_2 {
    String colour;

    Animal_2() {
        System.out.println("animal constructor");
    }
    void getColour(){

        System.out.println(colour);
    }

}

class Horse_2 extends Animal_2 {

    Horse_2() {
        super.colour = "red";
        System.out.println("horse constructor");
    }

}