import java.util.Random;

public class MaximumElement {
    public static void main(String[] args) {
        int[] mass = new int[12];
        Random random = new Random();

        // Заполнение массива рандомными значениями от 0 до 15
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(16);
        }
        // Печать содержимого массива
        System.out.print("Содержимое массива: ");
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        // Печать 5-го элемента массива
        System.out.print("5-й элемент массива: ");
        System.out.println(mass[4]);

        // Поиск максимального элемента и индекса его последнего вхождения
        int maxElement = mass[0];
        int lastIndex = 0;
        for (int i = 1; i < mass.length; i++) {
            if (mass[i] >= maxElement) {
                maxElement = mass[i];
                lastIndex = i;
            }
        }

        System.out.println("Максимальный элемент: " + maxElement);
        System.out.println("Индекс его последнего вхождения в массив: " + lastIndex);
    }
}
