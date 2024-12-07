package practise2.task1;

public class Main {
    public static void main(String[] args) {

        Gallery gal1 = Gallery.getInstance("The Metropolitan Museum of Art");

        Picture pic1 = new Picture("Mona Lisa", 1503, "Leonardo Da Vinchi");
        Picture pic2 = new Picture("The Third of May 1808", 1814, "Francisco Goya");
        Picture pic3 = new Picture("Woman with Dog", 1943, "Pablo Picasso");

        gal1.addPicture(pic1);
        gal1.addPicture(pic2);
        gal1.addPicture(pic3);

        gal1.set_article("Gallery " + gal1.get_name());
        System.out.println(gal1.get_article());

        System.out.println(gal1.getPicture("Mona Lisa"));
        System.out.println(gal1.describePicture(pic2));

        System.out.println("Gallery has this picture: ");
        System.out.println(gal1.getPictures().toString());

        gal1.removePicture(pic3);
        System.out.println("Picture after stoll: ");
        System.out.println(gal1.getPictures().toString());

        System.out.println("Picture Count: ");
        System.out.println(gal1.getPictureCount());



    }
}