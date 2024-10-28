// There are times when your answer is a floating point that contains the undesired amount of digits after the decimal. 
// Here, we'll learn how to get a precise answer out of a floating number. You are given two floating numbers a and b. 
// You need to output a/b and decimal precision of a/b up to 3 places after the decimal point.
public class Qno5 {
    public static void main(String[] args) {
        float num1=2009, num2=5 ,output;

        output=num2/num1;
        System.out.printf("The 3 place result is : %.3f",output);

    }
}
