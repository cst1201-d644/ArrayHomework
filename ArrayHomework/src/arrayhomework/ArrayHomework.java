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
        double arrayNum[];
        Scanner scan = new Scanner(System.in);
        double sum = 0;
        double average = 0;
        double sum2 = 0;

        // Ask user for the number of students.
        System.out.print("Enter the number of students: ");
        int count = scan.nextInt();
        arrayNum = new double[count];
        for (int i = 0; i < count; i++) {
        //Ask the user for each of the students’ grades.
            System.out.println("Enter the number of grades:");
            arrayNum[i] = scan.nextDouble();
            sum += arrayNum[i];
            sum2 += (Math.pow(arrayNum[i], 2));

        }
        //Ask the user for each of the students’ grades.
        average = sum / arrayNum.length;
        System.out.println(average);
        System.out.println("The average is: " + average);
        double standardDeviation = Math.sqrt((sum2 / count) - (Math.pow(average, 2)));
        System.out.println("The standard deviation is: " + standardDeviation);

    }
    
}
