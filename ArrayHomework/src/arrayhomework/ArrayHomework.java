/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayhomework;

import java.util.Scanner;

/**
 *
 * @author GKundu
 */
public class ArrayHomework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double next = 0.0;
        double stndDev = 0.0;
        double avrg;
        int j = 1;

        System.out.print("Please enter number of Students: ");

        Scanner sc = new Scanner(System.in);
        int numOfStudents = sc.nextInt();
        int[] studnt = new int[numOfStudents];

        for (int i = 0; i < numOfStudents; i++) {

            System.out.print("What's the grade of student " + j++ + " :");
            studnt[i] = (int) sc.nextDouble();
            next = next + studnt[i];

        }

        System.out.println();

        avrg = next / studnt.length;
        System.out.println("The average grade of the class is : " + avrg);

        for (int i = 0; i < numOfStudents; i++) {

            stndDev = stndDev + ((studnt[i] - avrg)
                    * (studnt[i] - avrg)) / (studnt.length - 1);

        }

        System.out.println("The Standard Deviation of class grades is : " + Math.sqrt(stndDev));

        System.out.println();

    }

}
