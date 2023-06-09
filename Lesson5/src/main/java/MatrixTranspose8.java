import java.util.Random;
import java.util.Scanner;

public class MatrixTranspose8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер матрицы: ");
        int size = scanner.nextInt();
        scanner.close();

        int[][] matrix = new int[size][size];

        // Заполняем матрицу случайными числами от 0 до 50
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = random.nextInt(51);
            }
        }

        System.out.println("Исходная матрица:");
        printMatrix(matrix);

        // Транспонируем матрицу
        int[][] transposedMatrix = transposeMatrix(matrix);

        System.out.println("\nТранспонированная матрица:");
        printMatrix(transposedMatrix);
    }

    // Метод для транспонирования матрицы
    public static int[][] transposeMatrix(int[][] matrix) {
        int size = matrix.length;
        int[][] transposedMatrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                transposedMatrix[i][j] = matrix[j][i];
            }
        }

        return transposedMatrix;
    }

    // Метод для вывода матрицы на консоль
    public static void printMatrix(int[][] matrix) {
        int size = matrix.length;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
/*
В этом коде основной класс MatrixTranspose выполняет следующие шаги:

Читает размер матрицы с клавиатуры.
Создает квадратную матрицу указанного размера.
Заполняет матрицу случайными числами от 0 до 50.
Выводит исходную матрицу на консоль.
Транспонирует матрицу (меняет строки и столбцы местами).
Выводит транспонированную матрицу на консоль.
Функция transposeMatrix выполняет транспонирование матрицы,
а функция printMatrix используется для вывода матрицы на консоль.
 */