
import cars.ConvertibleElectricCars;
import cars.ElectricCars;

public class DriveCarsTest {

    public static void main(String[] args) {

        ElectricCars tesla_s = new ElectricCars("Tesla Model S", "Sedan",
                "White", 100, 500, 50);

        System.out.println(tesla_s.calculateRequiredChargingTime(580));


        ConvertibleElectricCars mercedes_amg = new ConvertibleElectricCars("Mercedes-AMG convertible",
                "Red", 80,300, 25);

    }

}
