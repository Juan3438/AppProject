import javafx.fxml.FXML;

public class Controller
{
    @FXML
    public static void makePic() {
        Picture pic = new Picture("Pikachu.jpg");
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