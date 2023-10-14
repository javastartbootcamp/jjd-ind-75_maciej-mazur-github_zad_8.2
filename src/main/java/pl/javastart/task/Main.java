package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
//        Ticket onlineTicket = new Ticket("Czerwone Gitary",
//                new Address("Warszawa", "Aleje Jerozolimskie", "10c", ""),
//                TicketType.ONLINE, 100, 0.05);
//        Ticket standardTicket = new Ticket("Tiesto",
//                new Address("Gdańsk", "Długi targ", "100", ""),
//                TicketType.STANDARD, 100, 0.05);
//        Ticket giftTicket = new Ticket("Rolling Stones",
//                new Address("Kraków", "Rynek Główny", "", ""),
//                TicketType.GIFT, 100, 0.05);

        Ticket onlineTicket = TicketCreator.createTicket();
        Ticket standardTicket = TicketCreator.createTicket();
        Ticket giftTicket = TicketCreator.createTicket();

        System.out.println(TicketInformer.getTicketInfo(onlineTicket));
        System.out.println(TicketInformer.getTicketInfo(standardTicket));
        System.out.println(TicketInformer.getTicketInfo(giftTicket));
    }
}
