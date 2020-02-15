// Jonathan Klein
// 1/31/20
// CarMain.java

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car(2004, "Honda", "CRV");
        Car car2 = new Car(2013, "Honda", "Civic");
        Car car3 = new Car(2019, "KIA", "Forte");
        System.out.println(car1);
        System.out.println(car2.getMake());
        System.out.println(car3.getModel());
        car1.drive(10);
        car2.drive(15);
        car3.drive(-10);

        Student s1 = new Student("Kenneth");
        Student s2 = new Student("Dennis");
        Student s3 = new Student("Nicko");
        s1.drive(car1, 10);
        s2.drive(car2, 200);
        s3.drive(car3, 500);



    }
}
