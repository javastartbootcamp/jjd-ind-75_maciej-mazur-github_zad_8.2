package pl.javastart.task;

class Ticket {
    private final String eventName;
    private final Address eventAddress;
    private final TicketType type;
    private final double basePrice;
    private final double discount;
    private final int ticketNumber;
    private static int number = 121020231;

    Ticket(String eventName, Address eventAddress, TicketType type, double basePrice, double discount) {
        this.eventName = eventName;
        this.eventAddress = eventAddress;
        this.type = type;
        this.basePrice = basePrice;
        this.discount = discount;
        this.ticketNumber = number++;
    }

    String getEventName() {
        return eventName;
    }

    Address getEventAddress() {
        return eventAddress;
    }

    TicketType getType() {
        return type;
    }

    double getBasePrice() {
        return basePrice;
    }

    double getDiscount() {
        return discount;
    }

    int getTicketNumber() {
        return ticketNumber;
    }
}
