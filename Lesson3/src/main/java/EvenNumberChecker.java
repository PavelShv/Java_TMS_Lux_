//Создать программу, которая будет сообщать, является ли целое число, введённое пользователем,
// чётным или нет. Ввод числа осуществлять с помощью класса Scanner.
// Если пользователь введёт не целое число, то сообщать ему об ошибке.

import java.util.Scanner;

public class EvenNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");

        if (scanner.hasNextInt()) {
            int value = scanner.nextInt();
            if (value % 2 == 0) {
                System.out.println("Число " + value + " является четным.");
            } else {
                System.out.println("Число " + value + " не является четным.");
            }
        } else {
            System.out.println("Ошибка! Введено не целое число.");
        }

        scanner.close();
    }
}

