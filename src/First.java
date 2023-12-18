import exceptions.DividingZeroException;
import exceptions.WrongActionException;
import org.jetbrains.annotations.NotNull;

public class First {
    public static void main(String... args) throws Exception {
        double result = calculate(3,0,"/");
        System.out.println(result);
    }

    public static double calculate(double a, double b, @NotNull String action) throws Exception {
        switch (action) {
            case "+": {
                return a + b;
            }
            case "-": {
                return a - b;
            }
            case "*": {
                return a * b;
            }
            case "/": {
                if (b == 0) {
                    throw new DividingZeroException();
                } else {
                    return (a / b);
                }
            }
        }
        throw new WrongActionException();
    }
}