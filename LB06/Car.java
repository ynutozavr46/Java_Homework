package LB06;

public abstract class Car {
    protected String model;
    protected String color;
    protected int maxSpeed;

    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public abstract void brake();

    public void gas() {
        System.out.println("Газуємо!");
    }

    public static void main(String[] args) {
        Sedan sedan = new Sedan("Sedan Model", "Red", 200);
        sedan.brake();
        sedan.gas();

        Truck truck = new Truck("Truck Model", "Blue", 100);
        truck.brake();
        truck.gas();
    }
}

class Sedan extends Car {
    public Sedan(String model, String color, int maxSpeed) {
        super(model, color, maxSpeed);
    }

    public void brake() {
        System.out.println("Седан гальмує.");
    }
}

class Truck extends Car {
    public Truck(String model, String color, int maxSpeed) {
        super(model, color, maxSpeed);
    }

    public void brake() {
        System.out.println("Грузовик гальмує.");
    }
}
