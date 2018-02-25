/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Slider;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

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
    
    private Model model;
  
    private SortingStrategy sortingMethod;
    
    
    
     // member functions
    @FXML
    public void setSortStrategy(){
        if ("Selection Sort".equals(algoComBox.getValue())){ // selection Sort has been chosen
            this.sortingMethod = new SelectionSort(); 
        } else { // merge sort has been selected
            this.sortingMethod = new MergeSort();
        }
        //sortingMethod = new 
    }
    
    @FXML
    public void arraySizeBar_ValueChanged(){
        this.ArraySizeLabel.setText(Integer.toString((int)this.arraySizeSlider.getValue()));
        
        
    }
    @FXML
    public void resetBtnClick(){
        model.reset((int)this.arraySizeSlider.getValue()); // call the reset function
    }
    @FXML
    public void SortBtnClick(){
        sortingMethod.sort(model.getUnSortedList());
    }

    
    public void drawShapes(int[] a ){
        
    }
    @Override
   public void initialize(URL url, ResourceBundle rb){
       // set the items in the combo box
        algoComBox.getItems().removeAll(algoComBox.getItems());
        algoComBox.getItems().addAll("Selection Sort","Merge Sort");
}
    
    
    
    
    
    
    
    
    
//       @FXML
//    public void cancel() {
//        Stage stage = (Stage) cancelBtn.getScene().getWindow();
//        stage.close();
//    }
    
    
}
