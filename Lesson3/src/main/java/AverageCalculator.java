///**
// * 6) Метод должен вернуть среднее значение из массива чисел
// * (необходимо сумму всех элеменов массива разделить на длину массива)
// * <p>
// * Example:
// * array = {1,2,3,4,5}
// * Метод должен return 3.0
// */
//public static double average(int[] array) {
//        double count = 0;
//        for (int value : array) {
//        count = count + value;
//        }
//        return count / array.length;
//        }

public class AverageCalculator {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        double result = average(array);
        System.out.println("Average: " + result);
    }

    public static double average(int[] array) {
        double sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum / array.length;
    }
}
