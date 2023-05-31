public class CountOfProgrammers {
    public static void main(String[] args) {
        int count = 41; // Пример входного числа

        printProgrammersCount(count); // Вызов метода для вывода фразы в консоль
    }

    /**
     * Метод для вывода фразы в консоль в зависимости от количества программистов
     *
     * @param count количество программистов
     */
    public static void printProgrammersCount(int count) {
        int c10 = count % 10; // последняя цифра в числе
        int c100 = count % 100; // 2 последние цифры

        if (c10 == 1 && c100 != 11) {
            System.out.println(count + " программист");
        } else if (c10 >= 2 && c10 <= 4 && !(c100 >= 12 && c100 <= 14)) {
            System.out.println(count + " программиста");
        } else {
            System.out.println(count + " программистов");
        }
    }
}
