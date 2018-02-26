/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Slider;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

/**
 *
 * @author Sean_2
 */
public class SortingsViewController implements Initializable {

    //member variables
    @FXML
    private Button resetBtn;

    @FXML
    private Canvas recCanvas;

    @FXML
    private Label ArraySizeLabel;

    @FXML
    private Slider arraySizeSlider;

    @FXML
    private Button sortBtn;

    @FXML
    private ComboBox<String> algoComBox;

    private Model _model;

    private SortingStrategy sortingMethod;

    // member functions
    @FXML
    public void setSortStrategy() {
        if ("Selection Sort".equals(algoComBox.getValue())) { // selection Sort has been chosen
            this.sortingMethod = new SelectionSort();
        } else { // merge sort has been selected
            this.sortingMethod = new MergeSort();
        }
        //sortingMethod = new 
    }

    //hhhh
    @FXML
    public void arraySizeBar_ValueChanged() {
        this.ArraySizeLabel.setText(Integer.toString((int) this.arraySizeSlider.getValue()));

    }

    @FXML
    public void resetBtnClick() {
        _model.reset((int) this.arraySizeSlider.getValue()); // call the reset function
    }

    @FXML
    public void SortBtnClick() {
        //sortingMethod.sort(model.getUnSortedList());
        drawShapes();
    }

    @FXML
    public void RandomThenDraw() {
        //model.reset((int)this.arraySizeSlider.getValue());
        // Need to randmize and set the array 
        // Need to then draw the array to screen.

    }

    public void drawShapes() {//int[] a ){
        GraphicsContext g = recCanvas.getGraphicsContext2D();
        // g.fillRect(400,400,10,1000);
        //g.fill
        int size = 10;
        for (int i = 0; i < size; i++) {

            g.fillRect((recCanvas.widthProperty().getValue() * i / size) + 2, //x position
                    recCanvas.heightProperty().getValue() - (recCanvas.heightProperty().getValue() / size) * i, // y position
                    (recCanvas.widthProperty().getValue() / size) - 2, // width
                    (recCanvas.heightProperty().getValue() / size) * i); // height

        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // set the items in the combo box
        algoComBox.getItems().removeAll(algoComBox.getItems());
        algoComBox.getItems().addAll("Selection Sort", "Merge Sort");
        _model = new Model();
    }

}
