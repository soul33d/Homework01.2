package com.homelearning;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayHolder {

    private int[] initialArray = new int[5];
    private int[] sortedArray;

    void execute(){
        readArrayFromInput();
        sortedArray = initialArray.clone();
        sortArray();
        printArray("Initial array:", initialArray);
        printArray("Sorted array:", sortedArray);
    }

    private void readArrayFromInput() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < initialArray.length; i++) {
            System.out.println(String.format("Enter number %d:", i + 1));
            if (scanner.hasNextInt()){
                initialArray[i] = scanner.nextInt();
            } else {
                System.out.println("Invalid input, please enter a number");
                i--;
            }
        }
        scanner.close();
    }

    private void printArray(String msg, int[] array){
        System.out.println(msg + Arrays.toString(array));
    }

    private void sortArray(){
        Arrays.sort(sortedArray);
    }
}
