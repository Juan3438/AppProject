import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;


public class Controller
{
    @FXML
    private ImageView pikachu;

    public void makePikachu(MouseEvent c, String imageName) {
        Picture pic = new Picture("Pikachu.jpg");
    }
    public void makeJellyfish(MouseEvent c) {
        Picture pic = new Picture("jellyfish.jpg");
    }
    public void makeMotor(MouseEvent c) {
        Picture pic = new Picture("redMotorcycle.jpg");
    }
    public void makeFlower(MouseEvent c) {
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