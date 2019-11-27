package Class;

import java.text.NumberFormat;
import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        //For Loop
        //for (int i = 0; i < 5; i++)
        //System.out.println("Hello World");
        //for (int e = 1; e < 5; e++)
        //System.out.println("Number " + e);
        //for (int w = 3; w > 0; w--)
        //System.out.println("Number " + w);

        //we cannot use in inequality operator as this isn't a number digits and this is a string.
        //so we need to use 'equals', if we want to define that the variable is not equal, we put ! before the variable

        //Scanner inputWord = new Scanner(System.in);
        //String input = "";
        //while (true) { //input != "quit", while this isn't true, the block will be executed till the word "quit" is mention.
        //System.out.print("Input: ");
        //input = inputWord.next().toLowerCase();
        //if (input.equals("pass"))
        //continue;
        //else if (input.equals("quit"))
        //break;
        //else
        //System.out.println(input);

        //for each loop
        //String[] fruits = {"Apple", "Banana", "Grapes"}; //for loop
        //for (int i = 0; i < fruits.length; i++) {
        //System.out.println(fruits[i]);
        //}

        //for (String fruit : fruits) { //for each loop
        //System.out.println(fruit); //has limitations
        //}
        //Experiment 1

        //String[] brands = {"Microsoft", "Apple", "Linus"};
        //for (int branding = 0; branding < brands.length; branding++) {
        //System.out.println(brands[branding]);
        //} for (String company : brands) {
        //System.out.println(company);

        //----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


        //Project (Mortgage Calculator v2.0)

        //Important

        int principle = 0;
        float annual = 0;
        byte time = 0;
        String gender = "o";

        //Scanners

        Scanner userPrinciple = new Scanner(System.in);
        Scanner userGender = new Scanner(System.in);
        Scanner userName = new Scanner(System.in);
        Scanner userAnnual = new Scanner(System.in);
        Scanner userTime = new Scanner(System.in);

        //Privacy leaked

        System.out.println("Sir Name: ");
        String name = userName.nextLine();
        System.out.println("Gender (M/F): ");
        gender = userGender.nextLine().toLowerCase();

        if (gender.equals("m")) {
            System.out.println("Welcome Mr." + name + ", the system will now automatically calculate your mortgage payment.");
        } else if (gender.equals("f")) {
            System.out.println("Welcome Ms/Mdm." + name + ", the system will now automatically calculate your mortgage payment.");
            
            //Mortgage

            while (true) {
                System.out.print("Principle ($1,000 - $1,000,000): $ ");
                principle = userPrinciple.nextInt(); //Total amount where the user input their money on.
                if (principle >= 1000 && principle <= 1000000)
                    break; //If user input a valid value, Java will break out of the code block.
                System.out.println("Please enter a value greater than 1,000 and less than 1,000,000, try again.");
                continue;
            }

            while (true) {
                System.out.println("Annual Interest Rate: ");
                annual = userAnnual.nextFloat();
                if (annual >= 0 && annual <= 30)
                    break; //If user input a valid value, Java will break out of the code block.
                System.out.println("Please enter a value greater than 0 and less than 30, try again.");
                continue;
            }

            while (true) {
                System.out.println("Period (Years): ");
                time = userTime.nextByte();
                if (time >= 0 && time <= 30)
                    break; //If user input a valid value, Java will break out of the code block.
                System.out.println("Please enter a value greater than 0 and less than 30, try again.");
                continue;
            }
        }
    }
