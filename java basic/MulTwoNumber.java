import java.util.Scanner;


class Multiply{

public  int multiple(int A, int B){
        return A*B;
    }
}

public class MulTwoNumber{  
    public static void main(String[] args) {
        //  Creating the object 
        Multiply mul=new Multiply();
       
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the First mult number :");
            int num1=sc.nextInt();
        System.out.println("Enter the Second mult number :");
            int num2=sc.nextInt();


            int result=mul.multiple(num1,num2);

        System.out.println("The multiplicaiton of first and second number is : "+ result);

        sc.close();





        
    }
}