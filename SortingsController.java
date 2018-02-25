/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author Sean_2
 */
public class SortingsController {
    
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
    private ComboBox<?> algoComBox;
    
    private Model model;
   // member functions
    @FXML
    public void setSortStrategy(){
        
    }
    
    @FXML
    public void arraySizeBar_ValueChanged(){
        
        this.ArraySizeLabel.setText("but");
        
        
    }
    @FXML
    public void resetBtnClick(){
        
    }
    @FXML
    public void SortBtnClick(){
        
    }
    
    
    
    
    
    
    
    
    
    
    
//       @FXML
//    public void cancel() {
//        Stage stage = (Stage) cancelBtn.getScene().getWindow();
//        stage.close();
//    }
    
    
}
