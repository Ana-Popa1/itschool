package session3.homework3.ChallengePage31;

//Create a program that takes an integer as input and then increments and decrements it by 1, displaying the output at each stage.

public class IncrementAndDecrementOperators {
    public static void main(String[] args) {
        int a = 20;
        System.out.println(a);
        a++;
        System.out.println("After increment " + a);
        --a;
        System.out.println("After decrement " + --a);

//Write a Java program that uses both the increment (++) and decrement (--) operators in a loop to count up to 10 and then back down to 1.

        for (int x = 1; x <= 10; x++) {
            System.out.println(x);
        }

        for (int i = 10; i >= 1; i--) {

            System.out.println(i);

        }
    }
}