package LB07;
import java.util.ArrayList;

import javax.lang.model.type.NullType;

public class Car {

    private String brand;
    private double enginePower;
    private Driver driver;
    private double price;
    private int year;

    public Car(String brand, double enginePower, Driver driver, double price, int year) {
        this.brand = brand;
        this.enginePower = enginePower;
        this.driver = driver;
        this.price = price;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void  DoRepair(){
        enginePower += enginePower * 0.1;
        IsRepaired = true;
    }

    public void IncreasePrice(){
        price += price * 0.05;
    }

    public void NewDriver(Driver _driver){
        if(IsRepaired == true)
            driver = _driver;
        
    }
    

    

    public Boolean IsRepaired = false;
    
    public static void main(String[] args) throws Exception {
        TestingCars a = new TestingCars();
        a.Init();
        a.LestDrive();
    }
}