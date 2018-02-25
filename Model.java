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
    private int[] intArray;
    private int arraySize;
    //methods
    // this method resets the integer array to an array of the given size filled with values from 1 --> size
    // and returns an array to be eq
    public int[] reset (int size){
        int [] temp = new int[size];
        
        for (int i = 0 ; i < size; i ++){
            temp[i]= (int )(Math.random() * size + 1);
            boolean matchFound = false ;
            
            for (int y = 0; y < size;y++){
                if(temp[i] == temp[y]){ // if the newest 
                    matchFound = true;
                }
            }
            if (matchFound = true){
                i--;
            }
        }
        
        return temp;
    }
    
    public int[] getUnSortedList(){
        return intArray;
    }
    
    public int getArraySize(){
        return arraySize;
    }
    
    public void setArraySize(int size){
        arraySize = size;
    }
}
