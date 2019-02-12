public class Controller
{
    public static void makePic(String filename) {
        Picture pic = new Picture(filename);
    }

    public static void main(String[] args)
    {
        Picture pix = new Picture("Chrysanthemum.jpg");
    }

    public static void changeSrc(Picture pix, String filename)
    {
        pix.setFileName(filename);
    }

}