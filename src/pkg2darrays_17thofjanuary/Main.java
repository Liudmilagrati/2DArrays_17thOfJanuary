/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2darrays_17thofjanuary;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] [] TwoDArray;
        TwoDArray = new int [5] [7]; /// 5 rows and 7 columns 
        
        int [][] AnotherArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};//size of the array is 4 by 3
        
        int [][] JaggedArray = { {1,2,3}, {4,5}, {6,7,8,9,} }; // is possibel to have different size in each row called Jagged Arrays, not very used but posible 
    
        int [][] NotSpecifiedSizes = new int [5][];// is possibel to only put teh fist size of teh inner array. Java will compail. But is better practise to add both dimmensions. 
    
        System.out.println(AnotherArray[1][0]); // index Array 1 and 0
        
        System.out.println(TwoDArray[1][0]); // 0 zero (int default value)
        
       // System.out.println(NotSpecifiedSizes[1][0]); // Second (inner) array is unallocated, so there is nothing to read
    
        double[] doubleArray = new double [10]; // 0.0 (double array default)
        System.out.println(doubleArray[4]);
        
        
        //create and initiliase the array 
        boolean[] booleanArray = new boolean [10]; //default value for boolean is false which means 0 zero
        System.out.println(booleanArray[4]);
        
        char[] charArray = new char[6];
        System.out.println(charArray[3]);// default will be blank space 
       
        String[] stringArray = new String[10];
        System.out.println(stringArray[4]); // default value will be null 
                
    }
    
}
