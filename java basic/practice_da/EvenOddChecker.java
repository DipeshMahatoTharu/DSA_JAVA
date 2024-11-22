import java.util.Scanner;

class oddOrEven{

    // void for no return value 
    public void oddorEven(int num){

        if( num % 2== 0 ){
            System.out.println("The Number is even ");

        }else 
        {
            System.out.println("The number is odd");
        }
    

    }
}


public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int Num=sc.nextInt();
       

        oddOrEven check=new oddOrEven();
        check.oddorEven(Num);
        sc.close();
        
    }
}
