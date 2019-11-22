
//A short, yet simple lines of code that I'd learned on Youtube.
//Youtube Channel : https://www.youtube.com/channel/UCWv7vMbMWH4-V0ZXdmDpPBA
//Most of the variables weren't used as it's just for future reference.

package Main;

import java.awt.*; //Points.
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Arrays; //Arrays.
import java.util.Currency;
import java.util.Date; //Date.
import java.util.Scanner;

public class Main { //class.

    //always use unique variable names to ensure not to get confused.
    //sout is for shortcut for 'System.out.println();'.
    //functions that belong in a class are called Methods.
    //PascalNamingConvention is for Classes, (first alphabet must be in caps).
    //camelNamingConvention is for Methods, (first alphabet must be in small caps).

    //byte, 1 bytes, stores -128 to 127 | short, 2 bytes, stores 32K | int, 4 bytes, stores 2B.
    //long, 8 bytes, stores 2B> | float / double, 4 bytes / 8 bytes, stores decimal.
    //char, 2 bytes, stores alphabet | boolean, 1 byte, stores either true or false.
    //long, float, double must place the first alphabet in cap-lock at the end of the digit.
    //e.g long | 300_000_000_00L;

    //importing a new class into our package will add a "import (class)", when making an instance out of the new class, we must add.
    //(class)(variable) = new (class)();

