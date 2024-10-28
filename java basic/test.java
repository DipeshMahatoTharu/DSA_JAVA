public class test {
    public static void main(String[] args) {
        int i ; 
        int j;

         i = 1; //original value 
         j= i-- + 4;
         System.out.println(" i is "+ i + " j is "+j);
       
         int d=2;
         int b= --d ; // pre decrement 
         System.out.println(" a is "+ d + " d is "+b);

         int a=2;
         System.out.println(a--);

         //first 2-1=1
         //second 1-a
         //third =0

         System.out.println(--a);



    }
}
