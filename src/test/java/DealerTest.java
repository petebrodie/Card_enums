import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    Dealer dealer;
    Deck deck;
    Player player;

    @Before public void setUp() {
        this.dealer = new Dealer();
        this.deck = new Deck();
        this.player = new Player();
    }

    @Test
    public void canDealCard() {
        dealer.dealerCard(deck, player);
        assertEquals(1, player.getHand());
        assertEquals(51, deck.getDeck());
    }
}

