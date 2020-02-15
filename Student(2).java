// Jonathan Klein
// 1/29/20
// Student.java

public class Student {

    private String name;
    private int GPA;
    private String favClass;

    public Student(String n, int gpa){
        name = n;
        GPA = gpa;
    }

    public Student(String n, int gpa, String fClass){
        name = n;
        GPA = gpa;
        favClass = fClass;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }

    public int getGPA(){
        return GPA;
    }

    public void setGPA(int gpa){
        GPA = gpa;
    }

    public void sayHello(Student p){
        System.out.println("Hello, " + p.getName() + "!");
    }

    public String getFavClass() {
        return favClass;
    }

    public void setFavClass(String fClass) {
        favClass = fClass;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nGPA: " + GPA + "\nFav Class: " + favClass;
    }
}
