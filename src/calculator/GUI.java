package calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class GUI {

    public Calculator current;

    @FXML
    Button btn_start_new;
    @FXML
    Button btn_start_load;
    @FXML
    Button btn_start_delete;

    @FXML
    TextField txtfld_new_semester;
    @FXML
    Button btn_new_create;
    @FXML
    Label lbl_new_semester;
    @FXML
    Button btn_new_cancel;

    @FXML
    Label lbl_calc_semester_value;

    @FXML
    private void handle_button(ActionEvent e) throws IOException                // Handles Button actions
    {
        if(e.getSource() == btn_start_new)
        {
            launch_new();
        }
        else if(e.getSource() == btn_new_create)
        {
            String semester = txtfld_new_semester.getText();
            System.out.println(semester);
            current = new Calculator(semester);
            launch_calculator();
        }
        else if(e.getSource() == btn_new_cancel)
        {
            System.out.println("hit cancel");
            launch_start();
        }
    }

    private void launch_new() throws IOException                                    // executed from btn_start_new
    {

        Parent pane = FXMLLoader.load(getClass().getResource("newSemester.fxml"));
        Stage stage = (Stage) btn_start_new.getScene().getWindow();
        stage.setTitle("enter semester");
        stage.setScene(new Scene(pane));
        stage.show();

    }

    private void launch_start() throws IOException                                  // executed from btn_new_cancel
    {
        Parent pane = FXMLLoader.load(getClass().getResource("startMenu.fxml"));
        Stage stage = (Stage) btn_new_cancel.getScene().getWindow();
        stage.setTitle("HD's Grade Calculator");
        stage.setScene(new Scene(pane));
        stage.show();

    }

    private void launch_calculator() throws IOException                             // executed from btn_new_create
    {
        Parent pane = FXMLLoader.load(getClass().getResource("calcSemester.fxml"));
        Stage stage = (Stage) btn_new_create.getScene().getWindow();
        stage.setTitle("Semester Calculator");
        stage.setScene(new Scene(pane));
        stage.show();

        if(lbl_calc_semester_value == null)
        {
            System.out.println("Semester lbl is null");
        }
        else
        {
            System.out.println("NOPE");
        }
    }
}
