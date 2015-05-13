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
      
      int numTests;    
      int[] tests;      
      int sum = 0;
      double average;
      
      Scanner key = new Scanner(System.in);

      System.out.print("How many students in your class? ");
      numTests = key.nextInt();
      tests = new int[numTests];

      for (int index = 0; index < tests.length; index++)
      {
         System.out.print("Enter student" +(index + 1) + "'s grade"+ ": ");
      tests[index] = key.nextInt();
      sum= (sum + tests[index]);  }
      average = (double)sum /numTests;

      System.out.println();
      System.out.println("Here are the grades you entered:");
      for (int index = 0; index < tests.length; index++)
      { System.out.print(tests[index] + "   ");
      }
      System.out.println();
      System.out.println("The average is " + average );
   }
    
}