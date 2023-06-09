package LB01;
public class Car {
    private int horsepower;
    private double engineVolume;
    private String brand;
    private String model;
    private int year;
    // Додайте ще поля за необхідністю
    
    public Car(int horsepower, double engineVolume, String brand, String model, int year) {
        this.horsepower = horsepower;
        this.engineVolume = engineVolume;
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    
    public double getEngineVolume() {
        return engineVolume;
    }
    
    public int getHorsepower() {
        return horsepower;
    }
    
    public static void main(String[] args) {
        Car car1 = new Car(150, 2.0, "Toyota", "Camry", 2010);
        Car car2 = new Car(180, 2.5, "Honda", "Accord", 2012);
        // Додайте ще об'єкти Car за необхідністю
        
        // Додавання об'ємів двигуна
        double totalEngineVolume = car1.getEngineVolume() + car2.getEngineVolume(); // Додайте об'єми інших об'єктів Car за необхідністю
        System.out.println("Загальний об'єм двигуна: " + totalEngineVolume);
        
        // Додавання потужностей
        int totalHorsepower = car1.getHorsepower() + car2.getHorsepower(); // Додайте потужності інших об'єктів Car за необхідністю
        System.out.println("Загальна потужність: " + totalHorsepower);
    }
}
