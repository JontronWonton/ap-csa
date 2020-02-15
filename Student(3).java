// Jonathan Klein
// 1/29/20
// Student.java

public class Student {

    private String name;
    private double GPA;
    private String favClass;
    private int studentID;

    private static int studentPopulation = 0;

    public Student(String n, double gpa){
        studentPopulation++;
        studentID = studentPopulation;
        name = n;
        GPA = gpa;
    }

    public Student(String n, double gpa, String fClass){
        studentPopulation++;
        studentID = studentPopulation;
        name = n;
        GPA = gpa;
        favClass = fClass;
    }

    public Student(){
        studentPopulation++;
        studentID = studentPopulation;
    }
    public Student(String n){
        studentPopulation++;
        studentID = studentPopulation;
        name = n;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }

    public double getGPA(){
        return GPA;
    }

    public void setGPA(double gpa){
        GPA = gpa;
    }

    public void sayHello(Student p){
        if(p.equals(this)){
            System.out.println("You can't say hello to yourself!");
        } else {
            System.out.println("Hello, " + p.getName() + "!");
        }
    }

    public String getFavClass() {
        return favClass;
    }

    public void setFavClass(String fClass) {
        favClass = fClass;
    }

    public int getStudentID() {
        return studentID;
    }

    public void drive(Car c, int miles){
        if(miles > 0){
            c.setMiles(c.getMiles() + miles);
            System.out.println(this.name + " is driving " + miles + " miles...");
        } else {
            System.out.println("ERROR: Invalid number of miles");
        }
    }

    @Override
    public String toString() {
        String temp = "ID: " + studentID;
        if (!(name == null)){
            temp += ("\nName: " + name);
        }
        if (!(GPA == 0)){
            temp += ("\nGPA: " + GPA);
        }
        if (!(favClass == null)){
            temp += ("\nFavorite Class: " + favClass);
        }
        return temp;

    }
}
