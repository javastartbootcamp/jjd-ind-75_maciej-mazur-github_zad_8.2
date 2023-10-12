package pl.javastart.task;

class PriceCalculator {
    static void calculatePrice(Ticket ticket) {
        switch (ticket.getType()) {
            case ONLINE -> printOnlineTicketInfo(ticket);
            case STANDARD -> printStandardTicketInfo(ticket);
            case GIFT -> printGiftTicketInfo(ticket);
            default -> { }
        }
    }

    private static void printOnlineTicketInfo(Ticket ticket) {
        double priceAfterDiscount = (1 - ticket.getDiscount()) * ticket.getBasePrice();

        System.out.printf("Bilet Online: cena podstawowa %.2fzł, zniżka %d%%, cena finalna wyniesie %.2fzł%n",
                ticket.getBasePrice(),
                (int) (ticket.getDiscount() * 100),
                priceAfterDiscount);
    }

    private static void printStandardTicketInfo(Ticket ticket) {
        double priceAfterDiscount = (1 - ticket.getDiscount()) * ticket.getBasePrice();

        System.out.printf("Bilet Standard: cena podstawowa %.2fzł, " +
                        "zniżka %d%%, cena finalna wyniesie %.2fzł+5zł = %.2f%n",
                ticket.getBasePrice(),
                (int) (ticket.getDiscount() * 100),
                priceAfterDiscount,
                priceAfterDiscount + 5);
    }

    private static void printGiftTicketInfo(Ticket ticket) {
        double priceAfterDiscount = (1 - ticket.getDiscount()) * ticket.getBasePrice();
        int discountPercent = (int) (ticket.getDiscount() * 100);
        double finalPrice = priceAfterDiscount + 5 + ticket.getDiscount() * priceAfterDiscount;

        System.out.printf("Bilet Standard: cena podstawowa %.2fzł, " +
                        "zniżka %d%%, cena finalna wyniesie %.2fzł+5zł+(%d%%*%.2fzł) = %.2f%n",
                ticket.getBasePrice(),
                discountPercent,
                priceAfterDiscount,
                discountPercent,
                priceAfterDiscount,
                finalPrice);
    }
}
