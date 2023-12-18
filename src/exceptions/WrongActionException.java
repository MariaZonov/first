package exceptions;

public class WrongActionException extends Exception{

    public WrongActionException() {
        super("Bad action");
    }
}

