// Jonathan Klein
// 2/4/20
// BankMain.java

public class BankMain {
    public static void main(String[] args) {
        Student s1 = new Student("Kenneth", 4.0, "English");
        Student s2 = new Student("Nicko", 4.0, "Math (Pre Unit 6)");
        Student s3 = new Student("Jason", 1.0, "Chinese");
        Student s4 = new Student("Chase", 4.0, "Foods");

        s1.displayBalance();
        s2.displayBalance();
        s3.displayBalance();
        s4.displayBalance();
        s1.displayAccountNum();
        s2.displayAccountNum();
        s3.displayAccountNum();
        s4.displayAccountNum();

        s1.deposit(100);
        s2.deposit(500);
        s3.deposit(1001);
        s4.deposit(-300);

        s1.displayBalance();
        s2.displayBalance();
        s3.displayBalance();
        s4.displayBalance();

        s1.withdraw(75);
        s2.withdraw(200);
        s3.withdraw(-50);
        s4.withdraw(100);


    }
}
