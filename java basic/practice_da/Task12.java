// Write a Java program to create a class named Person with attributes name and age, 
// and then create an object of this class to display the attribute values.


class Person {
    String name;
    int age;
}
public class Task12 {

    public static void main(String[] args) {
        Person person=new Person();
        person.name="Dipesh";
        person.age=21;

        System.out.println("His name is "+ person.name + " Age is : " + person.age);

    }
}
