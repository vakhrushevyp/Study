package Calc;

import java.util.Scanner;

/**
 * Created by vakhrushevyp on 26.05.2021
 * Программа выполняет одно из заданий на выбор:
 * Если в консоли ввести 1 - запустится выполнение калькулятора, если 2 - поиск максимального слова в массиве
 * @author vakhrushevyp
 */

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Если в консоли ввести 1 - запустится выполнение калькулятора, если 2 - поиск максимального слова в массиве");
        int input = scanner.nextInt();
        switch (input) {
            /** Ввод оператора, чисел, выполняем операцию над ними и выводим с огруглением до 4-х знаков после запятой */
            case 1:
                System.out.println("Укажите операцию (сложение +, вычитание -, деление /, умножение *): ");
                String operator = scanner.next();
                System.out.println("Введите первое число:");
                double x = scanner.nextDouble();
                System.out.println("Введите второе число:");
                double y = scanner.nextDouble();
                switch (operator) {
                    case "*":
                        System.out.printf("Результат умножения = %.4f", x * y);
                        break;
                    case "/":
                        System.out.printf("Результат деления = %.4f", x / y);
                        break;
                    case "+":
                        System.out.printf("Результат сложения = %.4f", x + y);
                        break;
                    case "-":
                        System.out.printf("Результат вычитания = %.4f", x - y);
                        break;

                    default:
                        System.out.println("Введенный знак не распознан, нужно ввести один из символов: +,-,/,*");

                }
                break;
            /** Ввод размера массива, заполнение слов в массив с нахождением самого длинного слова */
            case 2:
                System.out.println("Укажите размер массива:");
                int countElements = scanner.nextInt();
                String[] myArray = new String[countElements];
                System.out.println("Введите слова (каждое с новой строки):");
                for (int i = 0; i <= myArray.length - 1; i++) {
                    myArray[i] = scanner.next();
                }
                String maxWord = "";
                for (String word : myArray)
                    if (word.length() > maxWord.length()) {
                        maxWord = word;
                    }
                System.out.println("Самое длинное слово в массиве: " + maxWord);
                break;
            default:
                System.out.println("Вы не выбрали ни одно из приложений!");
        }

    }
}
