package pl.javastart.task;

class PriceCalculator {
    static double calculatePrice(Ticket ticket) {
        return switch (ticket.getType()) {
            case ONLINE -> calculateOnlineTicketPrice(ticket);
            case STANDARD -> calculateStandardTicketPrice(ticket);
            case GIFT -> calculateGiftTicketPrice(ticket);
        };
    }

    private static double calculateOnlineTicketPrice(Ticket ticket) {
        return  (1 - ticket.getDiscount()) * ticket.getBasePrice();
    }

    private static double calculateStandardTicketPrice(Ticket ticket) {
        return  (1 - ticket.getDiscount()) * ticket.getBasePrice();
    }

    private static double calculateGiftTicketPrice(Ticket ticket) {
        double priceAfterDiscount = (1 - ticket.getDiscount()) * ticket.getBasePrice();
        return priceAfterDiscount + 5 + ticket.getDiscount() * priceAfterDiscount;
    }
}
