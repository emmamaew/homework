import java.util.Scanner;
import java.util.InputMismatchException;

public class App {
    public static void main(String[] args) {
        int conversionChoice;
        double inputnum;
        Scanner scanner = new Scanner(System.in);
        String textinput;

        while (true){
        System.out.println("Enter the conversion you would like (1, 2, 3, 4)");
        System.out.println("1. grams to ounces");
        System.out.println("2. meters to miles");
        System.out.println("3. yards to feet");
        System.out.println("4. pounds to grams");

        textinput = scanner.nextLine();

        if (textinput.equalsIgnoreCase("exit")) {
            System.out.println("exiting program");
            break;
        }

        try {

            conversionChoice = Integer.parseInt(textinput);
        //setting acceptable inputs 
        switch (conversionChoice) {
            case 1:
                System.out.println("Enter number of grams:");
                inputnum = scanner.nextDouble();
                double ounces = inputnum * 0.035274;
                System.out.println(inputnum + " grams = " + ounces + " ounces.");
                break;
            case 2:
                System.out.println("Enter number of meters:");
                inputnum = scanner.nextDouble();
                double miles = inputnum * 0.000621371;
                System.out.println(inputnum + " meters = " + miles + " miles.");
                break;
            case 3: 
                System.out.println("Enter number of yards:");
                inputnum = scanner.nextDouble();
                double feet = inputnum * 3;
                System.out.println(inputnum + " yards = " + feet + " feet.");
                break;
            case 4:
                System.out.println("Enter number of pounds:");
                inputnum = scanner.nextDouble();
                double grams = inputnum * 453.592;
                System.out.println(inputnum + " pounds = " + grams + " grams.");
                break;
            default:
                System.out.println("Invalid choice. Please select 1,2,3,4");
                break;

        }
        scanner.nextLine();

    }catch (InputMismatchException e) {
        System.out.println("Invalid input. Please enter vaild number.");
        scanner.nextLine();
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Enter a number or type 'exit'.");
        }
     }
        scanner.close();
    }
}
