/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayhomework;

import java.util.Scanner;

/**
 *
 * @author Jean-Luc
 */
public class ArrayHomework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a scanner object for keyboard input 
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the number of students?");
        
        final int Students = keyboard.nextInt(); // Number of students 
        int[] grades = new int[Students]; // Array of grades 
        
        // Ask user for student grades 
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("What is the grades for each of the student?");
        
    }
    
}
