package task1.part2;

import java.util.ArrayList;
import java.util.HashMap;

public class Transport {
    private ArrayList<AboutTransport> _aboutTransopr = new ArrayList<>();
    private int _routeNumber;
    private String _workingHouse;
    private static HashMap<Integer, Transport> _instance = new HashMap<>();

    private Transport(int _routeNumber) {
        this._routeNumber = _routeNumber;
    }

    public static Transport getInstance(int routeNumber){
        if (!_instance.containsKey(routeNumber)) {
            Transport transport = new Transport(routeNumber);
            _instance.put(routeNumber, transport);
            return transport;
        } else {
            return _instance.get(routeNumber);
        }
    }

    public boolean addAboutTransport(AboutTransport sub){
        return _aboutTransopr.add(sub);
    }
    public boolean removeDishes(AboutTransport sub){
        return _aboutTransopr.remove(sub);
    }
    public String describeAbout(AboutTransport sub){
        return sub.toString();

    }

    public AboutTransport getTransport(String brand){
        for (AboutTransport transport:
                _aboutTransopr) {
            if (transport.get_carBrand().equals(brand)){
                return transport;
            }
        }
        return null;
    }

    public ArrayList<AboutTransport> get_aboutTransopr() {
        return _aboutTransopr;
    }

    public int get_routeNumber() {
        return _routeNumber;
    }

    public String get_workingHouse() {
        return _workingHouse;
    }

    public static HashMap<Integer, Transport> get_instance() {
        return _instance;
    }
}

