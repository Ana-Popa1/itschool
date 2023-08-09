package session3.homework3.ChallengePage31;
//Logical Complement and Negation Operators:

//Write a Java program that takes two boolean inputs from a user. Apply the logical negation operator (!) to each and print the result.

public class LogicalComplementAndNegociationOperators {

    public static void main(String[] args) {
        boolean a = false;
        boolean b = true;

        a = !a;
        b = !b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

//Write a program to check if a number is positive or negative using logical complement operator.
        int x = 5;
        int y = 0;

        System.out.println((x > y) + ": The number x is positive.");
        System.out.println((x < y) + ": The number x in negative.");
    }
}