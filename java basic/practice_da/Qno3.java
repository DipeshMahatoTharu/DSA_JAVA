//Create a class named Car with attributes model and year. 
//Write a program to create two objects of this class with different attribute values and print them.

class Car{
    String model;
    int year;
}
public class Qno3 {
    public static void main(String[] args) {
    Car car =new Car();
    car.model="Volvo ";
    car.year=1998;

    Car car2 =new Car();
    car2.model="Subaru ";
    car2.year=2003;


    System.out.println("Object 1 output is : "+car.model + car.year);
    System.out.println("Object 2 output is : "+car2.model + car2.year);
    }
}
