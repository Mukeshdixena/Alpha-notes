package T04_Oops;

public class O05_copy_constuctors {
    public static void main(String[] args) {
        int marks[] =  {100, 100, 100};
        Student_02 s1 = new Student_02("Mukesh", 123, "pass",marks);
        s1.print();

    }
}

class Student_02 {
    String name;
    int roll;
    String pass;
    int marks[];

    Student_02(Student_02 s2) {
        this.name = s2.name;
        this.roll = s2.roll;
        this.marks = s2.marks;
    }

    Student_02(String name, int roll, String pass, int marks[]) {
        this.name = name;
        this.roll = roll;
        this.pass = pass;
        this.marks = marks;
    }

    void print(){
        System.out.println(this.name);
        System.out.println(this.roll);
        System.out.println(this.pass);
        System.out.println(this.marks[0]);
        System.out.println(this.marks[1]);
        System.out.println(this.marks[2]);
    }

}