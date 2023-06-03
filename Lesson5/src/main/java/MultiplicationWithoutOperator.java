/*Напишите реализацию метода summ(int a, int b), вычисляющий a*b,
не пользуясь операцией умножения, где a и b целые числа,
вызовите метод summ в методе main и распечатайте на консоль.*/

public class MultiplicationWithoutOperator {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int result = summ(a, b);
        System.out.println("Результат: " + result);
    }

    /**
     * Метод вычисляет произведение двух чисел a и b без использования оператора умножения.
     *
     * @param a Первое число.
     * @param b Второе число.
     * @return Произведение чисел a и b.
     */
    public static int summ(int a, int b) {
        int result = 0;
        boolean isNegative = (a < 0 && b > 0) || (a > 0 && b < 0);
        a = Math.abs(a);
        b = Math.abs(b);

        for (int i = 0; i < b; i++) {
            result += a;
        }

        return isNegative ? -result : result;
    }
}
