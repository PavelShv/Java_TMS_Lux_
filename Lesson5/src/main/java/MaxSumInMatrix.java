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

        int maxSum = Integer.MIN_VALUE;
        int maxSumRow = -1;
        int maxSumCol = -1;

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

        System.out.println("Максимальная сумма: " + maxSum);
        System.out.println("Индексы первого элемента тройки: (" + maxSumRow + ", " + maxSumCol + ")");
    }
}

