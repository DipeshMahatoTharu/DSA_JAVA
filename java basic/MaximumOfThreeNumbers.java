import java.util.Scanner;


class GreatestNum{
    public int CalculateGreatestNumber(int a, int b, int c){
        int max =a ;
        if (b>a){
            max=b;
        }
        if (c>a){
            max=c;
        }
        return max;

    }
}
public class MaximumOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Three number : ");
        int Num1 =sc.nextInt();
        int Num2 =sc.nextInt();
        int Num3 =sc.nextInt();
        
        GreatestNum Num=new GreatestNum();
        System.out.println("The Greatest number  is : "+Num.CalculateGreatestNumber(Num1, Num2, Num3));
    }
}
