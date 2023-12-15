/*Write a Java program to get a number 
from the user and print whether it is positive or negative.

Test Data
Input number: 35
Expected Output :
Number is positive*/ 
import java.util.Scanner; //Import The Scanner class

public class number {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number: ");

        int inputNumber = input.nextInt(); //Read user input

        if (inputNumber == 0){
            System.out.println("Entered number is 0(Zero), please insert number greater or less than 0 ");
        }
        else if (inputNumber > 0){
            System.out.println("Entered number is positive!!");
        }
        else{
            System.out.println("Entered number is Negative!!");
        }
    }
}
