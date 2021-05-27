package Four;

import java.util.Random;

/**
 * Created by vakhrushevyp on 27.05.2021
 * Программа заполняет одномерный массив размером 20 случайными целыми числами от -10 до 10
 * Находит максимальный отрицательный и минимальный положительный элементы и меняет их местами
 *
 * @author vakhrushevyp
 */


public class Four1 {

    /**
     * Данный метод генерирует рандомное значение от -10 до 10
     */
    public static int myRandom() {
        Random r = new Random();
        return r.nextInt(21) - 10;
    }

    /**
     * Данный метод заполняет массив рандомными значениями,
     * находит максимальный отрицательный и минимальный положительный элементы и меняет их местами
     */
    public static void main(String[] args) {
        int[] myArray = new int[20];
        int minPlus = 11;
        int minPlusIndex = 0;
        int maxMinus = -11;
        int maxMinusIndex = 0;
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = myRandom();
            if (myArray[i] < 0 & myArray[i] > maxMinus) {
                maxMinus = myArray[i];
                maxMinusIndex = i;
            }
            if (myArray[i] > 0 & myArray[i] < minPlus) {
                minPlus = myArray[i];
                minPlusIndex = i;
            }
        }
        myArray[maxMinusIndex] = minPlus;
        myArray[minPlusIndex] = maxMinus;
        // Выводим результат найденных элементов
        System.out.println("Максимальный отрицательный: " + maxMinus);
        System.out.println("Минимальный положительный: " + minPlus);
    }


}
