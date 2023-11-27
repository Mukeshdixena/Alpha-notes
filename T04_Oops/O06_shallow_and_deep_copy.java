package T04_Oops;

public class O06_shallow_and_deep_copy {

    public static void main(String[] args) {

        int marks[] = { 0, 1, 2, 3 };
        Student_03 s1 = new Student_03();
        s1.arr = marks;
        Student_03 s2 = new Student_03(s1);

        for (int i = 0; i < s2.arr.length; i++) {
            System.out.println(s2.arr[i]);
        }
    }

}

class Student_03 {
    int arr[];

    // shallow copy constructor

    // Student_03(Student_03 s1) {
    // this.arr = new int[s1.arr.length];
    // this.arr = s1.arr;
    // }

    // deep copy constructor
    Student_03(Student_03 s1) {
        this.arr = new int[s1.arr.length];
        for (int i = 0; i < s1.arr.length; i++) {
            this.arr[i] = s1.arr[i];
        }
    }

    Student_03() {

    }
}