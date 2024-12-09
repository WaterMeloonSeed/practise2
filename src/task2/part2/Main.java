package task2.part2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String chooseTransportType;
        Transport vehicle = new Transport();

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter transport type (BUS/TRAM): ");
            chooseTransportType = scanner.next().toLowerCase();
        } while (!chooseTransportType.equals("bus") && !chooseTransportType.equals("tram"));

        TransportBuilder builder;

        if (chooseTransportType.equals("bus")) {
            builder = new BusBuilder(vehicle);
        } else {
            builder = new TramBuilder(vehicle);
        }

        builder.setBasicParams("Route 25", "Downtown to Uptown", 60);

        ArrayList<String> amenities = new ArrayList<>();
        amenities.add("WiFi");
        amenities.add("Air Conditioning");
        builder.setAmenityParams(amenities, true, true);

        TransportStatus status = new TransportStatus(true, true, false);
        builder.setStatusParams(status);

        builder.setDescription("Modern public transport with all amenities");

        builder.build();
    }
}
