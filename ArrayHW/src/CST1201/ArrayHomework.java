package CST1201;

import java.util.Scanner;

/**
 *
 * @author Francisco Latacela
 */
public class ArrayHomework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double addition = 0.0;
        double standarDivision = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Students? ");
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
            standarDivision += ((students[i] - average) * (students[i] - average)) / (students.length - 1);
        }
        double standardDev = Math.sqrt(standarDivision);
        System.out.println(" The Standard Deviation is : " + standardDev);
        System.out.println();
    }
}
