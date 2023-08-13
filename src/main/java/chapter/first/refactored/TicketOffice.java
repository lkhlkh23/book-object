package chapter.first.refactored;

import java.util.List;
import java.util.Stack;

public class TicketOffice {

    private Long amount;
    private Stack<Ticket> tickets = new Stack<>();

    public TicketOffice(final Long amount, final List<Ticket> tickets) {
        this.amount = amount;
        this.tickets.addAll(tickets);
    }

    public Ticket getTicket() {
        return this.tickets.pop();
    }

    public void minusAmount(final Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(final Long amount) {
        this.amount += amount;
    }

}
