package calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class GUI {

    @FXML
    Button btn_start_new;
    @FXML
    Button btn_start_load;
    @FXML
    Button btn_start_delete;

    /*@Override
    public void initialize(URL location, ResourceBundle resources)
    {

    }*/

    @FXML
    private void handle_button(ActionEvent e) throws IOException
    {
        if(e.getSource() == btn_start_new)
        {
            System.out.println("Hit new button");
            launch_new(e);
        }
    }

    private void launch_new(ActionEvent e) throws IOException
    {
        Parent pane = FXMLLoader.load(getClass().getResource("CalcUI.fxml"));
        Stage stage = (Stage) btn_start_new.getScene().getWindow();
        stage.setTitle("Calculating semester");
        stage.setScene(new Scene(pane));
        stage.show();
    }
}
