package pl.javastart.task;

final class OnlineTicket extends Ticket {
    private final String recipientEmail;

    public OnlineTicket(String eventName, Address eventAddress,
                        double basePrice, double discount, String recipientEmail) {
        super(eventName, eventAddress, TicketType.ONLINE, basePrice, discount);
        this.recipientEmail = recipientEmail;
    }
}
