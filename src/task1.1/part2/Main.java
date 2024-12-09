package task1.part2;

public class Main {
    public static void main(String[] args){

        AboutTransport car1 = new AboutTransport("Toyota", 40);
        AboutTransport car2 = new AboutTransport("Mercedes", 28);


        Transport transport1 = Transport.getInstance(101);
        Transport transport2 = Transport.getInstance(102);


        transport1.addAboutTransport(car1);
        transport2.addAboutTransport(car2);


        System.out.println("Transport 101 details:");
        for (AboutTransport about : transport1.get_aboutTransopr()) {
            System.out.println(transport1.describeAbout(about));
        }

        System.out.println("Transport 102 details:");
        for (AboutTransport about : transport2.get_aboutTransopr()) {
            System.out.println(transport2.describeAbout(about));
        }


        AboutTransport foundCar = transport1.getTransport("Toyota");
        if (foundCar != null) {
            System.out.println("Found in Transport 101: " + foundCar);
        }


        transport2.removeDishes(car2);
        System.out.println("After removal in Transport 102:");
        for (AboutTransport about : transport2.get_aboutTransopr()) {
            System.out.println(transport2.describeAbout(about));
        }

    }
}
