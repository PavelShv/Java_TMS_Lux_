import java.util.Random;
import java.util.Scanner;

public class GenerateAndPrintArray {
    public static void main(String[] args) {
        generateAndPrintArray();
    }

    /**
     * Задача: Генерация и печать массива.
     * <p>
     * Необходимо прочитать с консоли значение числа типа int,
     * сделать проверку что если пользователь ввел не положительное число,
     * то вывести ошибку и отправить пользователя вводить заново новое число!
     * Далее создать одномерный массив типа int размера прочитанного с консоли
     * и заполнить массив случайными значениями.
     * Затем вывести массив на консоль.
     */
    private static void generateAndPrintArray() {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Введите положительное число: ");
            if (scanner.hasNextInt()) {
                count = scanner.nextInt();
                if (count <= 0) {
                    System.out.println("Ошибка: введено неположительное число. Попробуйте еще раз.");
                }
            } else {
                System.out.println("Ошибка: введено некорректное значение. Попробуйте еще раз.");
                scanner.next();
            }
        } while (count <= 0);

        int[] array = new int[count];
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            array[i] = random.nextInt();
        }

        System.out.println("Сгенерированный массив:");
        for (int num : array) {
            System.out.println(num);
        }
    }
}
