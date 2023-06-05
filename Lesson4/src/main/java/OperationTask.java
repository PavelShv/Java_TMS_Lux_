public class OperationTask {
    public static void main(String[] args) {
        int number = 0;
        int result = operation(number);
        System.out.println("Результат: " + result);
    }

    /**
     * Метод должен выполнять некоторую операцию с int "number" в зависимости от некоторых условий:
     * - Если number положительное число, то необходимо number увеличить на 1.
     * - Если number отрицательное, уменьшить на 2.
     * - Если number равно 0, заменить значение number на 10.
     * Вернуть number после выполнения операций.
     */
    public static int operation(int number) {
        if (number > 0) {
            number++;
        } else if (number < 0) {
            number -= 2;
        } else {
            number = 10;
        }
        return number;
    }
}
