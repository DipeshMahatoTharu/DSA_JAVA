import java.util.Scanner;

class AreaOfCircle{
    public float CalcualteAreaOfCircle(int r){
        // always keep f for floating value 
        float pie =3.14f;
        return r*pie;

    }
}
public class CalculateCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius");
        int radius =sc.nextInt();

        AreaOfCircle Radius=new AreaOfCircle();

        System.out.print("The Area of Circle is : "+ Radius.CalcualteAreaOfCircle(radius));
        sc.close();
    }
}
