/*
 + Ask user for the number of students.
 + Ask the user for each of the students’ grades.
 + Print out the class average and standard deviation.
 */
package array.homework;

import java.util.Scanner;

/**
 *
 * @author JianLang Lin
 */
public class ArrayHomework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numtests;
        int[] test;
        double dec = 0.0, average = 0.0;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many tests do you have? ");//ask for users how many tests
        numtests = keyboard.nextInt();
        test = new int[numtests];//open a array for number of test

        for (int index = 0; index < test.length; index++) {
            System.out.print("Enter test score "
                    + (index + 1) + ": ");
            test[index] = keyboard.nextInt();//put each score into array
        }
        System.out.println();
        System.out.println("Here are the scores you entered:");
        for (int index = 0; index < test.length; index++) {
            System.out.print(test[index] + " ");
            average = average + test[index];//sum the number of tests

        }
        System.out.println();
        average = average / numtests;//calculate the average
        for (int num = 0; num < test.length; num++) {
            dec = dec + (test[num] - average) * (test[num] - average);
        }
        System.out.println("Here are the average of tests:");
        System.out.println(average);
        dec = Math.sqrt(dec * 1 / (numtests));
        System.out.println("The Standaed Devivation is:");
        System.out.println(dec);

    }
}
