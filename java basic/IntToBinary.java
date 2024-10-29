// Convert the integer to binary  

import java.util.Scanner;
public class IntToBinary {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the integer to convert to bianry:");
        int Num=sc.nextInt();

       String BinaryNUm=Integer.toBinaryString(Num);
        System.out.println("Binary form :"+BinaryNUm);

        


        sc.close();
        



    }
}
