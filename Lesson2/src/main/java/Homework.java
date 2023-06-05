//В данном задании по Java требуется выполнить следующие действия:
//
//        1. Реализовать метод `printLiterals()`, который выводит на консоль различные литералы,
//        включая символьные, логические, строковые, целочисленные и литералы типа float и double.
//
//        2. Реализовать метод `sum(int a, int b)`, который возвращает сумму двух чисел `a` и `b`.
//        Дополнительно, если сумма `a` и `b` превышает максимальное значение типа `int`,
//        метод должен вернуть -1.
//
//        3. Реализовать метод `max(int a, int b)`, который возвращает максимальное
//        значение из двух чисел `a` и `b`.
//
//        4. Реализовать метод `calculateHypotenuse(int a, int b)`, который использует
//        теорему Пифагора для вычисления значения гипотенузы. Метод принимает два катета `a` и `b`
//        и возвращает значение гипотенузы в виде числа с плавающей точкой (double).
//
//        В методе `main` уже присутствуют вызовы этих методов для тестирования:
//
//        - `printLiterals()` выводит на консоль различные литералы.
//        - `sum(100, 200)` вызывает метод `sum` с аргументами 100 и 200 и выводит результат
//        сложения на консоль.
//        - `sum(Integer.MAX_VALUE, Integer.MAX_VALUE)` вызывает метод `sum` с аргументами
//        `Integer.MAX_VALUE` и `Integer.MAX_VALUE` и выводит результат сложения на консоль.
//        - `max(56, 349)` вызывает метод `max` с аргументами 56 и 349 и выводит максимальное
//        значение на консоль.
//        - `calculateHypotenuse(3, 4)` вызывает метод `calculateHypotenuse` с аргументами 3 и 4
//        и выводит значение гипотенузы на консоль.

public class Homework {

    public static void main(String[] args) {
        //вывод на консоль
        printLiterals();
        //Некоторые тесты для проверки задач.
        System.out.println(sum(100, 200));
        System.out.println(sum(Integer.MAX_VALUE, Integer.MAX_VALUE));
        System.out.println(max(56, 349));
        System.out.println(calculateHypotenuse(3, 4));
    }


    private static void printLiterals() {
        //        вывести на консоль литералы следующих видов:
        char c = 'a';
        System.out.println(c);
        //        логический
        boolean bul = true;
        System.out.println(bul);

        //        строковый
        String str = "Я люблю мороженое";
        System.out.println(str);

        //        символьный
        char x = 214;
        System.out.println(x);

        //        целочисленный 2-й
        int sec = 2;
        System.out.println(sec);

        //        целочисленный 8-й
        //        целочисленный 10-й
        //        целочисленный 16-й
        //        литерал типа float
        float fl = 5.0F;
        System.out.println(fl);
        //        литерал типа double.
        double dub = 5.1;
        System.out.println(dub);
    }


    /**
     * 1. Метод должен вернуть сумму двух чисел a и b
     * 2. Дополнительно: сделать проверку если сумма a и b больше чем максимальное значение int то вернуть -1
     **/
    public static int sum(int a, int b) {
        if ((long) a + b > Integer.MAX_VALUE) {
            return -1;
        }
        return a + b;
    }


    /**
     * Метод должен вернуть максимальное значение из двух чисел
     *
     * <p>
     * Example1:
     * a = 4,
     * b = 5
     * <p>
     * Метод должен вернуть 5
     * Example2:
     * a = 10,
     * b = 10
     * <p>
     * Метод должен вернуть 10
     */
    public static int max(int a, int b) {
        if (a >= b) {
            return a;
        }
        return b;
    }


    /**
     * Используя теорему Пифагора, вычислите значение гипотенузы. Квадрат гипотенузы = сумме квадратов катетов
     * <p>
     * Example1:
     * 3
     * 4
     * return 5
     * <p>
     * Example2:
     * 12
     * 16
     * return 20
     */
    public static double calculateHypotenuse(int a, int b) {
        //        return Math.sqrt(a * a + b * b);
        return Math.hypot(a, b);
    }
}

