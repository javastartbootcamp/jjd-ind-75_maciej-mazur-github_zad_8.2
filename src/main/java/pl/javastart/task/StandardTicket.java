package pl.javastart.task;

final class StandardTicket extends Ticket {
    private final Address recepientAddress;

    public StandardTicket(String eventName, Address eventAddress,
                          double basePrice, double discount, Address recepientAddress) {
        super(eventName, eventAddress, TicketType.STANDARD, basePrice, discount);
        this.recepientAddress = recepientAddress;
    }
}
