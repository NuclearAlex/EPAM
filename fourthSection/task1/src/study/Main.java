package study;

import study.train.ComparatorForNumbers;
import study.train.ComparatorForPoints;
import study.train.Train;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Train[] trains = new Train[]{
                new Train("Minsk", 101, new Date(122, Calendar.JUNE, 8, 22, 15, 0)),
                new Train("Homiel", 323, new Date(122, Calendar.JUNE, 5, 14, 16, 0)),
                new Train("Brest", 707, new Date(122, Calendar.JUNE, 10, 16, 5, 0)),
                new Train("Grodno", 247, new Date(122, Calendar.JUNE, 16, 6, 10, 0)),
                new Train("Mogilev", 64, new Date(122, Calendar.JUNE, 11, 10, 34, 0))
        };
        System.out.println("    All have of trains before sort:");
        showDataOfArray(trains);

        ComparatorForNumbers comp = new ComparatorForNumbers();
        Arrays.sort(trains, comp);
        System.out.println("\n    All have of trains after sort on number:");
        showDataOfArray(trains);

        ComparatorForPoints comp1 = new ComparatorForPoints();
        Arrays.sort(trains, comp1);
        System.out.println("\n    All have of trains after sort on name of point:");
        showDataOfArray(trains);

        printDataAboutTrainByEnteredNumber(trains);
    }

    private static void printDataAboutTrainByEnteredNumber(Train[] trains) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n    Please, enter number from 1 to 999: ");
        try {
            int enter = scanner.nextInt();
            if (enter <= 0 || enter >= 1000) {
                System.err.println("You entered invalid value");
                return;
            }
            // Variant 1
//            StringBuilder findTrain = new StringBuilder();
//            for (Train train : trains) {
//                if (enter != train.getNumberOfTrain()) {
//                } else {
//                    findTrain.append(train);
//                }
//            }
//            if (findTrain.length() == 0) {
//                System.err.println("Sorry, but train with this number not found");
//            } else {
//                System.out.println(findTrain);
//            }
            // Variant 2
            Train t = Arrays.stream(trains)
                    .filter(train -> enter == train.getNumberOfTrain())
                    .findFirst()
                    .orElse(null);
            if (t == null) {
                System.err.println("Sorry, but train with this number not found");
            } else {
                System.out.println(t);
            }
        } catch (InputMismatchException e) {
            System.err.println("You are stupid, because you entered string but query required enter digit");
        }
    }

    private static void showDataOfArray(Train[] trains) {
        for (Train train : trains) {
            System.out.println(train);
        }
    }
}
