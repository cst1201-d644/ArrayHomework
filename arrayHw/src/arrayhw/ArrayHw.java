/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayhw;

import java.util.Scanner;

/**
 *
 * @author DEE
 */
public class ArrayHw {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numberOfStudents;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        numberOfStudents = keyboard.nextInt();
        int userInput;
        int total = 0;
        int[] studentGrade = new int[numberOfStudents];
        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.print("Enter student's " + i + " grade: ");
            userInput = keyboard.nextInt();
            studentGrade[i - 1] = userInput;
            total += userInput;
        }
        int avg;
        avg = total / numberOfStudents;
        double squaredMean = 0;
        for (int j = 1; j <= numberOfStudents; j++) {
            squaredMean += (studentGrade[j - 1] - avg) * (studentGrade[j - 1] - avg);
        }
        double sumSquared;
        sumSquared = squaredMean / numberOfStudents;
        double standardDev;
        standardDev = Math.sqrt(sumSquared);

        System.out.println("Average: " + avg);
        System.out.printf("Standard deviation: " + "%.2f" + "\n", standardDev);
    }

}
