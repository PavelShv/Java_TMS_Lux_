import java.util.Scanner;

public class NumberDescription {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        long digitCount = String.valueOf(Math.abs((long) number)).length(); // Определяем количество цифр в числе
        String sign = (number >= 0) ? "положительное" : "отрицательное"; // Определяем знак числа

        System.out.println(number + " - это " + sign + " число, количество цифр = " + digitCount);

        scanner.close();
    }
}

