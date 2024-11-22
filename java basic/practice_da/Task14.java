class Student {
    private String name;
    private int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Overriding the toString() method
    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}

public class Task14 {
    public static void main(String[] args) {
        Student student = new Student("Dipesh", 20);
        System.out.println(student.toString()); 
    }
}
