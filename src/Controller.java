import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


public class Controller
{
    @FXML
    private ImageView pikachu;

    public void makePikachu(MouseEvent c) {
        System.out.println("pit");
        Picture pic = new Picture("Pikachu.jpg");
    }
    public void makeJellyfish(MouseEvent c) {
        Picture pic = new Picture("jellyfish.jpg");
    }
    public void makeMotor(MouseEvent c) {
        Picture pic = new Picture("redMotorcycle.jpg");
    }
    public void makeFlower(MouseEvent c) {
        Picture pic = new Picture("Chrysanthemum.jpg");
    }
    public class Main extends Application {
        @Override
        public void start(Stage primaryStage) throws Exception {
            Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
            primaryStage.setTitle("Hello World");
            primaryStage.setScene(new Scene(root, 300, 275));
            primaryStage.show();
        }


        public static void main(String[] args) {
            launch(args);
        }
    }
    public static void changeSrc(Picture pix, String filename)
    {
        pix.setFileName(filename);
    }

    public void playDef(MouseEvent e, Picture pic)
    {
        pic.song();
    }

    public void playRed(Picture pic)
    {
        pic.songRed();
    }

    public void playBlue(Picture pic)
    {
        pic.songBlue();
    }

    public void playGreen(Picture pic)
    {
        pic.songGreen();
    }
}