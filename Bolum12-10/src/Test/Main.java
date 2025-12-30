package Test;

import tr.edu.istiklal.Fraction;
import tr.edu.istiklal.NullDenominatorException;

public class Main {
    static void main(String[] args) {
        try {
            Fraction f1 = new Fraction(8, 3);
            System.out.println("Kesir: " + f1);
            Fraction f2 = new Fraction(16, 0);
        } catch (NullDenominatorException e) {
            System.out.println(e.getMessage());
        }

    }
}
