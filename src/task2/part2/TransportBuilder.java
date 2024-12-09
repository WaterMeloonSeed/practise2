package task2.part2;

import java.util.ArrayList;

public abstract class TransportBuilder {
    protected Transport transport;

    public abstract void setBasicParams(String routeName, String routeDescription, int passengerCapacity);
    public abstract void setStatusParams(TransportStatus status);
    public abstract void setAmenityParams(ArrayList<String> amenities, boolean hasWiFi, boolean hasAirConditioning);
    public abstract void setDescription(String description);
    public abstract Transport build();
}
