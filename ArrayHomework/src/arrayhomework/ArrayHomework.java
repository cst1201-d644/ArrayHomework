/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayhomework;

import java.util.Scanner;

/**
 *
 * @author class
 */
public class ArrayHomework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double sum = 0.0;
        double sd = 0.0;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is the number for students? ");
        int numStudents = keyboard.nextInt();
        int[] students = new int[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.print("What grade each student got? ");
            students[i] = (int) keyboard.nextDouble();
            sum = sum + students[i];
        }

        System.out.println();

        double average = sum / students.length;
        System.out.println("Students average: " + average);
        for (int i = 0; i < numStudents; i++) {
            sd += ((students[i] - average) * (students[i] - average)) / (students.length - 1);
        }
        double standardDev = Math.sqrt(sd);
        System.out.println("Standard Deviation: " + standardDev);
        System.out.println();
    }
}
