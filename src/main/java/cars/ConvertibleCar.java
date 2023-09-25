package cars;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class ConvertibleCar extends ElectricCars{
    private boolean hasRoofOpen;

    public ConvertibleCar(String model, String type, String color, @NonNull Integer batteryCapacityInKWh,
                          @NonNull Integer batteryRangeInMiles, @NonNull Integer chargingCapacityPerHourInMiles) {
        super(model, type, color, batteryCapacityInKWh, batteryRangeInMiles, chargingCapacityPerHourInMiles);
        hasRoofOpen = false;
    }

    public void changeRoofPosition() {
        hasRoofOpen = !hasRoofOpen;
        if (hasRoofOpen) {
            System.out.println("Roof is now open.");
        } else {
            System.out.println("Roof is now closed.");
        }
    }

}
