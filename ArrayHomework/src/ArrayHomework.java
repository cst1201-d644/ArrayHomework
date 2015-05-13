/*
 Ask user for the number of students.
 Ask the user for each of the students’ grades.
 Print out the class average and standard deviation.
 */

import java.util.Scanner;

/**
 *
 * @author Jianlang Lin
 */
public class ArrayHomework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numtests;
        int[] test;
        double average = 0.0;
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
        System.out.println("Here are the average of tests:");
        System.out.println(average);

    }

}
