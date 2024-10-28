// In this problem we will learn how to read inputs.
// You are given five inputs: a(integer), b(float ), c(long), d(byte), and s(string) respectively. 
// You need to use the scanner class object and then take all the input and print each in a new line.
// Note: Consider using sc.nextLine( ) after byte input to handle any issues with input reading.


import java.util.Scanner;
public class Qno2 {
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        // five inputs: a(integer), b(float ), c(long), d(byte), and s(string)

       System.out.println("Enter your integer");
        int a=scanner.nextInt();

       System.out.println("Enter your float");
       float b=scanner.nextFloat();
       
//  long doesnt not take point value but double does

       System.out.println("Enter your long");
       long c=scanner.nextLong();
       
       System.out.println("Enter your byte");
       byte d=scanner.nextByte();

       System.out.println("Enter your string");
       String e=scanner.nextLine();

       System.out.println("Your integer is :"+ a);
       System.out.println("Your float is :" + b);
       System.out.println("Your long is :" + c);
       System.out.println("Your byte is :" + d);
       System.out.println("Your string is :" + e);
       
       




// how to close scanner ??????
        scanner.close();
    }
    

}
