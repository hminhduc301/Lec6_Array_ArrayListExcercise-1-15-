package Lec6_Array;

import java.util.Scanner;
import java.util.*;

public class Ex1_MaximumAndMinimum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of array :");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.print("Enter " + n + " integers : ");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        if (n > 0) {

            int max = numbers[0];
            int min = numbers[0];

            for (int i = 1; i < n; i++) {

                if (numbers[i] > max) {
                    max = numbers[i];
                }

                if (numbers[i] < min) {
                    min = numbers[i];
                }
            }

            System.out.println("\nArray elements: ");
            for (int number : numbers) {
                System.out.print(number + " ");
            }
            System.out.println("\n");
            System.out.println("The maximum value is: " + max);
            System.out.println("The minimum value is: " + min);
        } else {
            System.out.println("The array is empty. No min or max value to display.");
        }

    }
}
