/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arrayhomework;

/**
 *
 * @author ziying guo
 */
import java.util.Scanner;
public class ArrayHomework {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
      
      int numStudent;    
      int[] grades;      
      int sum = 0;
      double average;
      
      Scanner key = new Scanner(System.in);

      System.out.print("How many students in your class? ");
      numStudent = key.nextInt();
      grades = new int[numStudent];

      for (int index = 0; index < grades.length; index++)
      {
         System.out.print("Enter student" +(index + 1) + "'s grade"+ ": ");
      grades[index] = key.nextInt();
      sum= (sum + grades[index]);  }
      average = (double)sum /numStudent;

      System.out.println();
      System.out.println("Here are the grades you entered:");
      for (int index = 0; index < grades.length; index++)
      { System.out.print(grades[index] + "   ");
      }
      System.out.println();
      System.out.println("The average is " + average );
   }
    
}