package cars;

public interface Car {

    Integer calculateRequiredChargingTime(Integer distanceToBeCovered);
    Integer calculateRequiredChargingTime(Integer distanceToBeCovered, double threshold);
}
