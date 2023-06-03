public class OddNumbersArray {
    public static void main(String[] args) {
        int[] oddNumbers = createOddNumbersArray();
        printArray(oddNumbers);
        printReversedArray(oddNumbers);
    }

    /**
     * Создает массив всех нечетных чисел от 1 до 100.
     *
     * @return Массив нечетных чисел.
     */
    public static int[] createOddNumbersArray() {
        int[] oddNumbers = new int[100];  // В массиве будет 50 нечетных чисел от 1 до 100.
        int number = 1;
        for (int i = 0; i < oddNumbers.length; i++) {
            oddNumbers[i] = number;
            number += 2;
        }
        return oddNumbers;
    }

    /**
     * Выводит массив на экран в строку.
     *
     * @param array Массив для вывода.
     */
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    /**
     * Выводит массив на экран в обратном порядке.
     *
     * @param array Массив для вывода.
     */
    public static void printReversedArray(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
