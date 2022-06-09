package org.Helper;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Helper {

    public int getSortOption() {
        int usrChoice=0;
        String input = "";

        System.out.println("Sort Alogirths");
        System.out.println("1. Bubble");
        System.out.println("2. BinaryTree");
        System.out.println("3. Merge");
        System.out.println("");
        System.out.println("Please enter your option 1-3, 0 to exit: ");

        usrChoice = getSystemIn();

        while (usrChoice  != 0) {
            if(usrChoice > 3 || usrChoice < 0) {
                System.out.println("Invalid Option, Please enter your option 1-3, 0 to exit : ");
                usrChoice = getSystemIn();
            } else if (usrChoice >= 1 && usrChoice <= 3) {
                return usrChoice;
            }
        }

        return usrChoice;
    }

    public int getArryaSize() {

        int usrChoice=0;

        System.out.println("Please enter the size of the array, value should be greater than 0, 0 to exit: ");

        usrChoice = getSystemIn();

        while (usrChoice  != 0 ) {
            if(usrChoice < 0) {
                System.out.println("Invalid Option, Please enter the size of the array, value should be greater than 0, 0 to exit: ");
                usrChoice = getSystemIn();
            } else if (usrChoice >= 1 ) {
                return usrChoice;
            }
        }

        return usrChoice;
    }

    public int generateRandNum() {
        Random random = new Random();
        return random.nextInt(100);
    }

    public int[] generateRandIntArray(int arraySize) {
        int[] sortArray = new int[arraySize];
        for (int i=0 ; i < arraySize ; i++) {
            int randNum = generateRandNum() + 1;
             sortArray[i] = randNum * (i+1);
        }
        return sortArray;
    }

    public String convertIntArraytoString(int [] inputArray) {
        String ArrayItems="";
        for (int elem : inputArray) {
            ArrayItems +=  elem + " ";
        }
        return ArrayItems;
    }

    public int getSystemIn() {
        Scanner scanner = new Scanner(System.in);
        int usrChoice=0;
        try {
            String rawinput = scanner.nextLine();
            usrChoice = Integer.parseInt(rawinput);
        } catch(Exception e){
//          System.out.println("Invalid Option, Rerun the program again.... : ");
            usrChoice = -1;
        }

        return usrChoice;
    }
}
