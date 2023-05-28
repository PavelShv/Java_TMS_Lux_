///**
// * 7) Метод должен вернуть максимальный элемент массива. Пример: array = {1,2,10,3} метод возвращает 10
// **/
//public static int max(int[] array) {
//        if (array != null) {
//        int max = Integer.MIN_VALUE;
//        for (int value : array) {
//        if (value > max) {
//        max = value;
//        }
//        }
//        return max;
//        } else {
//        return Integer.MIN_VALUE;
//        }
//        }

public class MaxElementFinder {
    public static void main(String[] args) {
        int[] array = {1, 2, 10, 3};
        int result = max(array);
        System.out.println("Max element: " + result);
    }

    public static int max(int[] array) {
        if (array != null && array.length > 0) {
            int max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            return max;
        } else {
            throw new IllegalArgumentException("The array is null or empty.");
        }
    }
}
