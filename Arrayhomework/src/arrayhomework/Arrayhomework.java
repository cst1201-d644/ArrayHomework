/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayhomework;

import java.util.Scanner;

/**
 *
 * @author MingJie
 */
public class Arrayhomework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double addition = 0.0;
        double standardDivision = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Students ");
        int addStudents = sc.nextInt();
        int[] students = new int[addStudents];
        for (int i = 0; i < addStudents; i++) {
            System.out.print("Enter each of the student's grades: ");
            students[i] = (int) sc.nextDouble();
            addition = addition + students[i];
        }
        System.out.println();
        double average = addition / students.length;
        System.out.println("The CLASS average is: " + average);
        for (int i = 0; i < addStudents; i++) {
            standardDivision += ((students[i] - average) * (students[i] - average)) / (students.length - 1);
        }
        double standardDev = Math.sqrt(standardDivision);
        System.out.println(" The Standard Deviation is : " + standardDev);
        System.out.println();
    }

}
