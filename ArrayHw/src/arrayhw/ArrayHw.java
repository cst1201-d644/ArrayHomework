/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayhw;

import java.util.Scanner;

/**
 *
 * @author Devya
 */
public class ArrayHw {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    double sum = 0;
        double SD = 0;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many student do you have? ");

        int numStudents = keyboard.nextInt();
        int[] students = new int[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter the students grades ");
            students[i] = (int) keyboard.nextDouble();
            sum = sum + students[i];

        }
        System.out.print("");
        // calculating the mean
        double average = sum / students.length;
        System.out.println("The average score of the students : " + average);

        for (int i = 0; i < numStudents; i++) {
            SD += ((students[i] - average) * (students[i] - average)) / (students.length - 1);
        }

        double standardDeviation = Math.sqrt(SD); //Calculating the Standard deviation
        System.out.println("The Standard Deviation is : " + standardDeviation);

        System.out.println();

    }
}
