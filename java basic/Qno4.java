// Here, we will learn how to take input from a string that comprises of multiple words. Also, we will learn to clear the input buffer.
//  Your task is to take input of strings and integers and produce the output. We must be clear with next() and nextLine()
import java.util.Scanner;
public class Qno4 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Input the integer :");
        int a=sc.nextInt();

        // buffer
        sc.nextLine();
        
        System.out.print("Input the string :");
        String b=sc.nextLine();

        System.out.println("Your integer is :" + a + " and your string is :" + b);





        sc.close();

    }
    
}
