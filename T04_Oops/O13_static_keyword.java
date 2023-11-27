package T04_Oops;

public class O13_static_keyword {
    public static void main(String[] args) {

        Student_04 s = new Student_04();
        s.name = "mukesh";
        // s.school = "shishu mandir"; // only once creat for the class
        Student_04.school = "shishu mandir";
        Student_04 s2 = new Student_04();
        s2.name = "chintu";
        // s2.school = "govrment school"; // only once creat for the class
        Student_04.school = "govrment school";
        // System.out.println(s2.school); // so worning not error
    }

}

class Student_04 {
    String name;
    static String school;

    static void percentage(int phy, int chem, int math) {
        System.out.println((math + phy + chem) / 3);
    }
}
