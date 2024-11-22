// Modify the Main class in the example to add another variable y.
//  Create two objects and print the sum of their x and y values.

class Add{
    int x;
    int y;
}
public class Qno2 {
  public static void main(String[] args) {
    Add add1=new Add();
    add1.x=10;
    add1.y=10;

    Add add2=new Add();
    add2.x=11;   
    add2.y=89;   


    int result1=add1.x+add2.x;
    int result2=add1.y+add2.y;


    System.out.println("The reuslt of x  is "+result1);
    System.out.println("The reuslt of y  is "+result2);

  }  
}
