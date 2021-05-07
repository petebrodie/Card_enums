import java.util.ArrayList;

public class Player {

    private ArrayList<PlayingCard> hand;

    public Player() {
        this.hand = new ArrayList<>();
    }

    public int getHand() {
        return this.hand.size();
    }

    public void addCardToHand(PlayingCard card) {
        this.hand.add(card);
    }
}
