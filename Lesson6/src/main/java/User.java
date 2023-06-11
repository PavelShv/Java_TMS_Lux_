public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String gender;

    // Конструктор класса User
    public User(String firstName, String lastName, int age, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    // Конструктор класса User с вызовом другого конструктора
    public User(String firstName, String lastName) {
        this(firstName, lastName, 0, "");
    }

    // Метод для получения полного имени пользователя
    public String getFullName() {
        return firstName + " " + lastName;
    }

    // Метод для увеличения возраста пользователя на указанное количество лет
    public void increaseAge(int years) {
        age += years;
    }

    // Помечаем метод как устаревший (deprecated)
    @Deprecated
    public void printUserInfo() {
        System.out.println("Name: " + getFullName());
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }

    public static void main(String[] args) {
        User user = new User("John", "Doe", 30, "Male");
        user.printUserInfo(); // Вызов устаревшего метода
        user.increaseAge(5);
        System.out.println("New age: " + user.age);
    }
}
