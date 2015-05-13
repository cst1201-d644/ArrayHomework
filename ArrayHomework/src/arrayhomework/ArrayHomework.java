/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayhomework;

import java.util.Scanner;

/**
 *
 * @author Evan Chin
 */
public class ArrayHomework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum = 0;
        int numOfStudents;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        numOfStudents = keyboard.nextInt();
        int[] students = new int[numOfStudents];

        for (int i = 0; i < numOfStudents; i++) {
            System.out.println("Enter the grades for each student correspondingly: ");
            students[i] = keyboard.nextInt();

            sum = sum + students[i];

        }
        System.out.println();

        double average = 0.0;
        average = sum / students.length;
        System.out.println("The class average is " + average + ".");
        
        

    }

}
