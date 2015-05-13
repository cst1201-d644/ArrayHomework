/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayhomework;

import java.util.Scanner;

/**
 *
 * @author Niaz Morshed
 */
public class ArrayHomeWork {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number of students : ");

        int numOfStudent = keyboard.nextInt();
        double students[] = new double[numOfStudent];

        double total = 0.0;
        double secondTotal = 0.0;

        for (int i = 0; i < numOfStudent; i++) {
            
            System.out.println("Enter the grade of student " + i + " : ");
            students[i] = keyboard.nextDouble();
            
            total += students[i];
            secondTotal += (Math.pow(students[i], 2));

        }
        double average = total / students.length;
        System.out.println("The average of the number is: " + average);

        double stdDeviation = Math.sqrt((secondTotal / numOfStudent) - (Math.pow(average, 2)));
        System.out.println("The standard deviation is: " + stdDeviation);

    }
}
