import java.util.Random;
/*

public class HomeWork {
    public static void main(String[] args) {


        //1) Задача на оператор switch!
        //        Рандомно генерируется число От 1 до 7.
        //        Если число равно 1, выводим на консоль “Понедельник”,
        2 –”Вторник” и так далее.
        //        Если 6 или 7 – “Выходной”.
        int value = new Random().nextInt(7) + 1;
        switch (value) {
            case 1:
                System.out.println("Пн");
                break;
            case 6, 7:
                System.out.println("Вых");
                break;
        }


Вот решение задачи на оператор switch в Java:
*/

public class DayOfWeek {
    public static void main(String[] args) {
        // Генерируем случайное число от 1 до 7
        int value = new Random().nextInt(7) + 1;

        // Используем оператор switch для вывода дня недели
        switch (value) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
            case 7:
                System.out.println("Выходной");
                break;
            default:
                System.out.println("Некорректное значение");
        }
    }
}

//        В данном решении мы генерируем случайное число от 1 до 7
//        и используем оператор switch для вывода соответствующего
//        дня недели или информации о выходном дне.