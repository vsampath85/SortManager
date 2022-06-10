package org.Helper;

import Loggings.Logging;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.*;

public class Helper {
    private static final Logger logger = Logger.getLogger("My logger");

    public static int getSortOption() {
        int usrChoice=0;
        String input = "";
        logger.log(Level.INFO ," SortManager Project ");
        System.out.println("******************************************");
        System.out.println("               Sort Alogirths");
        System.out.println("******************************************");
        System.out.println("1. Bubble");
        System.out.println("2. BinaryTree");
        System.out.println("3. Merge");
        System.out.println("4. Bubble & BinaryTree");
        System.out.println("5. Bubble & Merge");
        System.out.println("6. BinaryTree & Merge");
        System.out.println("7. Binary, Bubble & Merge");
        System.out.println("******************************************");
        System.out.println("Please enter your option 1-7, 0 to exit: ");
        System.out.println("******************************************");

        usrChoice = getSystemIn();

        while (usrChoice  != 0) {
            if(usrChoice > 7 || usrChoice < 0) {
                System.out.println("Invalid Option, Please enter your option 1-7, 0 to exit : ");
                usrChoice = getSystemIn();
            } else if (usrChoice >= 1 && usrChoice <= 7) {
                return usrChoice;
            }
        }
        return usrChoice;
    }

    public static int getArryaSize() {

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

    public static int generateRandNum() {
        Random random = new Random();
        return random.nextInt(100);
    }

    public static int[] generateRandIntArray(int arraySize) {
        int[] sortArray = new int[arraySize];
        for (int i=0 ; i < arraySize ; i++) {
            int randNum = generateRandNum() + 1;
            if (randNum == 50) {
                randNum--;
            }
             sortArray[i] = randNum * (i+1);
        }
        return sortArray;
    }


    private static int getSystemIn() {
        Scanner scanner = new Scanner(System.in);
        int usrChoice=0;
        try {
            String rawinput = scanner.nextLine();
            usrChoice = Integer.parseInt(rawinput);
        } catch(Exception e){
            usrChoice = -1;
        }
        return usrChoice;
    }

    public static long getNanotime() {
        return System.nanoTime();
    }


    public static void logfile (Logger logger){
        try {
            Handler fileHandler = new FileHandler("src/main/java/Loggings/myLog.log",true);
            logger.addHandler(fileHandler);
            logger.setFilter(new Logging());
            fileHandler.setFormatter(new Logging());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
