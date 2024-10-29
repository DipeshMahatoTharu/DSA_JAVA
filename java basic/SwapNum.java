//'swap 2 num'

import java.util.Scanner;
public class SwapNum {
    public static void main(String[] args) {
        int temp, num1,num2;
        Scanner sc =new Scanner(System.in);
        
        System.out.print("Enter the First number :");
        num1=sc.nextInt();
        System.out.print("Enter the Second number :");
        num2=sc.nextInt();


        temp=num1;//
        num1=num2;
        num2=temp;
        // how to swap 2 number 

        System.out.println("The swaped number of first number is :" +num1);
        System.out.println("The swaped number of Second number is :" +num2);
        


        





        sc.close();

    }
    
}
