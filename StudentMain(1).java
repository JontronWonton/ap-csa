public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student("Kenneth", 4.0);
        Student s2 = new Student("Nicko", 4.0);
        Student s3 = new Student("Jason", 1.7);

        System.out.println(s1);
        line();
        System.out.println(s2.getName());
        line();
        s2.setGPA(1.0);
        s3.sayHello(s1);
        line();

        Student s4 = new Student("Chase", 4.0, "Gym");
        Student s5 = new Student("Luke", 4.0, "English");

        System.out.println(s4);
        line();
        System.out.println(s5.getFavClass());
        System.out.println(s5.getName());
        line();
        s1.setFavClass("PreCalc");
        s2.setFavClass("Physics");
        s3.setFavClass("Chinese");

        Student s6 = new Student();
        s6.setName("Arielle");
        s6.setGPA(4.0);
        s6.setFavClass("Cybersecurity");
        System.out.println(s6);
        line();
        Student s7 = new Student("Andrew");
        System.out.println(s7);
        line();
        s7.setGPA(4.0);
        s7.setFavClass("PreCalc");
        System.out.println(s7);
        line();

        System.out.println(s5.getStudentID());
        System.out.println(s3.getStudentID());

    }

    private static void line(){
        System.out.println("=======================================================");
    }

}
