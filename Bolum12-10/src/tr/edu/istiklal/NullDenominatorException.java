package tr.edu.istiklal;

public class NullDenominatorException extends Exception {
    public NullDenominatorException() {
        super("Denominator cannot be zero.");
    }
}