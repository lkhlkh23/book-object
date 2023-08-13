package chapter.first.refactored;

public class Bag implements Container{

    private Long amount;
    private Invitation invitation;
    private Ticket ticket;

    public Bag(final Long amount) {
        this(null, amount);
    }

    public Bag(final Invitation invitation, final Long amount) {
        this.amount = amount;
        this.invitation = invitation;
    }

    public long hold(final Ticket ticket) {
        this.setTicket(ticket);
        if(this.hasInvitation()) {
            return 0;
        }

        final long fee = ticket.getFee();
        this.minusAmount(fee);

        return fee;
    }

    private boolean hasInvitation() {
        return invitation != null;
    }

    private void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    private void minusAmount(final Long amount) {
        this.amount -= amount;
    }

    private void plusAmount(final Long amount) {
        this.amount += amount;
    }

}
