package pl.javastart.task;

final class GiftTicket extends Ticket {
    private final boolean hasArtistsAutograph = true;

    public GiftTicket(String eventName, Address eventAddress,
                      double basePrice, double discount) {
        super(eventName, eventAddress, TicketType.GIFT, basePrice, discount);
    }
}
