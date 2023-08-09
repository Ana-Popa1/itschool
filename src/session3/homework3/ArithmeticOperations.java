package session3.homework3;
// Write a Java program to take two numbers as input and display the result of
// addition, subtraction, multiplication, division, and modulus.

public class ArithmeticOperations {
    public static void main(String[] args) {
        int firstNumber = 40;
        int secondNumber = 30;

//adunare , scadere ,    inmultire , impartire , modul
// sum ,    difference , product ,   division ,  modulus

        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        int product = firstNumber * secondNumber;
        int division = firstNumber / secondNumber;
        int modulus = firstNumber % secondNumber;

        System.out.println("Sum : " + sum);
        System.out.println("Difference : " + difference);
        System.out.println("Product : " + product);
        System.out.println("Division : " + division);
        System.out.println("Modulus : " + modulus);
    }
}