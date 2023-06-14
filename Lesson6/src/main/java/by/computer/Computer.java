package by.computer;

public class Computer {
    private String processor;
    private int memory;
    private int hardDisk;
    private int totalCycles;

    public Computer(String processor, int memory, int hardDisk, int totalCycles) {
        this.processor = processor;
        this.memory = memory;
        this.hardDisk = hardDisk;
        this.totalCycles = totalCycles;
    }

    public void turnOn() {
        System.out.println("Компьютер включен.");
    }

    public void turnOff() {
        System.out.println("Компьютер выключен.");
    }

    public void printComputerSpecs() {
        System.out.println("Характеристики компьютера:");
        System.out.println("Процессор: " + processor);
        System.out.println("Оперативная память: " + memory + " ГБ");
        System.out.println("Жесткий диск: " + hardDisk + " ГБ");
        System.out.println("Ресурс полных циклов работы: " + totalCycles);
    }

    public static void main(String[] args) {
        Computer myComputer = new Computer("Intel Core i7", 8, 500, 1000);
        myComputer.turnOn();
        myComputer.printComputerSpecs();
        myComputer.turnOff();
    }
}
