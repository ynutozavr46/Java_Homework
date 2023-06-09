package LB01;
public class User {
    private int id;
    private int age;
    private String name;
    private String surname;
    private double weight;
    private double height;
    
    public User(int id, int age, String name, String surname, double weight, double height) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.weight = weight;
        this.height = height;
    }
    
    public int getAge() {
        return age;
    }
    
    public double getWeight() {
        return weight;
    }
    
    public double getHeight() {
        return height;
    }

    public static void main(String[] args) {
        User user1 = new User(1, 25, "John", "Doe", 70.5, 175.0);
        User user2 = new User(2, 30, "Jane", "Smith", 65.2, 165.0);
        // Додайте ще об'єкти User за необхідністю
        
        // Додавання віку
        int totalAge = user1.getAge() + user2.getAge(); // Додайте вік інших об'єктів User за необхідністю
        System.out.println("Загальний вік: " + totalAge);
        
        // Додавання ваги
        double totalWeight = user1.getWeight() + user2.getWeight(); // Додайте вагу інших об'єктів User за необхідністю
        System.out.println("Загальна вага: " + totalWeight);
        
        // Додавання зросту
        double totalHeight = user1.getHeight() + user2.getHeight(); // Додайте зріст інших об'єктів User за необхідністю
        System.out.println("Загальний зріст: " + totalHeight);
    }
}
