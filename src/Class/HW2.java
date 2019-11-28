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

        //Previous:

        //PROJECT (MORTGAGE CALCULATOR V1.0)

        //Scanner
        //Scanner userInput = new Scanner(System.in);
        //Scanner userInputName = new Scanner(System.in);
        //Scanner userAnnual = new Scanner(System.in);
        //Scanner userAge = new Scanner(System.in);
        //Scanner userTime = new Scanner(System.in);
        //Name and Age
        //System.out.println("Please Input your name\nName:");
        //String name = userInputName.nextLine();
        //System.out.print("Please Input your age:\nAge: ");
        //byte inputAge = userAge.nextByte();
        //Mortgage
        //System.out.println("Welcome " + name.toUpperCase() + ", the system will automatically calculate the mortgage payment for you.");
        //System.out.print("Principle: $");
        //int TOTAL_AMOUNT = userInput.nextInt(); //Total amount where the user input their money on.
        //System.out.println("You inserted " + TOTAL_AMOUNT + ", if you accidentally input the wrong digit, please restart the program ");
        //System.out.println("Annual Interest Rate: ");
        //float ANNUAL = userAnnual.nextFloat();
        //float MONTHLY_PERCENTAGE = ANNUAL / 12; //This will give you each months percentage
        //System.out.println("You inserted " + ANNUAL + ", if you accidentally input the wrong digit, please restart the program ");
        //System.out.println("Period of Time: ");
        //byte YEARS = userTime.nextByte();
        //int TOTAL_YEARS = YEARS * 12;
        //System.out.println("You inserted " + YEARS + ", if you accidentally input the wrong digit, please restart the program ");
        //Calculate
        //float step1 = 1 + MONTHLY_PERCENTAGE;
        //double bracket = Math.pow(step1, TOTAL_YEARS);
        //double stepUp = MONTHLY_PERCENTAGE * bracket;
        //double stepDown = bracket - 1;
        //double fractionTotal = stepUp / stepDown;
        //double total_amount = TOTAL_AMOUNT * fractionTotal;
        //NumberFormat currency1 = NumberFormat.getCurrencyInstance();
        //String currency2 = currency1.format(Math.round(total_amount));
        //System.out.println("Mortgage: " + currency2);
        //System.out.println("Have a great day! " + name.toUpperCase())


        //----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

        //Important

        int principle = 0;
        float annual = 0;
        byte time = 0;
        byte YEAR = 12;

        //----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


        //Scanners

        Scanner userPrinciple = new Scanner(System.in);
        Scanner userGender = new Scanner(System.in);
        Scanner userName = new Scanner(System.in);
        Scanner userAnnual = new Scanner(System.in);
        Scanner userTime = new Scanner(System.in);


        //----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


        //Privacy leaked

        System.out.println("Sir Name: ");
        String name = userName.nextLine();
        System.out.println("Gender (M/F): ");
        String gender = userGender.nextLine().toLowerCase();

        if (gender.equals("m")) {
            System.out.println("Welcome Mr." + name + ", the system will now automatically calculate your mortgage payment.");
        } else if (gender.equals("f")) {
            System.out.println("Welcome Ms/Mdm." + name + ", the system will now automatically calculate your mortgage payment.");
        }

            //Mortgage

            while (true) {
                System.out.print("Principle ($1,000 - $1,000,000): $ ");
                principle = userPrinciple.nextInt(); //Total amount where the user input their money on.                                //Principle
                if (principle >= 1000 && principle <= 1000000)
                    break; //If user input a valid value, Java will break out of the code block.
                System.out.println("Please enter a value greater than 1,000 and less than 1,000,000, try again.");
                continue;
            }

            while (true) {
                System.out.println("Annual Interest Rate: ");                                                                           //Interest Rate
                annual = userAnnual.nextFloat();
                if (annual >= 0 && annual <= 30)
                    break; //If user input a valid value, Java will break out of the code block.
                System.out.println("Please enter a value greater than 0 and less than 30, try again.");
                continue;
            }

            while (true) {
                System.out.println("Period (Years): ");
                time = userTime.nextByte();                                                                                              //Time
                if (time >= 0 && time <= 30)
                    break; //If user input a valid value, Java will break out of the code block.
                System.out.println("Please enter a value greater than 0 and less than 30, try again.");
                continue;
            }


        //----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


        //Calculation

        //Monthly interested rate,

        float MONTHLY_INTERESTED_RATE = annual / YEAR;

        //Total Month

        int TOTAL_MONTH = YEAR * time;

        //Calculate

        float Simplified = MONTHLY_INTERESTED_RATE + 1;
        double monthlyPayment = Math.pow(Simplified, TOTAL_MONTH);
        double monthlyINP = MONTHLY_INTERESTED_RATE * monthlyPayment;
        double monthlyMinus = monthlyPayment - 1;
        double TOTAL = principle * ( monthlyINP / monthlyMinus );
        NumberFormat rounded= NumberFormat.getCurrencyInstance();
        String roundedTotal = rounded.format(Math.round(TOTAL));

        System.out.println("Mortgage Payment: " + roundedTotal);

        

        }
    }
