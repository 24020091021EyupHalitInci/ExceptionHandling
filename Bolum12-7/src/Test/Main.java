package Test;

import tr.edu.istiklal.Fraction;
import tr.edu.istiklal.NullDenominatorException;

public class Main {
    static void main(String[] args) {
        try {
            Fraction f = new Fraction(10, 0);
        }catch (NullDenominatorException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
