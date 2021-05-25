package Calc;

import java.util.Scanner;

/**
 * Created by vakhrushevyp on 25.05.2021
 *
 * @author vakhrushevyp
 */

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        double x = scanner.nextDouble();
        System.out.println("Введите второе число:");
        double y = scanner.nextDouble();
        /** Вычисляем сумму введенных чисел и выводим с огруглением до 4-х знаков после запятой */
        System.out.printf("Сумма = %.4f", x + y);
    }
}
