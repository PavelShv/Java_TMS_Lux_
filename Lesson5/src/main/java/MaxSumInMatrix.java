import java.util.Random;

public class MaxSumInMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        Random random = new Random();

        // Заполнение матрицы случайными значениями
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrix[i][j] = random.nextInt(10001);
            }
        }

        int maxSum = Integer.MIN_VALUE;//поиск минимального значения
        int maxSumRow = -1;//строка
        int maxSumCol = -1;//столбец

        // Поиск максимальной суммы среди трех соседних элементов в строке
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                int sum = matrix[i][j] + matrix[i][j + 1] + matrix[i][j + 2];
                if (sum > maxSum) {
                    maxSum = sum;
                    maxSumRow = i;
                    maxSumCol = j;
                }
            }
        }
        System.out.println("Тройка чисел для максимальной суммы:");
        System.out.println(matrix[maxSumRow][maxSumCol] + ", " +
                matrix[maxSumRow][maxSumCol + 1] + ", " +
                matrix[maxSumRow][maxSumCol + 2]);

        System.out.println("Максимальная сумма: " + maxSum);
        System.out.println("Индексы первого элемента тройки: (" + maxSumRow +
                ", " + maxSumCol + ")");
        // Вывод значений массива в консоль
        System.out.println("Массив:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*
Создать матрицу размера 10 на 10 и заполнить ее случайными целочислеными значениями
(тип int) из диапазона от 0 до 10000.
Найти максимум среди сумм трех соседних элементов в строке. Для найденной тройки
с максимальной суммой выведите значение суммы и индексы(i,j) первого элемента тройки.
Пример:
*Для простоты пример показан на одномерном массиве размера 10
[1, 456, 1025, 65, 954, 2789, 4, 8742, 1040, 3254] Тройка с максимальной суммой:
[2789, 4, 8742]
Вывод в консоль:
11535 (0,5)
*Пояснение. Первое число - сумма тройки  [2789, 4, 8742]. Числа в скобках
это 0 строка и 5 столбец - индекс первого элемента тройки, то есть индекс числа 2789.

 */