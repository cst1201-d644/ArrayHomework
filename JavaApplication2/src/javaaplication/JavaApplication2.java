package javaaplication;

import java.util.Scanner;

/**
 *
 * @author Aleksandra M.
*/
public class JavaApplication2{

 public static void main(String[] args) {
 double sum = 0.0;
 double sd = 0.0;

 Scanner keyboard = new Scanner(System.in);
 System.out.print("How many students are in class? ");
 int numStudents = keyboard.nextInt();
 int[] students = new int[numStudents];

 for (int i = 0; i < numStudents; i++) {
 System.out.print("Enter the grade for each of the students: ");
 students[i] = (int) keyboard.nextDouble();

 sum = sum + students[i];
 }

System.out.println();

 double average = sum / students.length;
 System.out.println("The class average is: " + average);

 for (int i = 0; i < numStudents; i++) {
 sd += ((students[i] - average) * (students[i] - average)) / (students.length - 1);
 }

 double standardDev = Math.sqrt(sd);
 System.out.println("Standard Deviation is: " + standardDev);

 System.out.println();
 }
  }
    

