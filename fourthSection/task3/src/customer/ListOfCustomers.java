package customer;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ListOfCustomers {
    private final Customer[] customers;

    public ListOfCustomers(Customer[] customers) {
        this.customers = customers;
    }
    public Customer[] getCustomers() {
        return customers;
    }
    @Override
    public String toString() {
        return Arrays.toString(customers);
    }

    public static void printDataOfArray(Customer[] customers) {
        for (Customer c : customers) {
            System.out.println(c);
        }
    }

    public static void printDataOfSortedArray(Customer[] customers) {
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

    public static void infoAboutCards(Customer[] customers) {
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
