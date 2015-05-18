/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayhomework;

import java.util.Scanner;

/**
 *
 * @author anualli
 */
public class ArrayHomework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		int values;
		
                
                
                // This determines the array length.
		System.out.println("Input number of students."); 
		values = input.nextInt();
		
		int[] array = new int[values]; 
		
		System.out.println("Input eachstudents’ grades.");
                
                 // Array identifies all values in it.
		for (int counter = 0; counter < array.length; counter++) {
			array[counter] = input.nextInt(); 
		}
                
                
		 
                 //print grade average 
                
                  int grade = (int) (Math.round(values)/ 4.0); 
               System.out.println(""); 
            
                
                    
                    
                }
                
             
		}

 
 

        
        
        
        
        
    
    

