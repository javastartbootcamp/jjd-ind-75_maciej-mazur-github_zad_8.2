package pl.javastart.task;

class TicketInformer {
    static String getTicketInfo(Ticket ticket) {
        return switch (ticket.getType()) {
            case ONLINE -> getOnlineTicketInfo(ticket);
            case STANDARD -> getStandardTicketInfo(ticket);
            case GIFT -> getGiftTicketInfo(ticket);
        };
    }

    private static String getOnlineTicketInfo(Ticket ticket) {
        return String.format("Bilet Online: cena podstawowa %.2fzł, zniżka %d%%, cena finalna wyniesie %.2fzł%n",
                ticket.getBasePrice(),
                (int) (ticket.getDiscount() * 100),
                PriceCalculator.calculatePrice(ticket));
    }

    private static String getStandardTicketInfo(Ticket ticket) {
        double priceAfterDiscount = PriceCalculator.calculatePrice(ticket);
        return String.format("Bilet Standard: cena podstawowa %.2fzł, " +
                        "zniżka %d%%, cena finalna wyniesie %.2fzł+5zł = %.2f%n",
                ticket.getBasePrice(),
                (int) (ticket.getDiscount() * 100),
                priceAfterDiscount,
                priceAfterDiscount + 5);
    }

    private static String getGiftTicketInfo(Ticket ticket) {
        double priceAfterDiscount = (1 - ticket.getDiscount()) * ticket.getBasePrice();
        int discountPercent = (int) (ticket.getDiscount() * 100);
        double finalPrice = PriceCalculator.calculatePrice(ticket);

        return String.format("Bilet Standard: cena podstawowa %.2fzł, " +
                        "zniżka %d%%, cena finalna wyniesie %.2fzł+5zł+(%d%%*%.2fzł) = %.2f%n",
                ticket.getBasePrice(),
                discountPercent,
                priceAfterDiscount,
                discountPercent,
                priceAfterDiscount,
                finalPrice);
    }
}
