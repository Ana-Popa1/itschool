package session3;

public class IncrementDescrementOperators {

    static int value;

    public static void main(String[] args) {
        int count = 10;
        count++;
        System.out.println("After increment " + count);
        count++;
        System.out.println("After decrement " + count);

        System.out.println("Value is: " + value);
    }
}