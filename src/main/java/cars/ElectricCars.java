package cars;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class ElectricCars implements Car{
    private String model;
    private String type;
    private String color;
    private Integer batteryCapacityInKWh;
    private Integer batteryRangeInMiles;
    private Integer chargingCapacityPerHourInMiles;
    private boolean hasRoofOpen;

    public ElectricCars(@NonNull String model, @NonNull String type, @NonNull String color,
                        @NonNull Integer batteryCapacityInKWh,
                        @NonNull Integer batteryRangeInMiles, @NonNull Integer chargingCapacityPerHourInMiles) {
        this.model = model;
        this.type = type;
        this.color = color;
        this.batteryCapacityInKWh = batteryCapacityInKWh;
        this.batteryRangeInMiles = batteryRangeInMiles;
        this.chargingCapacityPerHourInMiles = chargingCapacityPerHourInMiles;
        this.hasRoofOpen = !"Convertible".equalsIgnoreCase(type);
    }

    @Override
    public Integer calculateRequiredChargingTime(Integer distanceToBeCovered){
        int difference = Math.abs(batteryRangeInMiles - distanceToBeCovered);
        System.out.println(difference);
        int requiredChargingTime = (difference / chargingCapacityPerHourInMiles) + 1;
        System.out.println(requiredChargingTime);
        System.out.println(chargingCapacityPerHourInMiles);
        return requiredChargingTime > chargingCapacityPerHourInMiles ? chargingCapacityPerHourInMiles : requiredChargingTime;
    }
    @Override
    public Integer calculateRequiredChargingTime(Integer distanceToBeCovered, double threshold){

        int difference = Math.abs(batteryRangeInMiles - distanceToBeCovered);
        System.out.println(difference);
        int requiredChargingTime = (difference / chargingCapacityPerHourInMiles) + 1;
        System.out.println(requiredChargingTime);
        System.out.println(chargingCapacityPerHourInMiles);
        return requiredChargingTime > chargingCapacityPerHourInMiles ? chargingCapacityPerHourInMiles : requiredChargingTime;
    }


}
