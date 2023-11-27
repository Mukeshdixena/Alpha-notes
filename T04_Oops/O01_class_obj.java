package T04_Oops;

public class O01_class_obj {
    public static void main(String[] args) {
        beer chintu = new beer();
        chintu.age = 20;
        chintu.name = "Mukesh Dixena";
        chintu.semester = 5;

        Student_ok mukesh = new Student_ok();
        mukesh.name = "Mukesh kumar Dixena";
        mukesh.age = 21;
        mukesh.calc_percentage(100, 90, 100);
        System.out.println(mukesh.percentatge);
        System.out.println("hellow");
    }
}

class beer {
    String name;
    int age;
    int semester;
}

class Student_ok {
    String name;
    int age;
    float percentatge;

    void calc_percentage(int phy, int chem, int math) {
        percentatge = (phy + chem + math) / 3.0f;
    }
}