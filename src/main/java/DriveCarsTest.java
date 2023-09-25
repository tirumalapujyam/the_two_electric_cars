
import cars.Car;
import cars.ConvertibleCar;

import java.net.CacheRequest;

public class DriveCarsTest {
    public static void main(String[] args) {
        final double threshold = 20/100;
        Integer distanceToBeCovered = 570;

        ConvertibleCar tesla_s = new ConvertibleCar("Tesla Model S", "Sedan",
                "White", 100, 500, 50);

        System.out.println(tesla_s.calculateRequiredChargingTime(580, 0.20));


        ConvertibleCar mercedes_amg = new ConvertibleCar("Mercedes-AMG convertible","Convertible",
                "Red", 80,300, 25);


    }

}
