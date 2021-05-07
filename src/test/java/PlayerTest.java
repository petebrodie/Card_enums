import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Deck deck;
    Player player;
    PlayingCard card;

    @Before
    public void setUp() {
        deck = new Deck();
        player = new Player();
        card = new PlayingCard(Suit.HEARTS, Rank.ACE);
    }

    @Test
    public void canTakeCard() {
        player.addCardToHand(card);
        assertEquals(1, player.getHand());
    }



}
