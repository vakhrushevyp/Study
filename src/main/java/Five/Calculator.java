package Five;

import Five.CalculatorOperation.Division;
import Five.CalculatorOperation.Plus;
import Five.CalculatorOperation.Minus;
import Five.CalculatorOperation.Multiplication;
import Five.CalculatorOperation.Operation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int x;
        try {
        x = scanner.nextInt();
                } catch (InputMismatchException e) {
            System.out.println("Вы ввели неправильное число!");
            return;
        }
        System.out.println("Укажите операцию (сложение +, вычитание -, деление /, умножение *): ");
        String operator = scanner.next();
        System.out.println("Введите второе число:");
        int y;
        try {
        y = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели неправильное число!");
            return;
        }
        switch (operator) {
            case "+":
                System.out.println(new Plus(x,y).getResult());
                break;

            case "-":
                System.out.println(new Minus(x,y).getResult());
                break;
            case "*":
                System.out.println(new Multiplication(x,y).getResult());
                break;
            case "/":
                try {
                    System.out.println(new Division(x,y).getResult());
                }
                catch (ArithmeticException e) {
                    System.out.println("Ошибка деления на 0!");
                }

                break;
            default:
                System.out.println("Введенный знак не распознан, нужно ввести один из символов: +,-,/,*");

        }


    }


}
