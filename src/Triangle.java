/**
 * title:Itec 2140
 * date:02/05/2023
 * author: Joshua Wilson
 * description: This program will calculate the perimeter of a triangle using its 3 edges and to determine if it is a valid triangle
 */
import java.util.Scanner;
public class Triangle {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter Length a: ");   // we are prompting the user to set the values
        int number1 = reader.nextInt();
        System.out.print("Enter Length b: ");
        int number2 = reader.nextInt();

        System.out.print("Enter Length c: ");
        int number3 = reader.nextInt();     //this is intended to separate the lines
        int perimeter = number1 + number2 + number3;

        //now that the variables are all set the users input can be calculated


        if  (number1 + number2 > number3) { //we set this in case some of the values dont make a valid triangle
            System.out.print("The perimeter is " + perimeter);}
        else if (number1 + number2 <= number3)
            System.out.print("This input is invalid try again invalid");
        // the final line above will print out the final result of the program






    }
}
