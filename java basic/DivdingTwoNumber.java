// Write a Java program to divide two numbers using a class and a method


import java.util.Scanner;

class Calculator{
        public float divide(float a, float b){
             float output =b/a;
             return output;


        }
}


public class DivdingTwoNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter first Number :");
        float Num1 =sc.nextFloat();
        System.out.println("Enter the Second Number :");
        float Num2=sc.nextFloat();

        Calculator divideTwoNumber= new Calculator();
        System.out.println("THe Division of 2 Number are :"+divideTwoNumber.divide(Num1,Num2) );

        sc.close();

    }
}
