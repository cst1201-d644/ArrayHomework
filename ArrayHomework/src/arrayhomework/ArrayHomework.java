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
        double average = 0.0;
        double calculation = 0.0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        numOfStudents = keyboard.nextInt();
        int[] students = new int[numOfStudents];

        for (int i = 0; i < numOfStudents; i++) {
            System.out.println("Enter the grade for each student: ");
            students[i] = keyboard.nextInt();

            sum = sum + students[i];

        }
        System.out.println();

        average = sum / students.length;
        System.out.println("The class average is " + average + ".");

        for (int i = 0; i < numOfStudents; i++) {
            calculation += ((students[i] - average) * (students[i] - average) / numOfStudents);
        }

        double standardDev = Math.sqrt(calculation);

        System.out.println("The standard deviation of the class average is: " + standardDev);

    }

}
