package customer;

public class Customer {
    public static final String RESET = "\u001b[0m";
    public static final String PURPLE = "\u001b[35m";
    public static final String BLUE = "\u001b[36m";

    private final int id;
    private final String surName;
    private final String middleName;
    private final String lastName;
    private final String address;
    private final int numberOfCard;
    private final int numberOfBank;

    public Customer(int id, String surName, String middleName, String lastName,
                    String address, int numberOfCard, int numberOfBank) {
        this.id = id;
        this.surName = surName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;
        this.numberOfCard = numberOfCard;
        this.numberOfBank = numberOfBank;
    }
    public String getSurName() {
        return surName;
    }
    public int getNumberOfCard() {
        return numberOfCard;
    }
    @Override
    public String toString() {
        return String.format("%d; %s; %s; %s; %s; %s; %d", id,PURPLE + surName + RESET, middleName, lastName,
                address, BLUE + numberOfCard + RESET, numberOfBank);
    }
}
