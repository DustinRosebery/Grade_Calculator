package calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by dustinrosebery on 12/20/16.
 */
public class Calculator implements Serializable {

    private static int num_categories;
    private static int num_assignments;

    private double total;
    private int subject_num;
    private int assign_num;
    private String letter;
    private ArrayList grades[][];

    @FXML Button btn_start_new;


    Calculator(int categories, int assign)
    {
        num_categories = categories;
        num_assignments = assign;
        
        total = 0.00;
        subject_num = 0;
        assign_num = 0;
        letter = "F";
        grades = new ArrayList[num_categories][num_assignments];

    }



    public static double calculate(double earned, double worth, double weight)
    {
        double total = (double) (earned / worth) * weight;
        return total;
    }

}
