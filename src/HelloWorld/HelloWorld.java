package HelloWorld;


import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        //Comparison Operation
        byte x = 1;
        byte y = 1;
        //System.out.println(x == y); //Equality operator, this returns a boolean value.
        //System.out.println(x != y); //Inequality operator
        byte temperature = 22;
        boolean IsWarm = temperature > 20 && temperature < 30;
        //System.out.println(IsWarm);
        byte chickenTemp = 65;
        boolean isCooked = chickenTemp > 70 && chickenTemp < 68;
        //System.out.println(isCooked);
        //Determines if the person is eligible.
        //The 'or' operator is used as '||'
        boolean hasHighIncome = false;
        boolean hasGoodGrades = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasGoodGrades || hasHighIncome) && !hasCriminalRecord; //We are not sure if the person has any criminal record, so that's where we use the 'not operator'.
        //System.out.println(isEligible);

        //Experiment 1
        //Eligible to become a prefect.

        boolean leadership = true;
        boolean goodRoleModel = true;
        boolean violatedRules = true;
        boolean isEligibleForPrefect = (leadership || goodRoleModel) && !violatedRules;
        //System.out.println(isEligibleForPrefect);

        //if statement

        int temp = 15;
        if (temp > 30) {
            //That trailing ; is making Java believe that the if statement is finished, and the {} block after it is outside the if condition, consequently the else part has no matching if preceding it.
            //This is a rather frequent bug, and a hard one to spot. If it weren't for the else block, the code would have compiled correctly,
            // but it would have been wrong. Bottom line: never, ever put a ; in the opening line of an if, for or while statement.
            //System.out.println("It's a hot day");
            //System.out.println("Please drink plenty of water!");
        } else if (temp < 20 && temp >= 25) ;
        //System.out.println("Wonderful day!");

        //Experiment 2
        int grades = 81;
        if (grades > 80) {
            //  System.out.println("You did great!");
        } else if (grades <= 80) {
            //  System.out.println("Try harder!"); }
        }

        int income = 120_000;
        boolean hasHighIncomes = income > 100_000;
        //System.out.println(hasHighIncomes);

        int amount = 100_000;
        String className = amount >= 100_000 ? "First Class" : "Economy Class";
        //System.out.println(className);

        //Switch statement
        //When Java reaches a break keyword, it breaks out of the switch block.
        //
        //This will stop the execution of more code and case testing inside the block.
        //
        //When a match is found, and the job is done, it's time for a break. There is no need for more testing.
        String role = "Admin";
        switch (role) {
            case "Admin":
                System.out.println("You're an Admin.");
                break; //adding the break statement it will make the code jump out of the switch block. ( those 2 curly braces {} )
            case "Moderator":
                System.out.println("You're a Moderator.");
                break;
            default: //doesn't need a break statement as this is end of the switch block and will automatically jump out.
                System.out.println("You're a guest.");
        }

        byte role1 = 1;
        switch (role1) {
            case 1:
                System.out.println("Number 1.");
                break;
            case 2:
                System.out.println("Number 2.");
        }

        //break is optional!

        int dayNumber = 8;
        switch (dayNumber) {
            case 1:
                System.out.println("Today is Monday.");
                break;
            case 2:
                System.out.println("Today is Tuesday.");
                break;
            case 3:
                System.out.println("Today is wednesday.");
                break;
            case 4:
                System.out.println("Today is Thursday.");
                break;
            case 5:
                System.out.println("Today is Friday.");
                break;
            case 6:
                System.out.println("Today is Saturday.");
                break;
            case 7:
                System.out.println("Today is Sunday.");
                break;
            default:
                System.out.println("THAT ISN'T IN A RANGE OF 1 TO 7 YOU IDIOT");
        }

        //Buzz and Fuzz?

        Scanner scanNum = new Scanner(System.in);

        System.out.println("Number: ");
        int inputNum = scanNum.nextInt();
        if (inputNum %5 == 0 && inputNum %3 ==0)
            System.out.println("FuzzBuzz");
        else if (inputNum %5 == 0)
            System.out.println("Fuzz");
        else if (inputNum %3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(inputNum);

        //little project

        String classRole = "Admin";
        if (classRole == "Admin")
            System.out.println("You're an admin");
        else if (classRole == "Moderator")
            System.out.println("You're a Moderator.");
        else
            System.out.println("You're a guest.");


        //Simple check score code
        Scanner checkGrade = new Scanner(System.in);
        Scanner checkName = new Scanner(System.in);
        System.out.println("Please input your name,\nName: ");
        String name = checkName.nextLine();
        System.out.println("Welcome, " + name);
        System.out.println("Please input your score,\nScore: ");
        byte testGrade = checkGrade.nextByte();
        if (testGrade > 50 && testGrade < 75) {
            System.out.println("Congratulation! You passed the test!");
            System.out.println("Try aiming higher next time!");
        } else if (testGrade > 75 && testGrade <= 100)
            System.out.println("You passed the test with flying colours!");
        else if (testGrade <= 40)
            System.out.println("You failed the exam! Try harder!");
        else
            System.out.println("The amount cannot be higher than 100, please try again.");
    }
}
