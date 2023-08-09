package session3.homework3.ChallengePage31;

//Write a Java program to take two numbers as input and display the result of addition, subtraction, multiplication, division, and modulus.
//Write a program that calculates the area of a rectangle. Take the length and breadth as inputs.
public class BinaryArithmeticOperators {
    public static void main(String[] args) {
        int firstNumber = 10;
        int secondNumber = 8;
        int length = firstNumber;
        int width = secondNumber;

        int area = length * width;

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
        System.out.println("The area of the rectangle is = " + area);
    }
}