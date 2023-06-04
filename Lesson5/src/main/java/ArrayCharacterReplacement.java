import java.util.Random;

public class ArrayCharacterReplacement {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random random = new Random();

        // Заполнение массива случайными числами от -20 до 20
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(41) - 20;
        }

        // Вывод исходного массива
        System.out.println("Исходный массив:");
        printArray(array);

        // Замена элементов с нечетным индексом на ноль
        for (int i = 1; i < array.length; i += 2) {
            array[i] = 0;
        }

        // Вывод массива после замены
        System.out.println("Массив после замены:");
        printArray(array);
    }

    // Метод для печати массива
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
