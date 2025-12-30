package tr.edu.istiklal;

public class HexFormatException extends Exception{ ;
    public HexFormatException(String hex)
    {
        super("Invaild hex string: "+hex);
    }
}
