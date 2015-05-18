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
        System.out.print("What is the number of students? :");

        final int students = keyboard.nextInt(); // Number of students 
        int[] grades = new int[students]; // Array of grades 

        // Ask user for student grades 
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("What is the grades for each of the student?");

        //Get the grades by each of the students 
        for (int i = 0; i < students; i++) {
            System.out.print("Student" + (i + 1) + ": ");
            grades[i] = Keyboard.nextInt();
        }
        //Print the results
        System.out.println("The gardes you entered are:");

        for (int i = 0; i < students; i++) {
            System.out.println(grades[i]);

        }
        //Calculate the sum of the elements in the array
        double total = 0;
        double average;
        for (int i = 0; i < grades.length; i++) {
            total += grades[i];

        }
        //Calculate the average
        average = total / grades.length;

        //print the average
        System.out.println("Class average: " + average);

        //Calculate the standard deviation
        double sd = 0;
        for (int i = 0; i < grades.length; i++) {

            sd += ((grades[i] - average) * (grades[i] - average)) / (grades.length - 1);
        }
        //Pint the Standard Deviation
        double standardDeviation = Math.sqrt(sd);
        System.out.println("Standard Deviation: " + standardDeviation);

    }

}
