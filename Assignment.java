/*
Name: Francis Obeng-Mensah
Section: 7;10 - 9;40
Professor: Anmol Dash
Date: 05/04/24
Description: This program contains three tasks:
Task 1: Takes 10 numbers from a user, stores them in an array, and lists them in reverse order.
Task 2: Checks if a list of numbers entered by the user is sorted in increasing order.
Task 3: Finds the index and values of the smallest and largest elements in a list of numbers provided by the user.
*/

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Task 1: Reverse Order
        System.out.println("Task 1: Reverse Order");
        int[] numbers = new int[10];
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Numbers in reverse order:");
        for (int i = 9; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\n");

        // Task 2: Check if Sorted
        System.out.println("Task 2: Check if Sorted");
        System.out.print("Enter the size of the list: ");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            list[i] = scanner.nextInt();
        }
        if (isSorted(list)) {
            System.out.println("The list is sorted.");
        } else {
            System.out.println("The list is not sorted.");
        }

        // Task 3: Find Smallest and Largest
        System.out.println("\nTask 3: Find Smallest and Largest");
        System.out.print("Enter the size of the list: ");
        size = scanner.nextInt();
        int[] numList = new int[size];
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numList[i] = scanner.nextInt();
        }
        int smallestIndex = findSmallestIndex(numList);
        int largestIndex = findLargestIndex(numList);
        System.out.println("Smallest number is " + numList[smallestIndex] + " at index " + smallestIndex);
        System.out.println("Largest number is " + numList[largestIndex] + " at index " + largestIndex);
    }

    // Method to check if a list is sorted
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    // Method to find index of smallest number in array
    public static int findSmallestIndex(int[] arr) {
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    // Method to find index of largest number in array
    public static int findLargestIndex(int[] arr) {
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}