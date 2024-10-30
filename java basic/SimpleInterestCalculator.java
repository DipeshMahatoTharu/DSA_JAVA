
import java.util.Scanner;

class Calculate{
    public float SimpleInterest(int p, float t ,int r){
        return (p*t*r)/100;

    }
}



public class SimpleInterestCalculator {
    public static void main(String[] args) {    
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Princple , Rate ,time ");
        int Princple=sc.nextInt();
        int Rate =sc.nextInt();
        float time =sc.nextFloat();

        Calculate calculate =new Calculate();
        System.out.println("The Simple interest is : " +calculate.SimpleInterest(Princple, time, Rate));
        sc.close();

    
}    
}
