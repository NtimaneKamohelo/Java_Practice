/*Write a Java program to solve quadratic equations (use if, else if and else).

Test Data
Input a: 1
Input b: 5
Input c: 1
Expected Output :
The roots are -0.20871215252208009 and -4.7912878474779195 */
import java.util.Scanner;

public class Equation {
    public static void main (String[] args){
        //Quadtratic Equation: Ax^2 + Bx + c

        //a, b, & c values
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        double a = input.nextDouble();

        System.out.print("Enter value of b: ");
        double b = input.nextDouble();

        System.out.print("Enter value of c: ");
        double c = input.nextDouble();

        //Inside the square root
        double determinant = b * b - 4 * a * c;

        if (determinant > 00){
            double xPositive = (-b + Math.sqrt(determinant)) / 2 * a;
            double xNegative = (-b - Math.sqrt(determinant)) / 2 * a;

            System.out.print("First root: " + xPositive);
            System.out.print("second root: " + xNegative);
        } 
        else if (determinant == 0){
            
        }


        
    }
}
