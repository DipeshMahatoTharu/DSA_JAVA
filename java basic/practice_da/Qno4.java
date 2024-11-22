//Create a Rectangle class with attributes length and width and a method calculateArea() to calculate its area.
class Rectangle{
    private double length;
    private double breadth;

   public Rectangle(double length ,double breadth){
    this.length=length;
    this.breadth=breadth;
   }

   public double calculateArea(){
    return length*breadth;
   }

   public double getLength(){
    return length;
   }

   public double getBreadth(){
    return breadth;
   }

   public void setlength(double length){
    this.length=length;
   }
   public void setbreadth(double breadth){
    this.breadth=breadth;
   }

}
public class Qno4 {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(10, 20);
        System.out.println("The aera : "+ rectangle.calculateArea());
    }
}
