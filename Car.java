// Jonathan Klein
// 1/31/20
// Car.java

public class Car {
    private int year;
    private String make;
    private String model;
    private int miles;
    private int gasMiles;

    public Car(int year, String make, String model){
        this.year = year;
        this.make = make;
        this.model = model;
        miles = 0;
        gasMiles = 300;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMiles() {
        return miles;
    }

    public int getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Year: " + year + "\nMake: " + make + "\nModel: " + model + "\nMileage: " + miles;
    }

//    public void drive(int miles){
//        if(miles > 0){
//            this.miles += miles;
//            System.out.println("Driving " + miles + " miles...");
//        } else {
//            System.out.println("ERROR: Invalid number of miles");
//        }

    public void drive(int miles){
        if(miles > 0 && miles < gasMiles){
            gasMiles -= miles;
            System.out.println("Driving " + miles + " miles...\n");
        } else {
            System.out.println("ERROR: Invalid amount of miles.\nGas miles: " + gasMiles);
        }
    }

    public void gasFillup(){
        gasMiles = 300;
    }

}