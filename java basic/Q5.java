// 5. Write a Java program that takes two numbers as input and displays the product of two numbers.
// Test Data:
// Input first number: 25
// Input second number: 5
// Expected Output :
// 25 x 5 = 125

import java.util.Scanner;


public class Q5 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        System.out.println("enter  your first number");
        int num1=in.nextInt();

        System.out.println("Enter the second number");
        int num2=in.nextInt();

        int sum=num1+num2 ;
        System.out.println("your addition is :"+ sum);


    }
    
}
