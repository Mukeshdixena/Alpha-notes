package T04_Oops;

public class O12_multiple_inheritance {
    public static void main(String[] args) {

    }
}

interface Herbivore {
    void eat_vege();
}

interface carnivore {
    void eat_non_vege();
}

class Bear implements Herbivore, carnivore {
    public void eat_vege() {
        System.out.println("eat_vege");
    }

    public void eat_non_vege() {
        System.out.println("eat_non_vege");
    }

}