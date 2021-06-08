package Five.CalculatorOperation;

public class Division extends Operation {
    public Division(int x, int y) {
        super(x, y);
        try {
            System.out.println(x / y);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка деления на 0!");
        }


    }
}
