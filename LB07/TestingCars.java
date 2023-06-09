package LB07;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class TestingCars {
    private ArrayList<Car> cars;
    public TestingCars() {
        super();
    }
    public void Init(){
        cars = GetCars();
    }

    public void LestDrive(){
        PrintInfo(cars);
    }
    public ArrayList<Car> GetCars()
    {
                ArrayList<Car> cars = new ArrayList<>();
        
                // Creating Car objects
                Driver driver1 = new Driver("John", 30, 10);
                Car car1 = new Car("Toyota", 150, driver1, 10000, 2015);
                cars.add(car1);
        
                Driver driver2 = new Driver("Emily", 28, 5);
                Car car2 = new Car("Honda", 120, driver2, 8000, 2018);
                cars.add(car2);
        
                // Create and add more Car objects here
        
                // Example of creating 10 cars
                Driver driver3 = new Driver("Michael", 35, 15);
                Car car3 = new Car("Ford", 180, driver3, 12000, 2017);
                cars.add(car3);
        
                Driver driver4 = new Driver("Sophia", 26, 3);
                Car car4 = new Car("BMW", 200, driver4, 15000, 2019);
                cars.add(car4);
        
                Driver driver5 = new Driver("Daniel", 31, 8);
                Car car5 = new Car("Mercedes", 220, driver5, 18000, 2020);
                cars.add(car5);
        
                Driver driver6 = new Driver("Olivia", 29, 4);
                Car car6 = new Car("Audi", 170, driver6, 11000, 2016);
                cars.add(car6);
        
                Driver driver7 = new Driver("David", 33, 12);
                Car car7 = new Car("Chevrolet", 140, driver7, 9000, 2014);
                cars.add(car7);
        
                Driver driver8 = new Driver("Emma", 27, 6);
                Car car8 = new Car("Nissan", 130, driver8, 7500, 2013);
                cars.add(car8);
        
                Driver driver9 = new Driver("Liam", 32, 9);
                Car car9 = new Car("Hyundai", 160, driver9, 10000, 2015);
                cars.add(car9);
        
                Driver driver10 = new Driver("Ava", 30, 7);
                Car car10 = new Car("Volkswagen", 150, driver10, 8500, 2012);
                cars.add(car10);
        
                return cars;
            }
    
    //print info about driver and car
    public void PrintInfo(ArrayList<Car> cars){
        Car randomCar = TaxiServiceHelper.getRandomCar(cars);
        System.out.println("Автомобіль марки " + randomCar.getBrand() + " з водієм " + randomCar.getDriver().getName() + " виїхав за вами.");

        // Виклик методу, який виведе повідомлення про прибуття водія
        driverArrived(randomCar.getDriver());
    }
    private static void driverArrived(Driver driver) {
        System.out.println("Водій " + driver.getName() + " прибув на місце.");
    }


    public void RepairEngineOfOldCars(Car[] cars){
        for(int i =0; i < cars.length/2;i++){
            cars[i].DoRepair();
            System.out.println("Increase old engines to 10 percent!");
        }
    }
   
    public void RepairEverySecondCar(Car[] cars){
        for(int i =0; i < cars.length/2;i++){
            cars[i].DoRepair();
            cars[i].IncreasePrice();
            System.out.println("Increase old engines to 10 percent and price to 5 percent!");

        }
    }
  
    public void CheckForCourse(Driver driver){
        if(driver.getAge() >= 25 && driver.getDrivingExperience() <5 )
        {
            driver.increaseDrivingExperience();
        }
        System.out.println("All drivers with small expirience were sent to course!");

    }
    
}