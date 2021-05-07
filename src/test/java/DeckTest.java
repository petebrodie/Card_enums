import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;

    @Before
    public void setUp() {
        deck = new Deck();
    }

    @Test
    public void deckStartsFullDeck() {
        assertEquals(52, deck.getDeck());
    }

    @Test
    public void dealCard() {
        deck.dealCard();
        assertEquals(51, deck.getDeck());
    }




}
