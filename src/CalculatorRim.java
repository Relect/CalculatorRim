import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorRim {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            String arg1 = in.next();
            String oper = in.next();
            String arg2 = in.next();
            if (!arg1.matches("([1-9]|(10)|I|(II)|(III)|(IV)|V|(VI)|(VII)|(VIII)|(IX)|X)")) throw new InputMismatchException();
            if (!oper.matches("([-|+|*|/])")) throw new InputMismatchException();
            if (!arg2.matches("([1-9]|(10)|I|(II)|(III)|(IV)|V|(VI)|(VII)|(VIII)|(IX)|X)")) throw new InputMismatchException();
            if (arg1.matches("([1-9]|(10))") && arg2.matches("(I|(II)|(III)|(IV)|V|(VI)|(VII)|(VIII)|(IX)|X)")) throw new InputMismatchException();
            if (arg2.matches("([1-9]|(10))") && arg1.matches("(I|(II)|(III)|(IV)|V|(VI)|(VII)|(VIII)|(IX)|X)")) throw new InputMismatchException();

            int num1 = StToInt.argToInt(arg1);
            char op = oper.charAt(0);
            int num2 = StToInt.argToInt(arg2);

            int res = Calc.result(num1, num2, op);
            if (arg1.matches("(I|(II)|(III)|(IV)|V|(VI)|(VII)|(VIII)|(IX)|X)")){
                IntToRim Rim = new IntToRim();
                System.out.println("Результат " + Rim.convert(res));
            }
            else System.out.println("Результат " + res);

        } catch (InputMismatchException e) {
            System.out.println("Неверный ввод");
        }

    }
}