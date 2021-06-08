package Six;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

/**
 * Created by vakhrushevyp on 07.06.2021
 * Программа считывает текстовый файл (путь жжестко прописан "C:\\Java\\myFile.txt")
 * Выводит на консоль слова в алфавитном порядке с указанием количества повторений в файле
 * Выводим слова с максимальным количеством повторений
 *
 * @author vakhrushevyp
 */

public class FileReader {

    public static void main(String[] args) throws IOException {
        Scanner scannerPath = new Scanner(System.in);
        System.out.println("Введите путь к файлу:");
        String filePath = scannerPath.nextLine();
        String fileName = "C:\\Java\\myFile.txt"; //переменная для варианта с жестко прописанным путем файла (удалить 3 предыдущие строчки и в следующей заменить переменную)
        Path path = Paths.get(filePath);
        Scanner scannerFile = new Scanner(path);
        scannerFile.useDelimiter(":\\s|\\s+|,|,\\s");  //разделители слов при чтении из файла
        //Прочитанный файл помещаем в ArrayList
        ArrayList<String> sortList = new ArrayList<>();
        while (scannerFile.hasNext()) {
            sortList.add(scannerFile.next());
        }
        //Создаем treeMap и помещаем туда дынные из ArrayList для размещения слов в алфавитном порядке и считаем количество повтряющихся слов
        Map<String, Integer> treeMap = new TreeMap<>();
        for (String countInList : sortList) {
            treeMap.put(countInList, Collections.frequency(sortList, countInList));
        }
        //Выводим список слов в алфавитном порядке с указанием значения повторений
        System.out.println("Статистика по содержанию слов в файле: ");
        for (Map.Entry<String, Integer> pair : treeMap.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue() + " шт");
        }
        //Воводим слова с максимальным количеством повторений
        System.out.println("\nСлово(а) с максимальным количеством повторений в файле: ");
        String key; //Ключ (слово) которому соответствует максимальное значение повторений в ArrayList
        for (String keyMaxValue : treeMap.keySet()) {
            if (treeMap.get(keyMaxValue).equals(Collections.max(treeMap.values()))) {
                key = keyMaxValue;
                System.out.println(key + " - " + treeMap.get(key) + " шт.");
            }
        }
    }
}
