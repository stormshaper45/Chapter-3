/**
 * title:Itec 2140
 * date:02/05/2023
 * author: Joshua Wilson
 * description: This program will calculate the BMI of a the users weight converted it to kgs and Height converted to meters
 */
import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter your weight(lb): ");
        int weight = reader.nextInt();      // we are making sure to clearly part each line and to ensure that the pompts are clear
        System.out.print("Enter height in inches: ");
        int Height = reader.nextInt();
        /**
         * The following formulas are set from the problem to help us calculate the BMI
         * we are setting them to ensure its one of the first configured
         */
        double height_M = Height * 0.0254;
        double weight_kg = weight * 0.4536;


        double BMI = (weight_kg / (height_M * height_M ));

    System.out.print(" Your BMI given your weight being " + weight_kg + " kg " + "and your height being " + height_M +" m");
        System.out.print(" Your BMI is " + BMI);    // this will print our final result letting the user know what their BMI is

    }
}
