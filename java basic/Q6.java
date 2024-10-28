// Write a Java program that takes a number as input and prints its multiplication table up to 10.
// Test Data:
// Input a number: 8
// Expected Output :
// 8 x 1 = 8
// 8 x 2 = 16
// 8 x 3 = 24
// ...
// 8 x 10 = 80

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        int number;
        System.out.print("Enter the multiplication Number : ");
        Scanner sc = new Scanner (System.in);
        number=sc.nextInt();

        for(int i=1 ; i<=10 ; i++){
            System.out.println((number + " X "+ i + " = " +(number*i)));
        }

    }
    
}
