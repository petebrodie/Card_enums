import javax.smartcardio.Card;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<PlayingCard> cards;

    public Deck() {
        this.cards = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                PlayingCard card = new PlayingCard(suit, rank);
                this.cards.add(card);
            }
        }
        Collections.shuffle(this.cards);
    }

    public int getDeck() {
        return this.cards.size();
    }

    public PlayingCard dealCard() {
        return this.cards.remove(0);
    }
}
