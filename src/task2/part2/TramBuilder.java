package task2.part2;

import java.util.ArrayList;

public class TramBuilder extends TransportBuilder {

    public TramBuilder(Transport transport) {
        this.transport = transport;
    }

    @Override
    public void setBasicParams(String routeName, String routeDescription, int passengerCapacity) {
        transport.setRouteName(routeName);
        transport.setRouteDescription(routeDescription);
        transport.setPassengerCapacity(passengerCapacity);
    }

    @Override
    public void setStatusParams(TransportStatus status) {
        transport.setStatus(status);
    }

    @Override
    public void setAmenityParams(ArrayList<String> amenities, boolean hasWiFi, boolean hasAirConditioning) {
        transport.setAmenities(amenities);
        transport.setHasWiFi(hasWiFi);
        transport.setHasAirConditioning(hasAirConditioning);
    }

    @Override
    public void setDescription(String description) {
        transport.setDescription(description);
    }

    @Override
    public Transport build() {
        System.out.println("You have created a Tram instance for public transport!");
        return transport;
    }
}
