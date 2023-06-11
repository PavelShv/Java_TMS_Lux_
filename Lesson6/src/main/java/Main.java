public class Main {
    public static void main(String[] args) {
        // Создание экземпляра класса User
        User user = new User("John", "Doe", 30, "Male");

        // Вызов методов для получения полного имени, увеличения возраста и вывода информации о пользователе
        String fullName = user.getFullName();
        System.out.println("Full Name: " + fullName);

        user.increaseAge(5);
        System.out.println("New age: " + user.age);

        user.printUserInfo();
    }
}
