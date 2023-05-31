public class calculateCount {
    public static void main(String[] args) {
        // Пример входного массива целых чисел
        int[] array = {1, 45, 3, 55, 5, 6, 7, 81, 9, 11};

        // Вызов метода для подсчета количества нечетных элементов в массиве
        int oddCount = calculateCountOfOddElementsInMatrix(array);

        // Вывод результата на консоль
        System.out.println("Количество нечетных элементов: " + oddCount);
    }

    /**
     * Метод для подсчета количества нечетных элементов в массиве
     *
     * @param ints массив целых чисел
     * @return количество нечетных элементов
     */
    public static int calculateCountOfOddElementsInMatrix(int[] ints) {
        int count = 0;
        for (int i : ints) {
            if (i % 2 != 0) {
                count++;
            }
        }
        return count;
    }
}

