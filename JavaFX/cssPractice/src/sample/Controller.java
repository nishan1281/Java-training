package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;

import java.io.File;

public class Controller {
    @FXML
    private Label label;

    @FXML
    private Button button4;

    @FXML
    private GridPane gridPane;

    public void initialize()
    {
        button4.setEffect(new DropShadow());
    }

    @FXML
    public void onMouseEntered ()
    {
        label.setScaleX(2.5);
        label.setScaleY(2.5);
    }

    @FXML
    public void onMouseExited ()
    {
        label.setScaleX(1.0);
        label.setScaleY(1.0);
    }

    @FXML
    public void fileChooser()
    {
        FileChooser fileChooser = new FileChooser();
//        fileChooser.showOpenDialog(gridPane.getScene().getWindow());
        File file = fileChooser.showSaveDialog(gridPane.getScene().getWindow());
        if (file != null)
        {
            System.out.println(file.getPath());
        }
        else {
            System.out.println("not chose");
        }

    }


}
