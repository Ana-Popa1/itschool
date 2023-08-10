package session3.homework3.ChallengePage31;

public class LogicalComplementAndNegociationOperators {

    public static void main(String[] args) {
        boolean a = false;
        boolean b = true;

        a = !a;
        b = !b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int x = 5;
        int y = 0;

        System.out.println((x > y) + ": The number x is positive.");
        System.out.println((x < y) + ": The number x in negative.");
    }
}