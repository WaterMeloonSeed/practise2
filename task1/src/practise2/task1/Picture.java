package practise2.task1;

public class Picture {
    private String _name;
    private int _year;
    private String _author;

    public Picture(String name, int year, String author){
        this._name = name;
        this._year = year;
        this._author = author;
    }

    public String get_name() {
        return _name;
    }

    public int get_year() {
        return _year;
    }

    public String get_author() {
        return _author;
    }

    @Override
    public String toString() {
        return "Pic: " + "name = " + _name + ' ' + " year = " + _year + " author = " + _author;
    }
}
