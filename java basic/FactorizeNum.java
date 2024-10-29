//  Write a Program to Find Factorial of a Number in Java.
import java.util.Scanner;
public class FactorizeNum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number you want to factorial:");
        int num1=sc.nextInt();
        int Factorial=1;
        
// num= 5 ; 5*4*3*2*1
        for(int i=1 ; i <=num1; i++){
            Factorial=Factorial*i;

        }
        System.out.println("Print the Final output : "+Factorial);
        sc.close();
    
    } 
   
}
