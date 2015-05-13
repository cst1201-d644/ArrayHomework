/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayhomework;

import java.util.Scanner;

/**
 *
 * @author Kenny Tsang
 */
public class ArrayHomework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numberOfStudent;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("The number of students: ");
        numberOfStudent = keyboard.nextInt();

        int input;
        int sum = 0;
        int[] grade = new int[numberOfStudent];

        for (int i = 1; i <= numberOfStudent; i++) {
            System.out.print("Student " + i + "'s grade: ");
            input = keyboard.nextInt();
            grade[i - 1] = input;
            sum += input;
        }

        int avg;
        avg = sum / numberOfStudent;
        double squaredMean = 0;

        for (int j = 1; j <= numberOfStudent; j++) {
            squaredMean += (grade[j - 1] - avg) * (grade[j - 1] - avg);
        }

        double squaredSum;
        squaredSum = squaredMean / numberOfStudent;
        double sd;
        sd = Math.sqrt(squaredSum);

        System.out.println("The average grade is: " + avg);
        System.out.printf("The standard deviation is: " + "%.2f" + "\n", sd);
    }
}
