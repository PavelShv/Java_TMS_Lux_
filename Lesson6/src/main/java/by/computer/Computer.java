package by.computer;

import java.util.Random;

public class Computer {
    private String processor;
    private int ram;
    private int hardDisk;
    private int cycleResource;

    public Computer(String processor, int ram, int hardDisk, int cycleResource) {
        this.processor = processor;
        this.ram = ram;
        this.hardDisk = hardDisk;
        this.cycleResource = cycleResource;
    }

    public void description() {
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Hard Disk: " + hardDisk + " GB");
        System.out.println("Cycle Resource: " + cycleResource);
    }

    public void on() {
        if (cycleResource <= 0) {
            System.out.println("Компьютер сгорел!");
            return;
        }

        if (cycleResource < 10) {
            System.out.println("Внимание! Ресурс компьютера исчерпан!");
        }

        Random random = new Random();
        System.out.println("Внимание! Введите 0 или 1:");
        int userInput = // получение ввода пользователя (можете добавить свой код для получения ввода)

        int randomValue = random.nextInt(2);
        if (userInput == randomValue) {
            System.out.println("Компьютер выключается.");
            cycleResource--;
        } else {
            System.out.println("Компьютер сгорел!");
            cycleResource = 0;
        }
    }

    public void off() {
        if (cycleResource <= 0) {
            System.out.println("Компьютер сгорел!");
            return;
        }

        System.out.println("Выключение компьютера.");
        cycleResource--;
        if (cycleResource <= 0) {
            System.out.println("Компьютер сгорел!");
        }
    }
}
