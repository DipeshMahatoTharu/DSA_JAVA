// Logical operators are used when we want to check the truth value of certain statements.
//  Logical operators help us in checking multiple statements together for their truthness.

// Here we will learn logical operators like AND(&&), OR(||), NOT(!). 
// These operators produce either a true or a false as an output.



import java.util.Scanner;
public class Qno6 {
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);


         System.out.print("Enter the first person name: ");
            String Name1=sc.nextLine();
            
            

         System.out.print("Enter the second person name: ");
      
            String Name2=sc.nextLine();


        if(Name1.equals("Catwomen") && Name2.equals("Batman")){
            System.out.println("oh love birds !!!");
        }else{
            System.out.println("who the hell are u ");
        }
        
            sc.close();
    }
    
}
