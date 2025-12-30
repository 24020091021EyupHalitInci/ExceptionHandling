package tr.edu.istiklal;

public class BinaryFormatException extends  Exception{
    public BinaryFormatException(String binaryString) {
        super("Invalid binary string: " + binaryString);
    }
}
