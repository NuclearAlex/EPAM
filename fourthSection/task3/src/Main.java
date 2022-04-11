import customer.Customer;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Customer[] customers = new Customer[]{
                new Customer(1, "Golovko", "Max", "Vladimirovich",
                        "Ilicha 179", 23, 1616),
                new Customer(2, "Eutushkov", "Alex", "Sergeevich",
                        "Ilicha 168", 5, 5552),
                new Customer(3, "Afonchenko", "Ihar", "Petrovich",
                        "Kosmonautov 14", 148, 55564),
                new Customer(4, "Penkovskiy", "Anton", "Artemovich",
                        "Melezha 76", 318, 3759),
                new Customer(5, "Atroshko", "Pavel", "Olegovich",
                        "Sosnovaya 321", 1121, 5456)
        };

        System.out.println("Print array:");
        printDataOfArray(customers);

        System.out.println("\nPrint array sorted by surname:");
        printDataOfSortedArray(customers);

        System.out.println("\nInfo about requested cards:");
        infoAboutCards(customers);
    }

    private static void printDataOfArray(Customer[] customers) {
        for (Customer c : customers) {
            System.out.println(c);
        }
    }

    private static void printDataOfSortedArray(Customer[] customers) {

        // Variant 1
        Comparator<Customer> comp = Comparator.comparing(Customer::getSurName);

        // Variant 2
//        Comparator<Customer> comp = (o1, o2) -> {
//            int x = 0;
//            for (int i = 0; i < o1.getSurName().length() - 1; i++) {
//                x = Character.compare(o1.getSurName().charAt(i), o2.getSurName().charAt(i));
//                if (x == 0) {
//                    x += Character.compare(o1.getSurName().charAt(i + 1), o2.getSurName().charAt(i + 1));
//                } else {
//                    break;
//                }
//            }
//            return x;
//        };
        Arrays.sort(customers, comp);
        printDataOfArray(customers);
    }

    private static void infoAboutCards(Customer[] customers) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter first value: ");
        int x = scanner.nextInt();
        System.out.print("Please, enter last value: ");
        int y = scanner.nextInt();
        int counter = 0;
        for (Customer cus : customers) {
            if (cus.getNumberOfCard() >= x && cus.getNumberOfCard() <= y) {
                System.out.println(cus);
                counter++;
            }
        }
        if (counter == 0) {
            System.err.println("Sorry, but cards satisfied your request not found");
        }
    }
}
