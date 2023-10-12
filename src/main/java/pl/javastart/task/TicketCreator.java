package pl.javastart.task;

import java.util.Scanner;

class TicketCreator {
    private static final Scanner sc = new Scanner(System.in);

    static Ticket createTicket() {
        TicketType type = getTicketTypeFromUser();

        System.out.print("Podaj nazwę wydarzenia: ");
        String eventName = sc.nextLine();

        System.out.println("Podaj adres wydarzenia:");
        Address eventAddress = getAddress();

        System.out.print("Podaj cenę podstawową: ");
        double basePrice = sc.nextDouble();
        sc.nextLine();

        double discount = getDiscount();
        Ticket ticket = null;

        switch (type) {
            case ONLINE -> {
                System.out.print("Podaj adres email odbiorcy: ");
                String email = sc.nextLine();
                ticket = new OnlineTicket(eventName, eventAddress, basePrice, discount, email);
            }
            case STANDARD -> {
                System.out.println("Podaj adres odbiorcy:");
                Address recipientAddress = getAddress();
                ticket = new StandardTicket(eventName, eventAddress, basePrice, discount, recipientAddress);
            }
            case GIFT -> {
                ticket = new GiftTicket(eventName, eventAddress, basePrice, discount);
            }
            default -> { }
        }

        return ticket;
    }

    private static Address getAddress() {
        System.out.print("\tMiasto: ");
        String city = sc.nextLine();

        System.out.print("\tUlica: ");
        String street = sc.nextLine();

        System.out.print("\tNr budynku: ");
        String buildingNo = sc.nextLine();

        System.out.print("\tNr lokalu: ");
        String apartmentNo = sc.nextLine();

        return new Address(city, street, buildingNo, apartmentNo);
    }

    private static double getDiscount() {
        System.out.print("Podaj wysokość zniżki (w procentach): ");
        int discountPercent = sc.nextInt();
        sc.nextLine();
        return ((double) discountPercent) / 100;
    }

    private static TicketType getTicketTypeFromUser() {
        System.out.println("Który typ biletu wybierasz? ");
        printTypeOptions();
        int usersChoice = sc.nextInt();
        sc.nextLine();

        while (usersChoice < 1 || usersChoice > 3) {
            System.out.println("Wpisałeś nieprawidłową liczbę, spróbuj jeszcze raz.");
            printTypeOptions();
            usersChoice = sc.nextInt();
            sc.nextLine();
        }

        switch (usersChoice) {
            case 1 -> {
                return TicketType.ONLINE;
            }
            case 2 -> {
                return TicketType.STANDARD;
            }
            default -> {
                return TicketType.GIFT;
            }
        }
    }

    private static void printTypeOptions() {
        System.out.println("\t1 - online\n\t2 - standard\n\t3 - gift");
        System.out.print("Który typ wybierasz? ");
    }
}
