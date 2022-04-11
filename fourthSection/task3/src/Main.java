import customer.Customer;
import customer.ListOfCustomers;

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
        ListOfCustomers list  = new ListOfCustomers(customers);

        System.out.println("Print array:");
        ListOfCustomers.printDataOfArray(list.getCustomers());

        System.out.println("\nPrint array sorted by surname:");
        ListOfCustomers.printDataOfSortedArray(list.getCustomers());

        System.out.println("\nInfo about requested cards:");
        ListOfCustomers.infoAboutCards(list.getCustomers());

    }
}
