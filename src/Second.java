import exceptions.DividingZeroException;
import exceptions.WrongActionException;

import java.sql.SQLException;
import java.util.Scanner;

public class Second {

    public static void main(String[] args) throws NumberFormatException {
//Написать программу осуществляющую решение линейного уравнения ax + b = 0. a и b задаете в программе,
// х выводите на экран (необходимо рассчитать х для заданных значений a и b)
        Scanner scanner = null;

        try {
            double a, b;

            scanner = new Scanner(System.in);
            System.out.println("Insert the first number:");
            a = Double.parseDouble(scanner.nextLine());

            System.out.println("Insert the second number:");
            b = Double.parseDouble(scanner.nextLine());
            double x= -(b/a);
            if (a == 0) {
                System.out.println("No way dividing to zero");;
            } else {
                System.out.println("In ax + b = 0 , x = " + x);
            }
        } catch (NumberFormatException e) {
            System.out.println("Bad format");
        }
        scanner.close();

        }
    }

