/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 *
 * @author Sean_2
 */
public class Model {
   //member variables
    private int[] array;
    private int arraySize;
    //methods
    // constructor
    public Model(){
      arraySize = 50;
      reset(arraySize);
    }
    // this method resets the integer array to an array of the given size filled with values from 1 --> size
    // and returns an array to be eq
    public int[] reset (int size){
        arraySize = size;
        //int [] temp = new int[size];
        array = new int [arraySize];
        for (int i = 0 ; i < arraySize; i ++){
            array[i]= (int )(Math.random() * arraySize + 1);
            boolean matchFound = false ;
            
            for (int y = 0; y < arraySize;y++){
                if(array[i] == array[y]){ // if the newest 
                    matchFound = true;
                }
            }
            if (matchFound == true){
                i--;
            }
        }
        for (int i = 0 ; i < arraySize; i++){
            System.out.println(Integer.toString(array[i]));
        }
        
        
        return array;
    }
    
    public int[] getUnSortedList(){
        return array;
    }
    
    public int getArraySize(){
        return arraySize;
    }
    
    public void setArraySize(int size){
        arraySize = size;
    }
}
