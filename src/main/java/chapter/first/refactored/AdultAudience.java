package chapter.first.refactored;

public class AdultAudience implements Audience {

    private Bag bag;

    public AdultAudience(final Bag bag) {
        this.bag = bag;
    }

    @Override
    public long pay(final Ticket ticket) {
        return this.bag.hold(ticket);
    }

}
