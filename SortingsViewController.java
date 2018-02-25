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
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

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
    //hhhh
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
        //sortingMethod.sort(model.getUnSortedList());
        drawShapes();  
    }

    
    public void drawShapes(){//int[] a ){
       GraphicsContext g = recCanvas.getGraphicsContext2D();
      // g.fillRect(400,400,10,1000);
       //g.fill
       for (int i = 0 ; i < 10;i++){ //model.getArraySize();i++){
          // g.fillRect(10, 10, 20, 100);
        }

        g.fillRect(10, 10, 5, 100);
         g.fillRect(20, 10, 5, 100);
          g.fillRect(30, 10, 5, 100);
           g.fillRect(40, 10, 5, 100);
            g.fillRect(50, 10, 5, 100);
             g.fillRect(60, 10, 5, 100);
              g.fillRect(70, 10, 5, 100);
       
       
       
       
       
       
    }
    @Override
   public void initialize(URL url, ResourceBundle rb){
       // set the items in the combo box
        algoComBox.getItems().removeAll(algoComBox.getItems());
        algoComBox.getItems().addAll("Selection Sort","Merge Sort");
}
    
    
    
    
    
    
    
    
    

    
}
