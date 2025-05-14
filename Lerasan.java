/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lerasan;

import java.util.*;

public class Lerasan {

  public static void main(String[] args) {
        int rows = 10; // Number of rows
        int cols = 10; // Number of columns

        int[][] matrix = new int[rows][cols];

        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (i + 1) * (j + 1);
            }
        }

        // Print the multiplication table
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%4d", matrix[i][j]); // Formatted output
            }
            System.out.println(); // New line after each row
        }
    }
}