
// Subtraction of Two number: Write a program to subtract two numbers using a class and a method.
import java.util.Scanner;

class Subtraction{
   public int Sub(int a ,int b){
    return a-b;

    }
}
public class SubtractionTwoNumber {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first Number:");
        int Num1=sc.nextInt();
        System.out.println("Enter the first Number:");
        int Num2=sc.nextInt();

        Subtraction Subtraction =new Subtraction();
        int output=Subtraction.Sub(Num1,Num2);
        System.out.println("The Two Subtractions are :" +output);
        



        sc.close();       
    }
}