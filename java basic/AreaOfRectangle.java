import java.util.Scanner; // Importing the Scanner class for user input

// Class to calculate the area of a rectangle
class CalculateAreaOfRectangle {
    
    // Method to calculate the area of a rectangle
    public int Rectangle(int l, int b) { // Method name corrected to "Rectangle"
        return l * b; // Returns the product of length and breadth
    }
}

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creating a Scanner object for user input

        // Prompting the user to enter the length of the rectangle
        System.out.println("Enter The Length:");
        int length = sc.nextInt(); // Reading the length

        // Prompting the user to enter the breadth of the rectangle
        System.out.println("Enter the Breadth:");
        int breadth = sc.nextInt(); // Reading the breadth

        // Creating an instance of CalculateAreaOfRectangle to call the area calculation method
        CalculateAreaOfRectangle calculate = new CalculateAreaOfRectangle();

        // Calculating and displaying the area of the rectangle
        System.out.println("The area of the rectangle is: " + calculate.Rectangle(length, breadth));

        sc.close(); // Closing the scanner
    }
}
