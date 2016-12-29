package calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by dustinrosebery on 12/20/16.
 */
public class Calculator implements Serializable {

    private String semester;
    private static int num_categories;
    private static int num_assignments;
    private double total;
    private int subject_num;
    private int assign_num;
    private String letter;
    private ArrayList grades[][];

    Calculator(String semester)
    {
        this.semester = semester;
        num_categories = 0;
        num_assignments = 0;
        total = 0.00;
        subject_num = 0;
        assign_num = 0;
        letter = "F";
        grades = new ArrayList[num_categories][num_assignments];

    }

    public String getSemester()
    {
        return semester;
    }

    public double getTotal()
    {
        return total;
    }

    public String getLetter()
    {
        return letter;
    }


}
