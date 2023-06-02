public class FooBar {
    public static void main(String[] args) {
        int number = 15; // Пример входного числа (лучще 15)

        foobar(number); // Вызов метода для вывода строк в зависимости от условий
    }

    /**
     * Метод для вывода строк в консоли в зависимости от условий
     *
     * @param number число
     */
    public static void foobar(int number) {
        if (number % 3 == 0) {
            System.out.print("foo");
        }
        if (number % 5 == 0) {
            System.out.print("bar");
        }
    }
}
/*
В данном решении основной класс называется "FooBar".
В методе main определен пример входного числа number. Затем вызывается метод foobar, который выводит строки
в зависимости от условий. В данном случае, при числе 15 будет выведено "foobar" на консоль.


 */