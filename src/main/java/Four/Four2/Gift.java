package Four.Four2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by vakhrushevyp on 31.05.2021
 * Программа собирает новогодний подарок и выводит информацию о нем
 *
 * @author vakhrushevyp
 */

public class Gift {

    /**
     * Заполнение списка сладостей, сбор и вывод информации о подарке
     */

    public static void main(String[] args) {

        //заполняем список сладостей
        Candy candy1 = new Candy("Птичье молоко", 10, 8, "Конфетки.рус");
        Candy candy2 = new Candy("Мишка косолапый", 15, 10, "Конфетки.рус");
        Candy candy3 = new Candy("Укус женщины", 20, 30, "Конфетки.рус");
        Chocolate chocolate1 = new Chocolate("Аленка", 95, 80, 75);
        Chocolate chocolate2 = new Chocolate("Россия", 85, 70, 90);
        Chocolate chocolate3 = new Chocolate("Альпен голд", 90, 49, 60);
        Jellybean jellybean1 = new Jellybean("Haribo", 150, 300, "red");
        Jellybean jellybean2 = new Jellybean("Mamba", 80, 150, "green");
        Jellybean jellybean3 = new Jellybean("Fruit-tella", 70, 100, "multicolor");
        Juice juice1 = new Juice("Я", 200, 40, "Апельсин");
        Juice juice2 = new Juice("Добрый", 250, 35, "Яблоко");
        Juice juice3 = new Juice("Красачик", 150, 25, "Мультифрукт");
        Waffles waffles1 = new Waffles("Коровка", 30, 10, "В шоколадной глазури");
        Waffles waffles2 = new Waffles("Яшкино", 25, 12, "В карамели");
        Waffles waffles3 = new Waffles("Вафли", 10, 5, "Обычные");

        //заполняем массивы по типам сладостей
        Candy[] candies = {candy1, candy2, candy3};
        Chocolate[] chocolates = {chocolate1, chocolate2, chocolate3};
        Jellybean[] jellybeans = {jellybean1, jellybean2, jellybean3};
        Juice[] juices = {juice1, juice2, juice3};
        Waffles[] waffles = {waffles1, waffles2, waffles3};

        //формируем количество сладостей исходя из введенного пользователем значения
        System.out.println("Введите желаемое количество сладостей в подарке:");
        Scanner scanner = new Scanner(System.in);
        int countSweetsInGift = scanner.nextInt();
        Sweets[] giftBox = new Sweets[countSweetsInGift];
        int chocolateCount = countSweetsInGift * 10 / 100;
        int jellybeanCount = countSweetsInGift * 15 / 100;
        int juiceCount = countSweetsInGift * 5 / 100;
        int wafflesCount = countSweetsInGift * 25 / 100;
        int candyCount = countSweetsInGift - (chocolateCount + jellybeanCount + juiceCount + wafflesCount);

        //рандомно выбираем один из типов сладости для добавления в подарок
        int rndCandy = new Random().nextInt(candies.length);
        int rndChocolate = new Random().nextInt(chocolates.length);
        int rndJellybean = new Random().nextInt(jellybeans.length);
        int rndJuice = new Random().nextInt(juices.length);
        int rndWaffles = new Random().nextInt(waffles.length);
        int giftCount = 0;

        //формируем подарок выбранными сладостями
        for (int i = 0; i < chocolateCount; i++) {
            giftBox[giftCount] = chocolates[rndChocolate];
            giftCount++;
        }
        for (int i = 0; i < jellybeanCount; i++) {
            giftBox[giftCount] = jellybeans[rndJellybean];
            giftCount++;
        }
        for (int i = 0; i < juiceCount; i++) {
            giftBox[giftCount] = juices[rndJuice];
            giftCount++;
        }
        for (int i = 0; i < wafflesCount; i++) {
            giftBox[giftCount] = waffles[rndWaffles];
            giftCount++;
        }

        for (int i = 0; i < candyCount; i++) {
            giftBox[giftCount] = candies[rndCandy];
            giftCount++;
        }

        //считаем вес и стоимость подарка
        double totalWeight = 0;
        double totalPrice = 0;
        for (int i = 0; i < countSweetsInGift; i++) {
            totalWeight += giftBox[i].weight;
            totalPrice += giftBox[i].price;
        }

        //выводим информацию о собранном подарке
        System.out.println("Состав подарка: ");
        if (candyCount != 0) {
            System.out.println("Конфеты: " + candies[rndCandy].name + " - " + candyCount + " шт");
        }
        if (chocolateCount != 0) {
            System.out.println("Шоколад: " + chocolates[rndChocolate].name + " - " + chocolateCount + " шт");
        }
        if (jellybeanCount != 0) {
            System.out.println("Жевательные конфеты: " + jellybeans[rndJellybean].name + " - " + jellybeanCount + " шт");
        }
        if (juiceCount != 0) {
            System.out.println("Сок: " + juices[rndJuice].name + " - " + juiceCount + " шт");
        }
        if (wafflesCount != 0) {
            System.out.println("Вафли: " + waffles[rndWaffles].name + " - " + wafflesCount + " шт");
        }

        System.out.println("Вес подарка: " + totalWeight / 1000 + " кг");
        System.out.println("Стоимость подарка: " + totalPrice + " рублей");

    }
}


