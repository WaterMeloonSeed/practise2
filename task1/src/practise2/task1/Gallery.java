package practise2.task1;

import java.util.ArrayList;
import java.util.HashMap;

public class Gallery {
    private ArrayList<Picture> _picture = new ArrayList<>();
    private String _name;
    private String _article;
    private static HashMap<String, Gallery> _instance = new HashMap<>();

    private Gallery(String name){
        this._name = name;
    }

    public static Gallery getInstance(String name){
        if (!_instance.containsKey(name)) {
            Gallery gal = new Gallery(name);
            _instance.put(name, gal);
            return gal;
        } else {
            return _instance.get(name);
        }
    }

    public void addPicture(Picture picture){
        _picture.add(picture);
    }
    public void removePicture(Picture picture){
        _picture.remove(picture);
    }
    public String describePicture(Picture picture){
        return picture.toString();
    }

    public Picture getPicture(String name){
        for (Picture pic:
                _picture) {
            if (pic.get_name().equals(name)){
                return pic;
            }
        }
        return null;
    }
    public ArrayList<Picture> getPictures(){
        return _picture;
    }

    public long getPictureCount(){
        return _picture.size();
    }

    public String get_name() {
        return _name;
    }

    public String get_article() {
        return _article;
    }

    public void set_article(String _article) {
        this._article = _article;
    }
}

