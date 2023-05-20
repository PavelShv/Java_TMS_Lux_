//Даны несколько целых чисел. Найти количество положительных чисел в исходном наборе.
//Пояснение: С консоли вводим через пробел числа и в ответе в консоль выводится
// (количество положительных чисел = ?), где ? - это количество положительных чисел
//Пример для ввода: java Task1 23 89 -1 1 3
//Ответ: количество положительных чисел = 4.

import lombok.ToString;

@ToString
public class Task1 {
    public static void main(String[] args) {
        int count = 0;
        for (String value : args) {
            int parseIntValue = Integer.parseInt(value);
            if (parseIntValue > 0) {
                count = count + 1;
            }
        }
        System.out.println("количество положительных чисел - " + count);
    }
}
