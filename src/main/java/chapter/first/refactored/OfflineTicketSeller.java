package chapter.first.refactored;

public class OfflineTicketSeller implements TicketSeller {

    private TicketOffice ticketOffice;

    public OfflineTicketSeller(final TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public void sellTo(final Audience audience) {
        this.ticketOffice.plusAmount(audience.pay(this.ticketOffice.getTicket()));
    }
}
