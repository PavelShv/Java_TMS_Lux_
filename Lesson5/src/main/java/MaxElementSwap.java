public class MaxElementSwap {
    public static void main(String[] args) {
        int[] array = {4, 5, 0, 23, 77, 0, 8, 9, 101, 2}; //Создали массив

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }

        int temp = array[maxIndex];
        array[maxIndex] = array[0];
        array[0] = temp;

        System.out.println("Массив после замены:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
