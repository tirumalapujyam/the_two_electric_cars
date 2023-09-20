package cars;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class ConvertibleElectricCars extends ElectricCars{
    private boolean hasRoofOpen;

    public ConvertibleElectricCars(String model, String color, @NonNull Integer batteryCapacityInKWh,
                                   @NonNull Integer batteryRangeInMiles, @NonNull Integer chargingCapacityPerHourInMiles) {
        super(model, TYPE_CONVERTIBLE, color, batteryCapacityInKWh, batteryRangeInMiles, chargingCapacityPerHourInMiles);
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