    public static void main(String[] args) { //function
        short herCount = 30_000;
        long viewCount = 3_000_000_000L;
        double viewsCount = 3.313321333312D;
        float viewedCount = 2.3323323232F;
        boolean myCount = false;
        char letter = 'A';

        Date then = new Date();
        //System.out.println(then);

        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x = 2; //changed final time before it's printed.
        //System.out.println(point2);

        String message = "Hello World" + "!!!"; //String
        //System.out.println(message.replace("!","*");
        String msg = "   Hello \"vuend\"   ";
        //System.out.println(msg.trim()); //trimmed
        //System.out.println(msg); //no trim
        String windowsMessage = "C:\\Users\\User\\IdeaProject\\HelloWorld";
        String windowsMessages = "C:\nUsers\nUser\nIdeaProject\nHelloWorld"; //adding a n after '\' will add a new line.
        //System.out.println(windowsMessage);
        //System.out.println(windowsMessages);

        int[] numbers = new int[5]; //Arrays [ _, _, _, _ ...]
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        //System.out.println(Arrays.toString(numbers));
        int[] number = { 4, 5, 1 ,2 ,3 };
        //System.out.println(number.length); //length of the numbers.
        Arrays.sort(number);
        //System.out.println(Arrays.toString(number)); //remember to add arrays.toString(variable) to print things related to arrays.

        int[][]number1 = new int[2][3]; //2 rows 3 columns.
        number1[0][0] = 1; //initialized to 1, to be more specific, start off with the digit 1.
        //System.out.println(Arrays.deepToString(number1)); //using deepToString to print multidimensional arrays.
        //[[1, 0, 0], [0, 0, 0]] - result
        //2 rows, each has 3 columns

        int[][][]number3 = new int[2][3][5]; //2 rows 3 columns 5 planes
        number3[0][0][0] = 1; //basically choosing the number at a specific spot.
        //System.out.println(Arrays.deepToString(number3)); //using deepToString to print multidimensional arrays.
        //[[[1, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0]] *,* [[0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0]]] - result
        //2 rows, each has 3 columns and 5 planes.
        //imagine a cube, divided into 2 pieces, cut equally into 3 parts then 5, each cube would have 15 individual pieces.

        //Experiment

        int[][][]number2 = new int[1][3][5]; //1 rows 3 columns 5 planes
        number2[0][0][0] = 1;
        number2[0][0][1] = 2;
        number2[0][0][2] = 3;
        number2[0][0][3] = 4;
        number2[0][0][4] = 5;
        number2[0][1][0] = 6;
        number2[0][1][1] = 7;
        number2[0][1][2] = 8;
        number2[0][1][3] = 9;
        number2[0][1][4] = 10;
        number2[0][2][0] = 11;
        number2[0][2][1] = 12;
        number2[0][2][2] = 13;
        number2[0][2][3] = 14;
        number2[0][2][4] = 15;
        //System.out.println(Arrays.deepToString(number2));
        //[[[1, 2, 3, 4, 5], [6, 7, 8, 9, 10], [11, 12, 13, 14, 15]]] - result

        int[][] numberShort = { {1, 2, 3}, {4, 5, 6} }; //shorter method
        //System.out.println(Arrays.deepToString(numberShort));
        //[[1, 2, 3], [4, 5, 6]] - result

        final float pi = 3.14F; //constant, pi is a final variable/constant. We use capital letters to name constant variables.
        //System.out.println(pi);

        //Arithmetic expression

        // + | - | * | /

        int total = 10 + 5;
        total += 5;
        //System.out.println(total);

        double result = (double)10 / (double)3;
        //System.out.println(result);

        //increment
        int numberPlus = 1;
        numberPlus++; //++x is prefix and x++ is postfix
        //System.out.println(numberPlus);

        int math = 2;
        math += 2; //math adding by 2.

        //Implicit casting
        //byte > short > int > long
        float x = 2.5F;
        double y = x + 8.5D;
        //System.out.println(y);

        double er = 1.1;
        int et = (int)er + 2; //(int)er will removed er's decimal point and make it into a whole number
        //which the result will be 1 + 2 = 3
        //System.out.println(et);

        //String me = "0"; //String are used when users keyed in information either on applications, website, etc. All of which will be in Strings, that's why parse___ is used.
        //parseInt will take a string and returns to an integer.
        //parse___ can be used for many primitive data, such as short, float, long.
        //e.g if you want to convert an string into a short integer, use parseShort.
        //int you = Integer.parseInt(me) + 2;
        //System.out.println(you);

        //Objective: Get the digit 6 and check if the 6 exists.

        //Experiment 2
        //float / double, 4 bytes (6 - 7) / 8 bytes (15 - 16), stores decimal.

        String test1 = "4.5";
        float test2 = Float.parseFloat(test1) + 2; //total is 6.5
        double test3 = (Double.parseDouble(String.valueOf(test2)) - 0.5);
        String test4 = String.valueOf(test3);
        //System.out.println(test4.contains("6")); //boolean
        //result should be true.

        String tests1 = "15.55";
        float tests2 = Float.parseFloat(tests1);
        double tests3 = (Double.parseDouble(String.valueOf(tests1)) - 0.55);
        //System.out.println(tests3);

        //Math

        int resulted = Math.round(3.5F); //rounding off to nearest digit
        int resulted1 = (int)Math.ceil(3.5D);
        int result1 = Math.max(1, 2); //largest number
        int result2 = Math.min(2, 1); //smallest number
        //System.out.println(resulted1);

        //Experiment 3

        int tested1 = (int)Math.ceil(1.1F); //smallest integer greater than or equal to the given number.
        int tested2 = (int)Math.floor(1.1F); //largest integer that is smaller or equal to the given number.
        //System.out.println(tested1);
        //System.out.println(tested2);

        double random = Math.round(Math.random() * 100);
        //System.out.println(random);

        int random1 = (int) Math.round(Math.random() * 100);
        //System.out.println(random1);
        int random2 = (int) (Math.random() * 100); //Java will first do the e
        //System.out.println(random2);
        //Implicit casting is e.g int (variable) and explicit casting is int (variable) = (int) ...
        //In this simulation, because after rounding off the decimals into 2 significant figures, int is still compatible.

        //Formatting numbers

        NumberFormat currency = NumberFormat.getNumberInstance();
        String resulting = currency.format(1234567.891);

        NumberFormat percent = NumberFormat.getPercentInstance();
        String resulting1 = percent.format(0.1);
        //System.out.println(resulting1);

        //System.out.println(NumberFormat.getPercentInstance().format(0.1)); //method chaining

        //Reading Input

        Scanner user = new Scanner(System.in); //reading it from the terminal
        Scanner user2 = new Scanner(System.in);
        //System.out.print("What's your name? Name: ");
        //String name = userInput2.nextLine().trim();
        //System.out.println("Your name is " + name);
        //System.out.print("What's your age? Age: ");
        //byte age = user.nextByte();
        //System.out.println("You are " + age);

        //PROJECT

        //Scanner
        Scanner userInput = new Scanner(System.in);
        Scanner userInputName = new Scanner(System.in);
        Scanner userAnnual = new Scanner(System.in);
        Scanner userAge = new Scanner(System.in);
        Scanner userTime = new Scanner(System.in);
        //Name and Age
        //System.out.println("Please Input your name\nName:");
        String name = userInputName.nextLine();
        //System.out.print("Please Input your age:\nAge: ");
        byte inputAge = userAge.nextByte();
        //Mortgage
        //System.out.println("Welcome " + name.toUpperCase() + ", the system will automatically calculate the mortgage payment for you.");
        //System.out.print("Principle: $");
        int TOTAL_AMOUNT = userInput.nextInt(); //Total amount where the user input their money on.
        //System.out.println("You inserted " + TOTAL_AMOUNT + ", if you accidentally input the wrong digit, please restart the program ");
        //System.out.println("Annual Interest Rate: ");
        float ANNUAL = userAnnual.nextFloat();
        float MONTHLY_PERCENTAGE = ANNUAL / 12; //This will give you each months percentage
        //System.out.println("You inserted " + ANNUAL + ", if you accidentally input the wrong digit, please restart the program ");
        //System.out.println("Period of Time: ");
        byte YEARS = userTime.nextByte();
        int TOTAL_YEARS = YEARS * 12;
        //System.out.println("You inserted " + YEARS + ", if you accidentally input the wrong digit, please restart the program ");
        //Calculate
        float step1 = 1 + MONTHLY_PERCENTAGE;
        double bracket = Math.pow(step1, TOTAL_YEARS);
        double stepUp = MONTHLY_PERCENTAGE * bracket;
        double stepDown = bracket - 1;
        double fractionTotal = stepUp / stepDown;
        double total_amount = TOTAL_AMOUNT * fractionTotal;
        NumberFormat currency1 = NumberFormat.getCurrencyInstance();
        String currency2 = currency1.format(Math.round(total_amount));
        //System.out.println("Mortgage: " + currency2);
        //System.out.println("Have a great day! " + name.toUpperCase())
    }
}


