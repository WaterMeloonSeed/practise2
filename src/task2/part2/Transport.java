package task2.part2;

import java.util.ArrayList;

public class Transport {
    private String routeName;
    private String routeDescription;
    private int passengerCapacity;
    private String description;
    private ArrayList<String> amenities;
    private boolean hasWiFi;
    private boolean hasAirConditioning;
    private TransportStatus status;

    public Transport(String routeName, String routeDescription, int passengerCapacity, String description,
                     ArrayList<String> amenities, boolean hasWiFi, boolean hasAirConditioning, TransportStatus status) {
        this.routeName = routeName;
        this.routeDescription = routeDescription;
        this.passengerCapacity = passengerCapacity;
        this.description = description;
        this.amenities = amenities;
        this.hasWiFi = hasWiFi;
        this.hasAirConditioning = hasAirConditioning;
        this.status = status;
    }

    public Transport() {}

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public String getRouteDescription() {
        return routeDescription;
    }

    public void setRouteDescription(String routeDescription) {
        this.routeDescription = routeDescription;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<String> getAmenities() {
        return amenities;
    }

    public void setAmenities(ArrayList<String> amenities) {
        this.amenities = amenities;
    }

    public boolean hasWiFi() {
        return hasWiFi;
    }

    public void setHasWiFi(boolean hasWiFi) {
        this.hasWiFi = hasWiFi;
    }

    public boolean hasAirConditioning() {
        return hasAirConditioning;
    }

    public void setHasAirConditioning(boolean hasAirConditioning) {
        this.hasAirConditioning = hasAirConditioning;
    }

    public TransportStatus getStatus() {
        return status;
    }

    public void setStatus(TransportStatus status) {
        this.status = status;
    }
}
