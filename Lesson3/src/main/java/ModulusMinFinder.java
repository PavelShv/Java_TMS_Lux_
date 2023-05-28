import java.util.Scanner;
//3) Меньшее по модулю число
//Создать программу, которая будет выводить на экран меньшее по модулю из трёх введённых
// пользователем вещественных чисел с консоли.

public class ModulusMinFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double number1 = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double number2 = scanner.nextDouble();
        System.out.print("Введите третье число: ");
        double number3 = scanner.nextDouble();

        double modulusMin = findModulusMin(number1, number2, number3);
        System.out.println("Меньшее по модулю число: " + modulusMin);
    }

    public static double findModulusMin(double num1, double num2, double num3) {
        double modulus1 = Math.abs(num1);
        double modulus2 = Math.abs(num2);
        double modulus3 = Math.abs(num3);

        double minModulus = Math.min(modulus1, Math.min(modulus2, modulus3));

        if (minModulus == modulus1) {
            return num1;
        } else if (minModulus == modulus2) {
            return num2;
        } else {
            return num3;
        }
    }
}
