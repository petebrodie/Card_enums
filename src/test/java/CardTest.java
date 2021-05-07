import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {
    PlayingCard card;

    @Before
    public void setUp() {
        card = new PlayingCard(Suit.HEARTS, Rank.QUEEN);
    }

    @Test
    public void canGetSuit() {
        assertEquals(Suit.HEARTS, card.getSuit());
    }

    @Test
    public void canGetCardRank() {
        assertEquals(Rank.QUEEN, card.getRank());
    }

    @Test
    public void canGetValueOfARank() {
        assertEquals(10, card.getRankValue());
    }

//    @Test
//    public void canBeMispelled() {
//        PlayingCard mispelledCard = new PlayingCard("Heeaartss");
//        assertEquals("Heeaartss", mispelledCard.getSuit());
//    }
//
//    @Test
//    public void canHaveAWrongSuit() {
//        PlayingCard wrongSuit = new PlayingCard("Banana");
//        assertEquals("Banana", wrongSuit.getSuit());
//    }

}
