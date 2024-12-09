package task1.part2;

public class AboutTransport {
    private String _carBrand;
    private int _seatsNumber;

    public AboutTransport(String _carBrand, int _seatsNumber) {
        this._carBrand = _carBrand;
        this._seatsNumber = _seatsNumber;
    }

    public String get_carBrand() {
        return _carBrand;
    }

    public int get_seatsNumber() {
        return _seatsNumber;
    }

    @Override
    public String toString() {
        return "AboutTranport{" +
                "_carBrand='" + _carBrand + '\'' +
                ", _seatsNumber=" + _seatsNumber +
                '}';
    }
}
