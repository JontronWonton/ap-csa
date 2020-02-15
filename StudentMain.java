public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student("Kenneth", 4);
        Student s2 = new Student("Nicko", 4);
        Student s3 = new Student("Jason", 1);

        System.out.println(s1);
        System.out.println(s2.getName());
        s2.setGPA(3);
        s3.sayHello(s1);

    }
}
