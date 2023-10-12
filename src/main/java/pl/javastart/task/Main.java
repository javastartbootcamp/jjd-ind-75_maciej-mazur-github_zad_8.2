package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
//        OnlineTicket onlineTicket = new OnlineTicket("Czerwone Gitary",
//                new Address("Warszawa", "Aleje Jerozolimskie", "10c", ""),
//                100, 0.05, "old.fan@gmail.com");
//        StandardTicket standardTicket = new StandardTicket("Tiesto",
//                new Address("Gdańsk", "Długi targ", "100", ""),
//                100, 0.05,
//                new Address("Kraków", "Mariacka", "234", "5"));
//        GiftTicket giftTicket = new GiftTicket("Rolling Stones",
//                new Address("Kraków", "Rynek Główny", "", ""),
//                100, 0.05);

        Ticket onlineTicket = TicketCreator.createTicket();
        Ticket standardTicket = TicketCreator.createTicket();
        Ticket giftTicket = TicketCreator.createTicket();

        PriceCalculator.calculatePrice(onlineTicket);
        PriceCalculator.calculatePrice(standardTicket);
        PriceCalculator.calculatePrice(giftTicket);
    }
}
