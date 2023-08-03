package session3;

import java.util.SortedMap;

public class LogicalComplementAndNegociationOperators {

    public static void main(String[] args) {
        boolean isTrue = true;
        boolean isFalse = false;
         // ! invers boolean
        isTrue = !isTrue;
        isFalse = !isFalse;

        System.out.println("isTrue: " + isTrue);
        System.out.println("isFalse: " + isFalse);
    }
}