package LB07;
import java.util.ArrayList;
import java.util.Random;

class TaxiServiceHelper {
    public static Car getRandomCar(ArrayList<Car> cars) {
        Random random = new Random();
        int randomIndex = random.nextInt(cars.size());
        return cars.get(randomIndex);
    }
}