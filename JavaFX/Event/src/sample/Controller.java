package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.awt.*;

public class Controller {
    @FXML
    private TextField nameField;
    @FXML
    private Button helloButton;
    @FXML
    private Button byeButton;
    @FXML
    public void initialize()
    {
        helloButton.setDisable(true);
        byeButton.setDisable(true);
    }

    public void onButtonClicked(ActionEvent e)
    {
        if(e.getSource().equals(helloButton))
            {System.out.println("Hello " + nameField.getText());}
        else if (e.getSource().equals(byeButton))
            {System.out.println("Bye " + nameField.getText());}

    }

    @FXML
    public void handleKeyReleased()
    {
        String text = nameField.getText();
        boolean disabledButton = text.isEmpty() || text.trim().isEmpty();
        helloButton.setDisable(disabledButton);
        byeButton.setDisable(disabledButton);
    }
}
