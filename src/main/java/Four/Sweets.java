package Four;

/**
 * Created by vakhrushevyp on 288.05.2021
 * Программа собирает новогодний подарок и выводит информацию о нем
 *
 * @author vakhrushevyp
 */

public class Sweets {

    /**
     * Создание объектов и метода класса Sweets
     */
    private String name;
    private double weight;
    private double price;
    private String manufacturer;

    public Sweets(String name, double weight, double price, String manufacturer) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    /**
     * Заполнение списка сладостей, сбор и вывод информации о подарке
     */
    public static void main(String[] args) {
        Sweets sweet1 = new Sweets("Конфеты", 10, 8, "Конфетки.рус");
        Sweets sweet2 = new Sweets("Мармелад", 25, 15, "Нестле Россия");
        Sweets sweet3 = new Sweets("Шоколад", 95, 60, "Рот Фронт");
        Sweets sweet4 = new Sweets("Сок", 200, 40, "Сады Придонья");
        Sweets sweet5 = new Sweets("Вафли", 70, 20, "Комос");

        // Количество сладостей в одном подарке
        double countSweet1 = 15;
        double countSweet2 = 4;
        double countSweet3 = 2;
        double countSweet4 = 1;
        double countSweet5 = 2;

        // Считаем вес и стоимость подарка
        double totalWeight = (sweet1.weight * countSweet1 + sweet2.weight * countSweet2 + sweet3.weight * countSweet3 + sweet4.weight * countSweet4 + sweet5.weight * countSweet5) / 1000;
        double totalPrice = sweet1.price * countSweet1 + sweet2.price * countSweet2 + sweet3.price * countSweet3 + sweet4.price * countSweet4 + sweet5.price * countSweet5;

        // Выводим состав подарка, его вес и стоимость
        System.out.println("Состав подарка: ");
        System.out.println(sweet1.name + " - " + countSweet1 + " шт");
        System.out.println(sweet2.name + " - " + countSweet2 + " шт");
        System.out.println(sweet3.name + " - " + countSweet3 + " шт");
        System.out.println(sweet4.name + " - " + countSweet4 + " шт");
        System.out.println("Вес подарка: " + totalWeight + " кг");
        System.out.println("Стоимость подарка: " + totalPrice + " рублей");

    }
}


