package session3.homework3.ChallengePage31;

//Create a Java program where you increment and decrement the same variable. Display the value of the variable after each operation.
//Write a program that reverses the sign of an entered integer using unary minus operator.
public class UnaryOperators {
    public static void main(String[] args) {
        int a = 23;
        System.out.println(a);
        a++;
        System.out.println("After increment " + a);
        --a;
        System.out.println("After decrement " + --a);

        int number = -15;
        number = -number;
        System.out.println(number);
    }
}