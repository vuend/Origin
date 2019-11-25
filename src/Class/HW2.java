package Class;

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

        Scanner inputWord = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")) { //input != "quit", while this isn't true, the block will be executed till the word "quit" is mention. 
            System.out.print("Input: ");
            input = inputWord.next().toLowerCase();
            System.out.println(input);
        }


    }
}
